public class ShopApp {
    private static double total = 0;

    private static int measurement = 3;


    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setSize("s");
        customer.setName("Pinky");
        System.out.println(customer.getSize());

        if (measurement == 3) customer.setSize("s");
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                customer.setSize("s");
            break;
            case 4:
            case 5:
            case 6:
                customer.setSize("m");
            break;
            case 7:
            case 8:
            case 9:
                customer.setSize("l");
            break;

            default:
                customer.setSize("x");

        }

        Clothing c1 = new Clothing();
        c1.setPrice(12.33);
        c1.setType("pant");
        Clothing c2 = new Clothing();
        c2.setPrice(100);
        c2.setType("blouse");
        Clothing c3 = new Clothing();
        c3.setPrice(99.99);
        c3.setType("jacket");

        Clothing[] basket = new Clothing[3];

        basket[0] = c1;
        basket[1] = c2;
        basket[2] = c3;

        for (int idx = 0; idx < basket.length; idx++){
            Clothing c = basket[idx];
            total=total+ c.getPrice();
            total=total+ c.getPrice();

        }

        System.out.println("total = " + total);
    }

}
