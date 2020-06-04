package internit;
import java.util.Scanner;
/*Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
**/
public class Practice1 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int size,i,loc = 0,loc1 = 0,sum=0,arr[];
        System.out.println("Enter the size of the array:");
        size=obj.nextInt();
        arr=new int[size];
        System.out.println("Enter the array elements:");
        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
       for(i=0;i<size;i++){
           if(arr[i]==6){
               loc=i;
           }
           else if(arr[i]==7){
               loc1=i;
           }
           sum=sum+arr[i];
       }
       if(loc>loc1){
           System.out.println("The sum is: "+sum);
       }
       else if(loc<loc1){
           for(i=loc;i<=loc1;i++){
               sum=sum-arr[i];
           }
           System.out.println("The sum is: "+sum);
       }
    }
}
