package masterclass.udemy;

public class DeluxeBurger extends BasicBurger {
    private String chips;
    private int chipsPrice;
    private String drinks;
    private int drinksPrice;

    public DeluxeBurger(String meat, String rollType, double price, String chips, int chipsPrice, String drinks, int drinksPrice) {
        super(meat, rollType, price);
        this.drinks = drinks;
        this.drinksPrice = drinksPrice;
        this.chips = chips;
        this.chipsPrice = chipsPrice;
        setTotalPrice(getTotalPrice() + chipsPrice + drinksPrice);
    }

    @Override
    public void addAdditionalItem(String name, int price) {
        System.out.println("No more items can be added");
    }

    public void printBurgerInfo(){
        System.out.println("Roll type:" + getRollType());
        System.out.println("Meat type: " + getMeat());
        System.out.println("Price for basic burger: " + getPriceForNormal());
        System.out.print(chips + " (price: " + chipsPrice + " ), ");
        System.out.print(drinks + " (price: " + drinksPrice + " ), ");
    }
}

