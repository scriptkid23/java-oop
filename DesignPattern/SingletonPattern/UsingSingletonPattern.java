package DesignPattern.SingletonPattern;

public class UsingSingletonPattern {
 public static void main(String[] args) {
    SingletonPattern pattern = SingletonPattern.getInstance();
    pattern.whoami();

 }   
}
