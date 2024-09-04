package Proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Decorator.IRecheio;

public class PizzaMiraDatabaseProxy implements IPizzaMiraDatabase{
    public static List<String> BANNED = new ArrayList<String>();
    Map<String, IRecheio> cache = new HashMap<String, IRecheio>();
    IPizzaMiraDatabase database = new PizzaMiraDatabaseReal();

    @Override
    public void connectToDatabase(String ip) {
        if(!BANNED.contains(ip)) {
            database.connectToDatabase(ip);
            return;
        }
        System.out.println("BANNED!: " + ip);
    }

    @Override
    public void putProduct(IRecheio product) {
        database.putProduct(product);
    }

    @Override
    public IRecheio getProduct(String id) {
        if(!cache.containsKey(id)) {
            cache.put(id, database.getProduct(id));
        }
        return cache.get(id);
    }


}
