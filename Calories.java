public class Calories implements Menu_Description {
    //instance variables for Calories class.
    private int totalCalories;
    private int caloriesPerPortion;
    public Calories (){ //Constructor that does not have parameters, needed if the recipe will not contain calories.
        totalCalories = 0;
        caloriesPerPortion = 0;
    }
    public Calories(int totalCalories, int caloriesPerPortion) { //Constructor with parameters.
        this.totalCalories = totalCalories;
        this.caloriesPerPortion = caloriesPerPortion;
    }

    //Getters and Setters for instance variables.
    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }

    public int getCaloriesPerPortion() {
        return caloriesPerPortion;
    }

    public void setCaloriesPerPortion(int caloriesPerPortion) {
        this.caloriesPerPortion = caloriesPerPortion;
    }
    //Provide the description for the Calories section.
    public void description(){
        System.out.println("This option contains calorie count for the recipes and shows the percentage from the daily goal.\nEach meal includes 4 portions. Calories are counted per portion.\n\nChoose an option 'a' to enter calories manually.\nChoose an option 'b' to see the results from three random recipes.\n");
    }

    //toString method - return the text (string).
    @Override
    public String toString() {
        return "Total Calories: " + totalCalories +
                ", Calories Per Portion: " + caloriesPerPortion;
    }

}
