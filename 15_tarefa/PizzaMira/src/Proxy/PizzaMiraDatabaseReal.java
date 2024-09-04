package Proxy;

import java.util.HashMap;
import java.util.Map;

import Decorator.IRecheio;


public class PizzaMiraDatabaseReal implements IPizzaMiraDatabase {
    Map<String, IRecheio> map = new HashMap<String, IRecheio>();

    @Override
    public void connectToDatabase(String ip) {
        System.out.println("Connecting to the database... Host with " + ip);
    }

    @Override
    public void putProduct(IRecheio product) {
        map.put(product.getId(), product);
    }

    @Override
    public IRecheio getProduct(String id) {
        return map.get(id);
    }
}
