package masterclass.udemy;

public class HealthyBurger extends BasicBurger {

    private String  cucumber;
    private int cucumberPrice;

    private String cabbage;
    private int cabbagePrice;

    public HealthyBurger(String meat, double price) {
        super(meat, "Brown", price);
    }

    @Override
    public void addAdditionalItem(String name, int price) {
        super.addAdditionalItem(name, price);
        double totalPrice = getTotalPrice();

            switch (name.toLowerCase()){
                case "cucumber":
                    this.cucumber = name;
                    this.cucumberPrice = price;
                    break ;
                case "cabbage":
                    this.cabbage = name;
                    this.cabbagePrice = price;
                    break;
            }
            totalPrice += price;
        setTotalPrice(totalPrice);
    }

    private String getCucumber() {
        if(cucumber == null){
            return "";
        }
        return cucumber + " ( price: " + cucumberPrice + " ), ";
    }

    private String getCabbage() {
        if(cabbage == null){
            return "";
        }
        return cabbage + " ( price: " + cabbagePrice + " ), ";
    }

    @Override
    public void printBurgerInfo() {
        super.printBurgerInfo();
        System.out.println(getCabbage());
        System.out.println(getCucumber());
    }
}
