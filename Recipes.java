import java.util.ArrayList;
import java.util.Random;
public abstract class Recipes implements Menu_Description {
    //Instance variables.
    private String recipeName;

    private int cookingTime;

    //Calories class has been added to Recipe class.
    private Calories cal;

    //Constructor without a parameter.
    public Recipes () {
        recipeName ="None";
        cookingTime = 0;
        cal = new Calories();
    }
    //Constructor with parameters.
    public Recipes(String recipeName, int cookingTime, Calories cal) {
        this.recipeName = recipeName;
        this.cookingTime = cookingTime;
        this.cal = cal;
    }


    //Getters and Setters for instance variables.
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }


    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    //Setter and getter for Calories class.
    public Calories getCal() {
        return cal;
    }

    public void setCal(Calories cal) {
        this.cal = cal;
    }

    public void description(){}  // Provide a function for Recipe section to describe in a regular and vegetarian recipe sections.

    public abstract void printSpecialInstructions();  //Instructions for recipes.
    //toString method for Recipes class.
    @Override
    public String toString() {
        return "\nRecipe Name: '" + recipeName + '\'' +
                ", Cooking Time (min): " + cookingTime+
                ", " + cal;
    }

    //Create a method to search a recipe in the array list. Use boolean to return true only if the recipe name is the same as the user's input.
    public static boolean searchForRecipe(ArrayList<Recipes> r, String recipeName){
        for (int i=0; i<r.size(); i++) {
            if (r.get(i).getRecipeName().equalsIgnoreCase(recipeName)){
                return true;
            }
        }return false;
    }
    public static int random (){
        Random rand = new Random();
        return rand.nextInt(10)+1;
    }

}

