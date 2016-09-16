package decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import helper.Cents;

public class DecoratorPackageTest {
    @Test
    public void testPriceOfHouseBlend() {
        Beverage beverage = new HouseBlend();

        assertEquals(new Cents(89), beverage.cost());
    }

    @Test
    public void testPriceOfMochaHouseBlend() {
        Beverage beverage = new Mocha(new HouseBlend());

        assertEquals(new Cents(109), beverage.cost());
    }

    @Test
    public void testPriceOfWhipHouseBlend() {
        Beverage beverage = new Whip(new HouseBlend());

        assertEquals(new Cents(99), beverage.cost());
    }

    @Test
    public void testPriceOfWhipMochaHouseBlend() {
        Beverage beverage = new Whip(new Mocha(new HouseBlend()));

        assertEquals(new Cents(119), beverage.cost());
    }

    @Test
    public void testPriceOfDoubleMochaHouseBlend() {
        Beverage beverage = new Mocha(new Mocha(new HouseBlend()));

        assertEquals(new Cents(129), beverage.cost());
    }

    @Test
    public void testPriceOfEspresso() {
        Beverage beverage = new Espresso();

        assertEquals(new Cents(199), beverage.cost());
    }

    @Test
    public void testDescriptionOfHouseblend() {
        Beverage beverage = new HouseBlend();

        assertEquals("House Blend Coffee", beverage.getDescription());
    }

    @Test
    public void testDescriptionOfEspresso() {
        Beverage beverage = new Espresso();

        assertEquals("Espresso", beverage.getDescription());
    }

    @Test
    public void testDescriptionOfMochaHouseblend() {
        Beverage beverage = new Mocha(new HouseBlend());

        assertEquals("House Blend Coffee, Mocha", beverage.getDescription());
    }

    @Test
    public void testDescriptionOfDoubleMochaHouseblend() {
        Beverage beverage = new Mocha(new Mocha(new HouseBlend()));

        assertEquals("House Blend Coffee, Mocha, Mocha",
                beverage.getDescription());
    }

    @Test
    public void testDescriptionOfWhipMochaHouseblend() {
        Beverage beverage = new Whip(new Mocha(new HouseBlend()));

        assertEquals("House Blend Coffee, Mocha, Whip",
                beverage.getDescription());
    }
}
