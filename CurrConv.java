import java.util.Scanner;

public class CurrConv
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("CURRENCY CONVERTER");
        System.out.println("Select which currency you want to convert");
        System.out.println("1. Rupee to USD");
        System.out.println("2. USD to Rupee");
        System.out.println("3. Rupee to Euro");
        System.out.println("4. Euro to Rupee");
        System.out.println("Choose between 1 to 4:");
        int choice = sc.nextInt();
        
        if(choice == 1)
        {
            System.out.print("Enter the amount in Rupees:");
            double Rupee = sc.nextDouble();
            double USD = RupeeToUSD(Rupee);
            System.out.println("Converted amount in USD:" +USD);
        }
        else if(choice == 2)
        {
            System.out.print("Enter the amount in USD:");
            double USD = sc.nextDouble();
            double Rupee = USDToRupee(USD);
            System.out.println("Converted amount in Rupees:" +Rupee);
        }
        else if(choice == 3)
        {
            System.out.print("Enter the amount in Rupees:");
            double Rupee = sc.nextDouble();
            double Euro = RupeeToEuros(Rupee);
            System.out.println("Converted amount in Euro:" +Euro);
        }
        else if(choice == 4)
        {
            System.out.print("Enter the amount in Euros:");
            double Euro = sc.nextDouble();
            double Rupee = EuroToRupee(Euro);
            System.out.println("Converted amount in Rupees:" +Rupee);
        }
        else
        {
            System.out.println("Invalid choice. Please select between 1 to 4 only.");
        }
        sc.close();
    }
    public static double RupeeToUSD(double Rupee)
    {
        return Rupee * 0.0117;
    }
    public static double USDToRupee(double USD)
    {
        return USD * 85.13;
    }
    public static double RupeeToEuros(double Rupee)
    {
        return Rupee * 0.0113;
    }
    public static double EuroToRupee(double Euro)
    {
        return Euro * 88.43;
    }

}
