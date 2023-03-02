package DesignPattern.FactoryPattern;
public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory;

    PizzaStore(SimplePizzaFactory factory){
        simplePizzaFactory = factory;
    }

    void orderPizza(int i){
        Pizza pizza = this.simplePizzaFactory.createPizza(i);
        System.out.println("Order Pizza:" + pizza);
    };
}
