package factory_method.ingredients.ingredient_type;

import factory_method.ingredients.Cream;
import factory_method.ingredients.Ingredients;
import factory_method.ingredients.MainIngredient;
import factory_method.ingredients.SpongeCake;
import factory_method.ingredients.creams.CoffeCream;
import factory_method.ingredients.main_ingredient.Coffee;
import factory_method.ingredients.sponge_cake.DarkSpongeCake;

public class CoffeeIngredients implements Ingredients {

    @Override
    public Cream makeCream() {
        return new CoffeCream();
    }

    @Override
    public MainIngredient makeMainIngredient() {
        return new Coffee();
    }

    @Override
    public SpongeCake makeSpongeCake() {
        return new DarkSpongeCake();
    }
}
