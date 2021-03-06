package finalexam.factorymethod;

public class CheesePizza extends Pizza {

    public CheesePizza(String name, PizzaIngredientFactory ingredientFactory) {
        super(name, ingredientFactory.createDough(), ingredientFactory.createSauce(), ingredientFactory.createToppings());
    }

    @Override
    public void prepare() {
        System.out.println(name + " Cheese Pizza is preparing.");
    }
}
