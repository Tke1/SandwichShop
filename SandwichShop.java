import static java.lang.System.out; 
import java.util.Scanner;

public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70; 
        
        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is 50");
        out.println("How many veggie sandwiches were sold today?");
        int veggieSold;
        veggieSold = keyboard.nextInt();
        
        out.print("\n");
        if (veggieSold >= goalForVeggies)
        {
            out.println("Made goal for veggie ");
        }
        else
        {
            out.println("Fell short for veggies ");
        }
        
        out.println("The sales goal for burgers is 250");
        out.println("How many burgers were sold today?");
        int burgerSold;
        burgerSold = keyboard.nextInt();
        out.print("\n");
        
        if (burgerSold >= goalForBurgers)
        { 
            out.println("Made goal for burgers ");
        }
        else
        {
            out.println("Fell short for burgers ");
        }
        
        out.println("The sales goal for subs is 180");
        out.println("How many burgers were sold today");
        int subSold;
        subSold = keyboard.nextInt();
        out.print("\n");
               
        if (subSold >= goalForSubs)
        { 
            out.println("Made goal for subs. ");
        }
        else
        {
            out.println("Fell short for subs. ");
        }
        
        out.println("The sales goal for soup is 70");
        out.println("How many soups were sold today?");
        int soupSold;
        soupSold = keyboard.nextInt();
        
        out.print("\n");
        if (soupSold >= goalForSoup)
        {
            out.println("Made goal for soup. \n");
        }
        else 
        {
            out.println("Fell short for soup. \n");
        }
        
        if (soupSold >= goalForSoup && subSold >= goalForSubs && burgerSold >= goalForBurgers && veggieSold >= goalForVeggies)
        {
            out.println("Made goal for everything!");
        }
        else
        {
        }
    }   
}  
