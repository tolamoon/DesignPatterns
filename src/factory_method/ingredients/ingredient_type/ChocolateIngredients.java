package factory_method.ingredients.ingredient_type;

import factory_method.ingredients.Cream;
import factory_method.ingredients.Ingredients;
import factory_method.ingredients.MainIngredient;
import factory_method.ingredients.SpongeCake;
import factory_method.ingredients.creams.ChocolateCream;
import factory_method.ingredients.main_ingredient.Chocolate;
import factory_method.ingredients.sponge_cake.DarkSpongeCake;

public class ChocolateIngredients implements Ingredients {

    @Override
    public Cream makeCream() {
        return new ChocolateCream();
    }

    @Override
    public MainIngredient makeMainIngredient() {
        return new Chocolate();
    }

    @Override
    public SpongeCake makeSpongeCake() {
        return new DarkSpongeCake();
    }
}
