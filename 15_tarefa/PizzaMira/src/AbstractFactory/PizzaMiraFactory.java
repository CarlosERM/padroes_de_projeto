package AbstractFactory;

import java.nio.charset.Charset;
import java.util.Random;

public class PizzaMiraFactory implements IMiraFactory {

    @Override
    public AbstractDrink createDrink() {
        String id = generateRandomId();
        return new CocaCula(id);
    }

    @Override
    public AbstractPizza createPizza() {
        String id = generateRandomId();
        return new Pizza(id);
    }

    public String generateRandomId() {
        byte[] array = new byte[7]; 
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }
}
