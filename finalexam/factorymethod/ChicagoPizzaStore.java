package finalexam.factorymethod;

public class ChicagoPizzaStore extends PizzaStore{

    PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        String name = "Chicago Style";
        if (type.equals("cheese")){
            pizza = new CheesePizza(name, ingredientFactory);
        }else if (type.equals("veggie")) {
            pizza = new VeggiePizza(name, ingredientFactory);
        }else{
            return null;
        }
        return pizza;
    }
}
