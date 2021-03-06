package finalexam.factorymethod;

public abstract class  Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Toppings toppings;

    public abstract void prepare();

    public void bake(){
        System.out.println("Pizza is being baked.");
    }

    public void cut(){
        System.out.println("Pizza is being cut.");
    }

    public void box(){
        System.out.println("Pizza is being boxed.");
    }

    public Pizza(String name, Dough dough, Sauce sauce, Toppings toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

	@Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }

    public String getName() {
        return name;
    }
}