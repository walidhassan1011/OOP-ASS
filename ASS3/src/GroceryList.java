import java.util.ArrayList;

public class GroceryList {

    private ArrayList<GroceryItemOrder> GroceryList ;


        public GroceryList() {
        this.GroceryList = new ArrayList<GroceryItemOrder>(10);
        }
    public void addGroceryItem(GroceryItemOrder item) {
            if (GroceryList.size() < 10) {
                GroceryList.add(item);
                System.out.println("Item " + item + " added to the grocery list");
            } else {
                System.out.println("You can't add more than 10 items to the grocery list");
            }

    }
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < GroceryList.size(); i++) {
            totalCost += GroceryList.get(i).getCost();
        }
        return totalCost;
    }

    public void printGroceryList() {
        System.out.println("You have " + GroceryList.size() + " items in your grocery list");
        for (int i = 0; i < GroceryList.size(); i++) {
            System.out.println((i + 1) + ". " + GroceryList.get(i));
        }
    }



}
