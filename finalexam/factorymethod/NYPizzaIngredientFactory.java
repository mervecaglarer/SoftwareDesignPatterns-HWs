package finalexam.factorymethod;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Toppings createToppings() {
        return new Corn();
    }   
}
