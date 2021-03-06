package finalexam.factorymethod;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Toppings createToppings() {
        return new Mushroom();
    }
}
