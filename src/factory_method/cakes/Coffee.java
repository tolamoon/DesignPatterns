package factory_method.cakes;

import factory_method.Cake;
import factory_method.ingredients.ingredient_type.CoffeeIngredients;

import static factory_method.Size.BIG;
import static factory_method.Size.MEDIUM;
import static factory_method.Size.SMALL;

public class Coffee extends Cake {
    public Coffee(){
        this.ingredients = new CoffeeIngredients();

        prices.put(SMALL, 22);
        prices.put(MEDIUM, 27);
        prices.put(BIG, 32);
    }
    @Override
    protected void addIngredients() {
        spongeCake = ingredients.makeSpongeCake();
        cream = ingredients.makeCream();
        mainIngr = ingredients.makeMainIngredient();
    }
}
