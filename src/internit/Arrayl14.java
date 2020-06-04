package internit;
import java.util.Scanner;
public class Arrayl14 {
     public static void main(String[] args){
        int size,i,arr[];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Size Of The Array:");
        size=obj.nextInt();
        arr=new int[size];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
         System.out.println("The array in reverse is:");
        for(i=size-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
