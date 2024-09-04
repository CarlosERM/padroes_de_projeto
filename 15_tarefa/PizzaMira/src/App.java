import AbstractFactory.PizzaMiraFactory;
import Decorator.IRecheio;
import Decorator.RecheioChocolateDecorator;
import Proxy.IPizzaMiraDatabase;
import Proxy.PizzaMiraDatabaseProxy;

public class App {
    public static void main(String[] args) throws Exception {
        // Primeiro eu crio o meu produto utilizando Abstract Factory.
        PizzaMiraFactory pizzaFactory = new PizzaMiraFactory();
        IRecheio pizza = pizzaFactory.createPizza();
    
        // Depois eu adiciono um recheio no meu produto utilizando o decorator.
        IRecheio pizzaChocolate = new RecheioChocolateDecorator(pizza);
        pizzaChocolate.descreverRecheio();

        // Adiciono o produto no servidor através do proxy.
        IPizzaMiraDatabase proxyBanco = new PizzaMiraDatabaseProxy();
        proxyBanco.connectToDatabase("www.google.com.br");
        proxyBanco.putProduct(pizza);
        proxyBanco.getProduct(pizza.getId()).descreverRecheio();

        // Banindo um endereço
        PizzaMiraDatabaseProxy.BANNED.add("www.google.com.br");
        proxyBanco.connectToDatabase("www.google.com.br");

    }
}
