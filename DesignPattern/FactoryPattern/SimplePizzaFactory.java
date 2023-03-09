package DesignPattern.FactoryPattern;

public class SimplePizzaFactory {
    
    public Pizza createPizza(int i){
        Pizza pizza = null;
        if(i == 1){
            pizza = new PizzaX1();
            pizza.chuan_bi();
            pizza.nuong_banh();
            pizza.cat_banh();
            pizza.dong_hop();
        }
        if(i == 2){
            pizza = new PizzaX2();
            pizza.chuan_bi();
            pizza.nuong_banh();
            pizza.cat_banh();
            pizza.dong_hop();
        }
        
        return pizza;
    }
}
