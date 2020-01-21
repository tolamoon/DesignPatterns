package factory_method.cakes;

import factory_method.Cake;
import factory_method.ingredients.ingredient_type.ChocolateIngredients;

import static factory_method.Size.BIG;
import static factory_method.Size.MEDIUM;
import static factory_method.Size.SMALL;

public class Chocolate extends Cake {

    public Chocolate(){
        this.ingredients = new ChocolateIngredients();

        prices.put(SMALL, 20);
        prices.put(MEDIUM, 25);
        prices.put(BIG, 30);
    }
    @Override
    protected void addIngredients() {
        spongeCake = ingredients.makeSpongeCake();
        cream = ingredients.makeCream();
        mainIngr = ingredients.makeMainIngredient();
    }
}
