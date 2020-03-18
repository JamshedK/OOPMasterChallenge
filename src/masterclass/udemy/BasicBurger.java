package masterclass.udemy;

public class BasicBurger {

    private String meat;
    private String rollType;

    // additional items
    private String tomato;
    private int tomatoPrice;

    private String carrot;
    private int carrotPrice;

    private String ketchup;
    private int ketchupPrice;

    private String lettuce;
    private int lettucePrice;

    private double priceForNormal;
    private double totalPrice;

    public BasicBurger(String meat, String rollType, double price ){
        this.meat = meat;
        this.rollType = rollType;
        this.priceForNormal = price;
        this.totalPrice += price;
    }

    public void addAdditionalItem(String name, int price){
        boolean isItemAdded = false;
        // adds a maximum of 4 items
            switch (name.toLowerCase()) {
                case "carrot":
                    this.carrot = name;
                    this.carrotPrice = price;
                    break;
                case "tomato":
                    this.tomato = name;
                    this.tomatoPrice = price;
                    break;
                case "lettuce":
                    this.lettuce = name;
                    this.lettucePrice = price;
                    break;
                case "ketchup":
                    this.ketchup = name;
                    this.ketchupPrice = price;
                    break;
            }
            totalPrice += price;

    }

    private String getCarrot() {
        if(carrot == null){
            return "";
        }
        return carrot + " ( price: " + carrotPrice + " ), ";
    }

    private String getTomato() {
        if(tomato == null){
            return "";
        }
        return tomato + " ( price: " + tomatoPrice + " ), ";
    }

    private String getLettuce() {
        if(lettuce == null){
            return "";
        }
        return lettuce + " ( price: " + lettucePrice + " ), ";
    }

    private String getKetchup() {
        if(ketchup == null){
            return "";
        }
        return ketchup + " ( price: " + ketchupPrice + " ), ";
    }

    public String getMeat() {
        return meat;
    }

    public String getRollType() {
        return rollType;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice){
        this.totalPrice = totalPrice;
    }

    public double getPriceForNormal() {
        return priceForNormal;
    }

    public void printBurgerInfo(){
        System.out.println("Roll type:" + getRollType());
        System.out.println("Meat type: " + getMeat());
        System.out.println("Price for basic burger: " + priceForNormal);
        System.out.print(getCarrot());
        System.out.print(getKetchup());
        System.out.print(getLettuce());
        System.out.print(getTomato());
    }
}
