package com.Barton;
import java.util.ArrayList;//imports for the ArrayList use to allow it to work and a user scanner to allow it to take user input
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;//choice zero by default the user starts with nothing

        printInstructions();//class to print
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();//continues scanning to the limit of the array of ints
            scanner.nextLine();//scan next line

            switch(choice) {//this is what is happening with the choice
                case 0:
                    printInstructions();
                    break;//instructions for the user
                case 1:
                    groceryList.printGroceryList();
                    break;//the actual list printed
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }
    //this bit is where the stuff in the while loop is implemented

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print th list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current item name: ");
        String itemNo = scanner.nextLine();//item number scanned on next line after the user has put it in
        System.out.println("Enter new item: ");
        String newItem = scanner.nextLine();//item number scanned on next line after the user has put it in
        groceryList.modifyGroceryItem(itemNo, newItem);//the two variables
    }

    public static void removeItem() {
        System.out.println("enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        }else {
            System.out.println(searchItem + ", not on file.");
        }
    }
    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

}
