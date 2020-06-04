package internit;
import java.util.Scanner;
public class Arrayl11 {
    public static void main(String[] args){
        int size,i,sum=0,arr[];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Size Of The Array:");
        size=obj.nextInt();
        arr=new int[size];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        for(i=0;i<size;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of the elements of the array is: "+sum);
    }
}
