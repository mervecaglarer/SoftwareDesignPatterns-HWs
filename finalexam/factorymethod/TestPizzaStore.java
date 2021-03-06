package finalexam.factorymethod;

public class TestPizzaStore {
    public static void main(String... args){

        NYPizzaStore NYps1 = new NYPizzaStore();
        NYps1.orderPizza("cheese");

        NYPizzaStore NYps2 = new NYPizzaStore();
        NYps2.orderPizza("veggie");

        ChicagoPizzaStore Cps1 = new ChicagoPizzaStore();
        Cps1.orderPizza("cheese"); 

        ChicagoPizzaStore Cps2 = new ChicagoPizzaStore();
        Cps2.orderPizza("veggie");
    } 
}
