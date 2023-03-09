package DesignPattern.FactoryPattern;

public class NYCFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(int i) {
        Pizza pizza = null;
        if(i == 1){
            pizza = new  NYCPizzaX1();
        }
        return pizza;
    }
}
