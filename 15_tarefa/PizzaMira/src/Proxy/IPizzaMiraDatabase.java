package Proxy;

import Decorator.IRecheio;

public interface IPizzaMiraDatabase {
    void connectToDatabase(String ip);
    void putProduct(IRecheio product);
    IRecheio getProduct(String id);
}
