import java.util.Scanner;

public class Shop {

    public void tpShop(){

        Scanner Sc = new Scanner(System.in);
        int money = 100;
        String userinput;
        int debt;
        System.out.println("Welcome to the shop!");
        System.out.println("Your starting balance is: " + money);
        System.out.println("What would you like to buy? Tractors or Plots?");
        userinput = Sc.nextLine();


        if (userinput.equals("Tractors")){
            System.out.println("The selection of tractors are: Small, Medium, Big, or Large");
        }
        else if (userinput.equals("Plots")){
            System.out.print("How many plots would you like to buy? Each plot is 50 each.");
            userinput = Sc.nextLine();
        }
        if (money < 50){
            System.out.println("Im sorry but you do not have enough money");
        }
        else if (money > 50){
            System.out.println("You have successfully purchased a plot or plots");
            //debt = money - 50;
        }
        System.out.println("Your current amount of money is:" + money);
        //else if (money > 50 &&){
       //     "You have "
        }

    }
//}
