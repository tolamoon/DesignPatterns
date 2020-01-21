package factory_method.ingredients.sponge_cake;

import factory_method.ingredients.SpongeCake;

public class WhiteSpongeCake extends SpongeCake {
    private String whiteSpon = "White sponge cake";
    @Override
    public String getSpongeCake() {
        return whiteSpon;
    }
}
