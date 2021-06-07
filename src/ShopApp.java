public class ShopApp {

    private static int measurement = 3;


    public static void main(String[] args) {

        Customer customer = new Customer("Pinky", 3);
        System.out.println(customer.getSize());

        Clothing c1 = new Clothing("pant", 12.33 , "s");
        Clothing c2 = new Clothing("blouse", 8 , "l");
        Clothing c3 = new Clothing("jacket", 99.99 , "m");

        Clothing[] basket = new Clothing[3];

        basket[0] = c1;
        basket[1] = c2;
        basket[2] = c3;

        customer.addItems(basket);

        System.out.println("Total=" + customer.getTotalClothingCost());

        System.out.println("minimum price=" + Clothing.MIN_PRICE);

    }

}
