package factory_method.ingredients.ingredient_type;

import factory_method.ingredients.Cream;
import factory_method.ingredients.Ingredients;
import factory_method.ingredients.MainIngredient;
import factory_method.ingredients.SpongeCake;
import factory_method.ingredients.creams.StrawberryCream;
import factory_method.ingredients.main_ingredient.Strawberry;
import factory_method.ingredients.sponge_cake.WhiteSpongeCake;

public class StrawberryIngredients implements Ingredients {

    @Override
    public Cream makeCream() {
        return new StrawberryCream();
    }

    @Override
    public MainIngredient makeMainIngredient() {
        return new Strawberry();
    }

    @Override
    public SpongeCake makeSpongeCake() {
        return new WhiteSpongeCake();
    }
}
