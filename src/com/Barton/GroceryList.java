package com.Barton;
import java.util.ArrayList;//import from the other class



public class GroceryList {

//this below is to access the Array list
    private ArrayList<String> groceryList = new ArrayList<String>();//specifies the elements and what there data type is

    public void addGroceryItem(String item) { //adding an item


        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;//this is to show the list
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");//showing how many items are in the list
        for(int i=0; i< groceryList.size(); i++) { //for loop to allow everything to be read
            System.out.println((i+1) + ". " + groceryList.get(i));//so it isn't starting from zero
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {//variables needed for modification
        int position = findItem(currentItem);//
        if(position>=0){
            modifyGroceryItem(position, newItem);
        }

    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >=0) {//zero selected then
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);

    }
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {

        return true;
    }
    return false;
}

}
