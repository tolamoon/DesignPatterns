package factory_method;

import static factory_method.Size.BIG;
import static factory_method.Size.MEDIUM;
import static factory_method.Size.SMALL;
import static factory_method.Taste.CHOCOLATE;
import static factory_method.Taste.COFFEE;
import static factory_method.Taste.STRAWBERRY;

public class OrderTest {
    public static void main(String[] args){
        Order order = new Order();
        order.addAddress("personal pickup");
        order.addCakes(CHOCOLATE, 2, SMALL);
        order.addCakes(COFFEE, 1, BIG);
        order.addCakes(STRAWBERRY, 1, MEDIUM);

        order.showOrder();
    }
}
