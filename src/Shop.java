import java.util.Scanner;

public class Shop {
    public static void main(String[] args){

        Scanner Sc = new Scanner(System.in);
        int money = 100;
        String userinput2;
        System.out.println("Welcome to the shop!");
        System.out.println("Your starting balance is: " + money);
        System.out.println("What would you like to buy? Tractors or Plots?");
        userinput2 = Sc.nextLine();


        if (userinput2.equals("Tractors")){
            System.out.println("The selection of tractors are: Small, Medium, Big, or Large");
        }
        else if (userinput2.equals("Plots")){
            System.out.print("How many plots would you like to buy? Each plot is 50 each.");
        }


    }
}
