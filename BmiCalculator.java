import java.util.*;

public class BmiCalculator {

    public static float check(){
        Scanner in = new Scanner(System.in);
        try {
            float c = in.nextFloat();
            return c;
        } catch (Exception e) {
            System.out.print("Enterd invalid details.\nRenter");
            return check();
        }
    }
    public static float checkinch(){
        Scanner in = new Scanner(System.in);
        try {
            float c = in.nextFloat();
            if(c >=0 && c <=11){
                return c;
            }else{
                System.out.print("Entered invalid range : \nRe Enter Valid Range of inches");
                return checkinch();
            }
            
        } catch (Exception e) {
            System.out.print("Entered invalid details :");
            return checkinch();
        }
    }

    public static void calc(double w, double h) {
        if(h <= 0 || w <= 0)
            System.out.println("Invalid details");
        else{
            float r = (float) (w / (h * h));
            System.out.println("Your BMI is " + r);
            if (r <= 18.5)
                System.out.println("Underweight ");
            else if (18.5 < r && r <= 24.9)
                System.out.println("Normal weight ");
            else if (24.9 < r && r <= 29.9)
                System.out.println("Overweight");
            else
                System.out.println("Obesity");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            try {
            while (true) {
            System.out.print("Choose the scale...\n1.Standard\t2.Metric\t3.Exit\n");
            int ch = in.nextInt();
                 switch (ch) {
                case 1:
                    System.out.print("Enter Weight in pounds:");
                    float p = check(); 
                    System.out.print("Enter Height.. \n Number of feets:");
                    float f = check();
                    System.out.print(" Number of inches:");
                    f = (f * 12) + checkinch();
                    calc(p * 0.453, f * 0.0254);
                    break;
                case 2:
                    System.out.print("Enter Weight in kgs:");
                    float kg = check();
                    System.out.print("Enter Height in cms:");
                    float cm = check();
                    calc(kg, cm / 100);
                    break;
                case 3:
                    System.out.println("Program Exited...!");
                    return;
                default:
                    System.out.print("Enter valid option");
                    break;
            }
            } }catch (Exception e) {
                 System.out.print("Entered invalid key program exited");
            }
  
    }
}