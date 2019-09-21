import java.util.Scanner;

public class gruendel_p2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
         
        System.out.print("Your height (feet)? ");
        double feet = scnr.nextInt();
        
        System.out.print("Your height (inches)? ");
        double inches = scnr.nextDouble();
        //converting feet to inches
        double heightInInches = feet * 12 + inches;
        
        System.out.print("Your weight (pounds)? ");
        double weightInPounds = scnr.nextDouble();
        //equation for BMI
        double BMI = (weightInPounds * 703 / Math.pow(heightInInches, 2));
        
        //inputing BMI categories
        System.out.printf("BMI = %.1f\n",BMI);
        if (BMI < 18.5) 
        {
            System.out.println("Underweight");
        } 
        else if (BMI < 25) 
        {
            System.out.println("Normal weight");
        } 
        else if (BMI < 29.9) 
        {
            System.out.println("Overweight");
        } 
        else 
        {
            System.out.println("Obese");
        }
    }
}