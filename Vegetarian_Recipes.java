import java.util.ArrayList;

public class Vegetarian_Recipes extends Recipes {
    private static ArrayList<Recipes> menuVeg; //Array list of vegetarian recipes.

    public Vegetarian_Recipes() {  //Empty constructor for this subclass.
    }

    //Constructor that includes elements of superclass.
    public Vegetarian_Recipes(String recipeName, int cookingTime, Calories cal) {
        super(recipeName, cookingTime, cal);
    }
    //Add in the array all the elements.
    public static void vegRecipe(){
        menuVeg = new ArrayList<>();   //New Array List.
        menuVeg.add(new Vegetarian_Recipes("Creamy Spinach-Artichoke Gnocchi", 40, new Calories(2200, 550)));
        menuVeg.add(new Vegetarian_Recipes("Vegetarian Lasagna", 35, new Calories(2000, 500)));
        menuVeg.add(new Vegetarian_Recipes("Spinach Quiche", 40, new Calories(2400, 600)));
        menuVeg.add(new Vegetarian_Recipes("Cauliflower Pizza", 30, new Calories(2200, 550)));
        menuVeg.add(new Vegetarian_Recipes("Sesame Soba Noodles", 20, new Calories(2000, 500)));
        menuVeg.add(new Vegetarian_Recipes("Twice Baked Sweet Potatoes", 30, new Calories(1800, 450)));
        menuVeg.add(new Vegetarian_Recipes("Veggie Burger", 40, new Calories(2600, 650)));
        menuVeg.add(new Vegetarian_Recipes("Tofu and Broccoli", 20, new Calories(1200, 300)));
        menuVeg.add(new Vegetarian_Recipes("Indian Butter Chickpeas", 25, new Calories(1600, 400)));
        menuVeg.add(new Vegetarian_Recipes("Minestrone Soup", 35, new Calories(1700, 425)));
        menuVeg.add(new Vegetarian_Recipes("Parmesan Baked Risotto", 55, new Calories(2000, 500)));
        menuVeg.add(new Vegetarian_Recipes("Vegetarian Chili", 45, new Calories(2200, 550)));
        menuVeg.add(new Vegetarian_Recipes("Veggie Dumplings", 15, new Calories(1800, 450)));
    }
    public static ArrayList<Recipes> getMenuVeg(){  //Only getter since we do not need to set an array.
        return menuVeg;
    }   //Getter for show aan Array List of vegetarian recipes.
    @Override   // Provide the text for the Vegetarian_Recipes section.
    public void description() {
        System.out.println("This option provides vegetarian recipes.\nChoose an option 'a' if you would like to search by the key word.\nChoose an option 'b' to receive three random recipes for a day.\n");

    }
    @Override    //Override a function to print special instruction that has been created in Recipe class.
    public void printSpecialInstructions() {
        System.out.println("Attention!\nPlease, pay attention on hidden ingredients. Read ingredient list and avoid cross-contamination.\n");
    }
}
