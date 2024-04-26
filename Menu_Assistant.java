import java.util.Scanner;
import java.util.ArrayList;
public class Menu_Assistant {
    public static void errorMessage() {
        System.out.println("Error! This is an invalid input! Try again.");   //Error message if the user adds input incorrectly.
    }

    public static double costWithTax(double allCost, double stateTax) {
        return allCost + (allCost * stateTax);    //Calculated the cost of the groceries with a tax.
    }

    public static double percentageDifference(int realNum, int goalNum) {
        return ((double) realNum / (double) goalNum) * 100;   //Upcasting since two of the parameters are integers. Multiply to 100 to get the percentage.
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        Recipes recipes = new Regular_Recipes();  //To print the description for the regular recipes.
        Recipes recipesVeg = new Vegetarian_Recipes();  // To print the description for the vegetarian recipes.
        ArrayList<Recipes> menuList = new ArrayList<>(); //Array list of regular or vegetarian recipes.

        GroceryItems groceryItems = new GroceryItems();

        Calories calories = new Calories();
        ArrayList<Calories> arrayOfCal = new ArrayList<>(); //Array list to input calories of three random meals.
        Recipes option1;
        Recipes option2;
        Recipes option3;

        while (choice != 4) {
            System.out.println("***Menu***");
            System.out.println("1. Recipes.\n2. Grocery List.\n3. Calorie Counter.\n4. Quit.");
            System.out.println("Enter your option: ");
            choice = scan.nextInt();

            if (choice > 4) {
                errorMessage();

            } else if (choice == 1) {
                System.out.println("What type of recipes would you like to see?\n1.Regular.\n2.Vegetarian.");
                int choiceMenuType = scan.nextInt();

                if (choiceMenuType == 1) {
                    recipes.description(); //Description for regular recipes.
                    recipes.printSpecialInstructions();
                    // Get from class array of regular recipes.
                    Regular_Recipes.regRecipe();
                    menuList = Regular_Recipes.getMenu();


                } else if (choiceMenuType == 2) {
                    ////Description for vegetarian recipes.
                    recipesVeg.description();
                    recipesVeg.printSpecialInstructions();
                    // Get from class array of vegetarian recipes.
                    Vegetarian_Recipes.vegRecipe();
                    menuList = Vegetarian_Recipes.getMenuVeg();

                } else {
                        errorMessage();
                    }
                System.out.println("a. Search for a recipe.\nb. Three random recipes for a day.");
                char choice1 = scan.next().charAt(0);

                if (choice1 == 'a') {
                    System.out.println("What recipe are you looking for?");
                    scan.nextLine();
                    String search = scan.nextLine();
                    if (Recipes.searchForRecipe(menuList, search)) { //Use method from recipes class to find a recipe by the name.
                        for (int m = 0; m < menuList.size(); m++) {
                            if (menuList.get(m).getRecipeName().equalsIgnoreCase(search)) {  //Use 'IgnoreCase' to ignore even if the word has capital letters.
                                System.out.println("Recipe found!\n" + menuList.get(m)); //Output the recipe that the user was searching for.
                            }
                        }

                    } else {
                        System.out.println("Sorry, recipe is not found.");
                    }
                } else if (choice1 == 'b') {

                    option1 = menuList.get(Recipes.random());   //Get random recipe.
                    menuList.remove(option1);    //Remove the random recipe that we got to avoid repetitive output for other 2 recipes.

                    option2 = menuList.get(Recipes.random());
                    menuList.remove(option2);

                    option3 = menuList.get(Recipes.random());
                    menuList.remove(option3);

                    System.out.println("Three random recipes for today: " + option1 + option2 + option3);


                    arrayOfCal.add(option1.getCal());   //Add three random recipes to another array to calculate calories later in the code.
                    arrayOfCal.add(option2.getCal());
                    arrayOfCal.add(option3.getCal());
                } else {
                    errorMessage();
                }

                } else if (choice == 2) {
                    groceryItems.description();
                    ArrayList<GroceryItems> grList = new ArrayList<>();   //Create an array to store info about groceries.
                    double totalPrice = 0;
                    char groceryReply;
                    do {
                        System.out.println("Enter the grocery name: ");
                        String item1 = scan.next();
                        System.out.println("Enter the grocery price: ");
                        double price1 = scan.nextDouble();
                        System.out.println("Enter the grocery quantity: ");
                        int amount1 = scan.nextInt();

                        grList.add(new GroceryItems(item1, price1, amount1));

                        totalPrice += price1 * amount1;


                        System.out.println("Do you want to add more groceries?(Y/N)");
                        groceryReply = scan.next().toUpperCase().charAt(0);
                    } while (groceryReply != 'N');  //Created loop to store until user will type 'N'.
                    System.out.println("***Grocery List***");  // fix the problem with having a square brackets.
                    for (int g = 0; g < grList.size(); g++) {
                        double grSubtotal = grList.get(g).getUnitPrice() * grList.get(g).getUnitNumber();
                        System.out.print(grList.get(g));
                        System.out.print("Price: ");
                        System.out.printf("%.2f\n",grSubtotal);
                    }

                    System.out.print("\nTotal price: $");
                    System.out.printf("%.2f\n", totalPrice);  //Formatted to have only 2 decimals.

                    System.out.println("\nEnter the tax rate: ");
                    double taxRate = scan.nextDouble();
                    System.out.print("Total price with the tax: $");
                    System.out.printf("%.2f\n", costWithTax(totalPrice, taxRate));


                } else if (choice == 3) {
                    calories.description();
                    System.out.println("Calorie counter:");
                    System.out.println("Enter your daily calorie goal?");
                    int calorieGoal = scan.nextInt();
                    System.out.println ("a. Count meal calories manually.\nb. Count calories of three random meals.");
                    char choice2=scan.next().charAt(0);

                    if (choice2 == 'a') {

                        int totalCal = 0;
                        char caloriesReply;
                        ArrayList <Integer> mealCalories = new ArrayList <Integer>();  //Create an array of integers (wrapper class) to get info of all calories from meals that the user manually added.
                        do{
                            System.out.println("Add calories of each meal: ");
                            int mealCal= scan.nextInt();
                            mealCalories.add(mealCal);
                            for (int i=0; i< mealCalories.size(); i++) {
                                totalCal += mealCalories.get(i);
                            }
                            System.out.println("Do you want to add more?(Y/N)");
                            caloriesReply = scan.next().toUpperCase().charAt(0);
                        } while (caloriesReply!='N');

                        System.out.println("Total Calories for Today: " + totalCal + " calories.");
                        System.out.printf("It is a %.2f", percentageDifference(totalCal, calorieGoal));
                        System.out.println(" % of your goal.");

                    } else {
                        int sum = 0;
                        for (int i = 0; i < arrayOfCal.size(); i++) {
                            sum += arrayOfCal.get(i).getCaloriesPerPortion();   //Use array list 'arrayOfCal' to sum all the calories of those three random meals.

                        }
                        System.out.println("Total Calories for Today: " + sum + " calories.");
                        System.out.printf("It is a %.2f", percentageDifference(sum, calorieGoal));
                        System.out.println(" % of your goal.");

                    }
                }

            }
        }

}
