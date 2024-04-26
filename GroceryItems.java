public class GroceryItems implements Menu_Description {
    private double unitPrice;
    private String unitName;
    private int unitNumber;


    public GroceryItems(){
        unitName = "None";
        unitPrice = 0.0;
        unitNumber = 0;


    }

    //Constructor.
    public GroceryItems(String unitName, double unitPrice, int unitNumber) {
        this.unitName = unitName;
        this.unitPrice = unitPrice;
        this.unitNumber = unitNumber;
    }

    //Getters and Setters.
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
    }


    //Provide the description for the GroceryItems section.
    public void description(){
        System.out.println("This option provides the list of groceries with a total price.\nYou also able to see the price with tax.\n");
    }

    //toString method for GroceryItems class.
    @Override
    public String toString() {
        return "\nItem name: '" + unitName + '\'' +
                ", Price per item: " + unitPrice +
                ",  Amount: " + unitNumber + '\n';
    }



}
