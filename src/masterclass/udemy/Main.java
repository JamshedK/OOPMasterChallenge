package masterclass.udemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to tajBurger");
        System.out.println("Choose the burger you want by typing the appropriate digit: ");
        System.out.println("1 - Basic Burger");
        System.out.println("2 - Healthy Burger");
        System.out.println("3 - Deluxe Burger");
        int burgerType = scanner.nextInt();
        if(burgerType == 1){
            BasicBurger basicBurger = new BasicBurger("beef", "normal", 23);
            System.out.println("You have chosen Basic Burger");
            System.out.println("You can add 4 additional items to your Basic Burger. ");
            System.out.println("1 - tomato ");
            System.out.println("2 - carrot");
            System.out.println("3 - ketchup");
            System.out.println("4 - lettuce");
            System.out.println("How many additional items do you want to add");
            int additionalNum = scanner.nextInt();
            System.out.println("Choose the appropriate digits for additional items. After typing each digit click enter");
            for(int i = 0; i < additionalNum; i++){
                int additionalItem = scanner.nextInt();
                switch (additionalItem){
                    case 0:
                        basicBurger.addAdditionalItem("tomato", 1);
                        continue;
                    case 1:
                        basicBurger.addAdditionalItem("carrot", 2);
                        continue;
                    case 2:
                        basicBurger.addAdditionalItem("ketchup", 1);
                        continue;
                    case 3:
                        basicBurger.addAdditionalItem("lettuce", 2);
                }
            }
            System.out.println("Thank you so much for using our service. Here is the info of what you ordered");
            basicBurger.printBurgerInfo();
            System.out.println("");
            System.out.println("Total price: " + basicBurger.getTotalPrice());
        }

        if(burgerType == 2){
            HealthyBurger healthyBurger = new HealthyBurger("beef", 2.5);
            System.out.println("You have chosen the Healthy Burger");
            System.out.println("You can add 6 additional items to your Healthy Burger. ");
            System.out.println("1 - tomato ");
            System.out.println("2 - carrot");
            System.out.println("3 - ketchup");
            System.out.println("4 - lettuce");
            System.out.println("5 - cucumber");
            System.out.println("6 - cabbage");
            System.out.println("How many additional items do you want to add");
            int additionalNum = scanner.nextInt();
            System.out.println("Choose the appropriate digits for additional items. After typing each digit click enter");
            for(int i = 0; i < additionalNum; i++){
                int additionalItem = scanner.nextInt();
                switch (additionalItem){
                    case 0:
                        healthyBurger.addAdditionalItem("tomato", 1);
                        continue;
                    case 1:
                        healthyBurger.addAdditionalItem("carrot", 2);
                        continue;
                    case 2:
                        healthyBurger.addAdditionalItem("ketchup", 1);
                        continue;
                    case 3:
                        healthyBurger.addAdditionalItem("lettuce", 2);
                    case 4:
                        healthyBurger.addAdditionalItem("cucumber", 2);
                    case 5:
                        healthyBurger.addAdditionalItem("cabbage", 5);
                }
            }
            System.out.println("Thank you so much for using our service. Here is the info of what you ordered");
            healthyBurger.printBurgerInfo();
            System.out.println("");
            System.out.println("Total price: " + healthyBurger.getTotalPrice());
        }

        if(burgerType == 3){ 
            DeluxeBurger deluxeBurger = new DeluxeBurger("beef", "white", 23, "french fries", 2, "coke", 2);
            deluxeBurger.printBurgerInfo();
            System.out.println("");
            System.out.println("Total price: " + deluxeBurger.getTotalPrice());

        }
        scanner.close();

    }
}
