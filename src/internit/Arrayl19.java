package internit;
import java.util.Scanner;
public class Arrayl19 {
    public static void main(String[] args){
        int i,j,temp,arr[];
        Scanner obj=new Scanner(System.in);
        arr=new int[10];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<10;i++){
            arr[i]=obj.nextInt();
        }
        for(i=0;i<9;i++){
            for(j=0;j<9-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted array is:");
        for(i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
