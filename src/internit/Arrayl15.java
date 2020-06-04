package internit;
import java.util.Scanner;
public class Arrayl15 {
     public static void main(String[] args){
        int size,size1,i,j,k=0,count=0,arr[],arr1[],arr3[];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Size Of The Array1:");
        size=obj.nextInt();
        arr=new int[size];
        System.out.println("Enter the elements of the array1:");
        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter The Size Of The Array2:");
        size1=obj.nextInt();
        arr1=new int[size1];
        System.out.println("Enter the elements of the array2:");
        for(i=0;i<size1;i++){
            arr1[i]=obj.nextInt();
        }
        arr3=new int[size+size1];
        for(i=0;i<size;i++){
            arr3[i]=arr[i];
            k++;
        }
        for(i=0;i<size1;i++){
            count=0;
            for(j=0;j<size;j++){
                if(arr3[j]==arr1[i]){
                    count=1;
                    break;
                }
            }
            if(count==0){
                arr3[k]=arr1[i];
                k++;
            }
        }
         System.out.println("The array after merging is:");
        for(i=0;i<k;i++){
            System.out.println(arr3[i]);
        }
    }
}
