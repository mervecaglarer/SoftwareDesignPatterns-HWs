package finalexam.factorymethod;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Toppings createToppings();
}
