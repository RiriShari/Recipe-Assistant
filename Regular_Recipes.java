import java.util.ArrayList;

public class Regular_Recipes extends Recipes{
    private static ArrayList<Recipes> menu;  //Array list of regular recipes.

    public Regular_Recipes() {  //Empty constructor for this subclass.
    }

    public Regular_Recipes(String recipeName, int cookingTime, Calories cal) {
        super(recipeName, cookingTime, cal);
    }   //Constructor that includes elements of superclass.


    //Add in the array all the elements.
    public static void regRecipe(){
        menu = new ArrayList<>();  //New Array List.
        menu.add(new Regular_Recipes("Chicken Curry", 30, new Calories(2000, 500)));
        menu.add(new Regular_Recipes("Pasta", 15, new Calories(2400, 600)));
        menu.add(new Regular_Recipes("Beef Noodle Soup", 35, new Calories(2000, 500)));
        menu.add(new Regular_Recipes("Stew", 30, new Calories(2000, 500)));
        menu.add(new Regular_Recipes("Pizza", 25, new Calories(2600, 650)));
        menu.add(new Regular_Recipes("Shepherd's Pie", 35, new Calories(1600, 400)));
        menu.add(new Regular_Recipes("Steak and veggies", 45, new Calories(2200, 550)));
        menu.add(new Regular_Recipes("Poke", 20, new Calories(1200, 300)));
        menu.add(new Regular_Recipes("Shakshuka", 15, new Calories(1600, 400)));
        menu.add(new Regular_Recipes("Egg rolls", 25, new Calories(1200, 300)));
        menu.add(new Regular_Recipes("Chicken and Waffles", 55, new Calories(2800, 700)));
        menu.add(new Regular_Recipes("Chicken Pesto Pasta", 35, new Calories(2400, 600)));
        menu.add(new Regular_Recipes("Dumplings", 15, new Calories(2000, 500)));
    }


    public static ArrayList<Recipes> getMenu(){  //Only getter since we do not need to set an array.
        return menu;
    }   //Getter for show aan Array List of recipes.
    @Override // Provide the text for the Regular_Recipes section.
    public void description() {
        System.out.println("This option provides standard recipes.\nChoose an option 'a' if you would like to search by the key word.\nChoose an option 'b' to receive three random recipes for a day.\n");

    }

    @Override   //Override a function to print special instruction that has been created in Recipe class.
    public void printSpecialInstructions() {
        System.out.println("Attention!\nPlease, keep raw meat, poultry, fish, and their juices away from other food. Avoid cross-contamination.\n");
    }



}
