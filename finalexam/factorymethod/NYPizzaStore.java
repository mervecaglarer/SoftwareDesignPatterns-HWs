package finalexam.factorymethod;

public class NYPizzaStore extends PizzaStore{

    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        String name = "NY Style";
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