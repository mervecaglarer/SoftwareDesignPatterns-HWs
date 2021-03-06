package finalexam.factorymethod;

public class VeggiePizza extends Pizza {

    public VeggiePizza(String name, PizzaIngredientFactory ingredientFactory){
        super(name, ingredientFactory.createDough(), ingredientFactory.createSauce(), ingredientFactory.createToppings());
    }

    @Override
    public void prepare() {
        System.out.println(name + " Veggie Pizza is preparing.");
    }
}
