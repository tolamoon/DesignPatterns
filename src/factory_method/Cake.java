package factory_method;

import factory_method.cakes.Chocolate;
import factory_method.cakes.Coffee;
import factory_method.cakes.Strawberry;
import factory_method.ingredients.Cream;
import factory_method.ingredients.Ingredients;
import factory_method.ingredients.MainIngredient;
import factory_method.ingredients.SpongeCake;

import java.util.HashMap;
import java.util.Map;

import static factory_method.Taste.*;

public abstract class Cake {

    protected Ingredients ingredients;
    protected Map<String, Integer> prices = new HashMap<>();
    protected String name;
    protected Integer price;
    protected MainIngredient mainIngr;
    protected Cream cream;
    protected SpongeCake spongeCake;

    protected void setName(String name) {
        this.name = name;
    }

    protected void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public MainIngredient getMainIngr() {
        return mainIngr;
    }

    public Cream getCream() {
        return cream;
    }

    public SpongeCake getSpongeCake() {
        return spongeCake;
    }

    public static Cake addCake(String taste, String size) {
        Cake cake = null;

        switch (taste) {
            case CHOCOLATE:
                cake = new Chocolate();
                break;
            case COFFEE:
                cake = new Coffee();
                break;
            case STRAWBERRY:
                cake = new Strawberry();
                break;
        }

        cake.prepare(size, taste);
        return cake;
    }

    private void prepare(String size, String taste) {
        addIngredients();
        price = prices.get(size);
        name = size + " " + taste;
    }

    protected abstract void addIngredients();

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", mainIngredient=" + mainIngr.getMainIn() +
                ", cream=" + cream.getCream() +
                ", spongeCake=" + spongeCake.getSpongeCake() +
                '}';
    }
}
