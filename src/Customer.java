public class Customer {
    private String name;
    private String size;
    private Clothing[] items = new Clothing[5];


    public Customer(String name, int size) {
        this.name = name;
        setSize(size);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public void setSize(int sizeNumber) {
        size = sizeNumber + "";

        switch (sizeNumber) {
            case 1:
            case 2:
            case 3:
                size = "s";
                break;
            case 4:
            case 5:
            case 6:
                size = "m";
                break;
            case 7:
            case 8:
            case 9:
                size = "l";
                break;

            default:
                size = "x";


        }
    }

    public void addItems(Clothing[] itemsToAdd) {
        items = itemsToAdd;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {
        double total = 0;
        for (int idx = 0; idx < items.length; idx++){
            Clothing c = items[idx];
            total=total+ c.getPrice();
        }
        return total;
    }

}
