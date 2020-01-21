package factory_method.ingredients.creams;

import factory_method.ingredients.Cream;

public class ChocolateCream extends Cream {
    private String chocCream = "Chocolate cream";
    @Override
    public String getCream() {
        return chocCream;
    }
}
