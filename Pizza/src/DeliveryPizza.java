public class DeliveryPizza extends Pizza
{
    double deliveryFee;
    String adress;
    public DeliveryPizza(String description, double price, String adress){
        super(description, price);
        this.adress = adress;
        if(price > 15)
            deliveryFee = 3;
        else
            deliveryFee = 5;
    }

    public void display(){
        display();
        System.out.println("    Deliver to: " + adress + " Fee is " + deliveryFee);
    }
}
