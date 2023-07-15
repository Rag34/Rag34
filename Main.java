// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("..........Welcome to temperature converter..........");
        System.out.println("Enter the value which you want to covert.. ");
        float value=sc.nextFloat();
        System.out.println("Enter 1 for converting from Celsius to Fahrenheit...... ");
        System.out.println("Enter 2 for converting from Fahrenheit to Celsius.......");
        System.out.println("enter your choice...........");
        int choice=sc.nextInt();
        if (choice==1){
            float value1=(float) ((value*1.8)+32);
            System.out.println("The converted temperature is "+value1+" F");
        }
        if (choice==2){
            float value2= (float) ((value-32)*(5/9));
            System.out.println("The converted temperature is "+value2+" C");
        }

    }
}