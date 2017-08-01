
import java.io.Console;

public class GroceriesStore {

    public static void main(String[] args) {
	//Groceries store
        System.out.println("Welcome to Muturia's Grocery store");
        //Create an array of Items
        String[] Vegetables = {"Onions","Cabbages","Tomatoes","Zucchinni","Pepper"};
        //Create an arraylist of prices
        int[] prices = {10,50,5,10,10};

        //Create a for loop that loops through the vegetables
        for (int i =0; i < Vegetables.length; i++){
            System.out.println("The vegetable's" + " " +Vegetables[i]+ " "+ "Price is"+" "+prices[i]);
        }
        //Enter a user option to Buy FRom the Grocery
        System.out.println("Do you wish to buy anything? Enter Y for Yes or N for No!");
        Console myConsole = System.console();

        //Create a logical boolean
        String option = myConsole.readLine();
        if(option == "Y" ){
            System.out.println("Choose the product to the cart Choose by options");
            for (int j = 0; j<prices.length;j++){
                int total = j++;
                System.out.println(total);
            }

        }else{
            System.out.println("THank you for choosing us");
        }
    }
}
