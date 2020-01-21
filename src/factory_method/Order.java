package factory_method;

import java.util.ArrayList;

public class Order {
    private ArrayList<Cake> cakes = new ArrayList<>();
    private String address;

    public void addCakes(String taste, Integer number, String size){
        for(int i=0; i<number; i++){
            Cake cake = Cake.addCake(taste, size);
            cakes.add(cake);
        }
    }

    public void showOrder(){
        Integer sum = 0;
        System.out.println("Your order: ");

        for(Cake cake:cakes){
            sum += cake.getPrice();
            System.out.println(cake);
        }

        if(!address.equals("personal pickup")){
            sum += 10;
        }

        System.out.println("Delivery address: " +  address);
        System.out.println("Total price: " + sum);
    }

    public void addAddress(String deliveryAddress){
        this.address = deliveryAddress;
    }
}
