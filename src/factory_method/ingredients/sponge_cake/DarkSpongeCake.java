package factory_method.ingredients.sponge_cake;

import factory_method.ingredients.SpongeCake;

public class DarkSpongeCake extends SpongeCake {
    private String darkSpon = "Dark sponge cake";
    @Override
    public String getSpongeCake() {
        return darkSpon;
    }
}
