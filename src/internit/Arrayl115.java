package internit;
import java.util.Scanner;
public class Arrayl115 {
    public static void main(String[] args){
        int size,i,j,flag,arr[];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Size Of The Array:");
        size=obj.nextInt();
        arr=new int[size];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("The Prime Numbers are:");
        for(i=0;i<size;i++){
            flag=0;
            for(j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                    System.out.println(arr[i]);
                }
        }
    }
}
