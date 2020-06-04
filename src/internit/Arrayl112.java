package internit;
import java.util.Scanner;
public class Arrayl112 {
    public static void main(String[] args){
        int size,i,sum=0,count=0,arr[];double avg=0.0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Size Of The Array:");
        size=obj.nextInt();
        arr=new int[size];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        for(i=0;i<size;i++){
            if(arr[i]%2==0){
            sum=sum+arr[i];
            count++;
            }
        }
        if(count>1){
        avg=sum/count;
                }
        System.out.println("The Average of even elements in the array is: "+avg);
    }
}
