package lab.assignment.afterrefactoring.clientcode;

import lab.assignment.afterrefactoring.CoffeeMakerTemplate;
import lab.assignment.afterrefactoring.MochaCoffeeMaker;
import lab.assignment.afterrefactoring.CapuccinoCoffeeMaker;
import lab.assignment.afterrefactoring.AmericanoCoffeeMaker;

public class CoffeeClient {

    public static void main(String[] args) {
        CoffeeMakerTemplate starbuzz = new MochaCoffeeMaker();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new CapuccinoCoffeeMaker();
        starbuzz.prepareCoffee();

        System.out.println("********************");

        starbuzz = new AmericanoCoffeeMaker();
        starbuzz.prepareCoffee();

    }

}
