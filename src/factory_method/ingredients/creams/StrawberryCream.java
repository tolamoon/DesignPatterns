package factory_method.ingredients.creams;

import factory_method.ingredients.Cream;

public class StrawberryCream extends Cream {
    private String straCream = "Strawberry cream";
    @Override
    public String getCream() {
        return straCream;
    }
}
