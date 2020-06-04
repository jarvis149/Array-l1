package internit;
import java.util.Scanner;
/*Print a version of the given array where all the 10's have been removed. 
The remaining elements should shift left towards the start of the array as needed, 
and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. 
You may modify and display the given array or make a new array.
withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
withoutTen([10, 2, 10]) → [2, 0, 0]
withoutTen([1, 99, 10]) → [1, 99, 0]**/
public class Practice2 {
    public static void main(String[] args){
         Scanner obj=new Scanner(System.in);
        int size,i,j,count= 0,sum=0,arr[],arr1[];
        System.out.println("Enter the size of the array:");
        size=obj.nextInt();
        arr=new int[size];
        arr1=new int[size];
        System.out.println("Enter the array elements:");
        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        for(i=0;i<size;i++){
            if(arr[i]!=10){
                arr1[count]=arr[i];
                count++;
            }
        }
        if(count<size){
        for(i=count;i<size;i++){
        arr1[i]=0;
        }
        }   
        System.out.println("The array after the change is: ");
        for(i=0;i<size;i++){
            System.out.println(arr1[i]);
        }
    }
}
