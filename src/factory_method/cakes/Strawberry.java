package factory_method.cakes;

import factory_method.Cake;
import factory_method.ingredients.ingredient_type.StrawberryIngredients;

import static factory_method.Size.BIG;
import static factory_method.Size.MEDIUM;
import static factory_method.Size.SMALL;

public class Strawberry extends Cake {
    public Strawberry(){
        this.ingredients = new StrawberryIngredients();

        prices.put(SMALL, 25);
        prices.put(MEDIUM, 30);
        prices.put(BIG, 35);
    }
    @Override
    protected void addIngredients() {
        spongeCake = ingredients.makeSpongeCake();
        cream = ingredients.makeCream();
        mainIngr = ingredients.makeMainIngredient();
    }
}
