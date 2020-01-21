package factory_method.ingredients.creams;

import factory_method.ingredients.Cream;

public class CoffeCream extends Cream {
    private String coffCream = "Coffee cream";
    @Override
    public String getCream() {
        return coffCream;
    }
}
