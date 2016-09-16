package factory;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FactoryPackageTest {
    PizzaStore store;

    @Before
    public void setUp() {
        store = new NYPizzaStore();
    }

    @After
    public void tearDown() {
        store = null;
    }

    @Test
    public void testNYCheesePizza() throws UnknownPizzaTypeException {
        Pizza pizza = store.orderPizza("cheese");

        assertTrue(pizza instanceof NYCheesePizza);
    }

    @Test
    public void testNYVeggiePizza() throws UnknownPizzaTypeException {
        Pizza pizza = store.orderPizza("veggie");

        assertTrue(pizza instanceof NYVeggiePizza);
    }

    @Test
    public void testNYPepperoniPizza() throws UnknownPizzaTypeException {
        Pizza pizza = store.orderPizza("pepperoni");

        assertTrue(pizza instanceof NYPepperoniPizza);
    }

    @Test(expected = UnknownPizzaTypeException.class)
    public void testNYUnknownPizzaType() throws UnknownPizzaTypeException {
        store.orderPizza("a");
    }
}
