package internit;
import java.util.Scanner;
public class Arrayl13 {
     public static void main(String[] args){
        int number,i;String month[]={"January-31","February-28","March-31","April-30","May-31","June-30","July-31","August-31","September-30","October-31","November-30","December-31"};
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the months number to find its info:");
        number=obj.nextInt();
         System.out.println("The month details is : "+month[number-1]);
    }
}
