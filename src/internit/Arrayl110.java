package internit;
import java.util.Scanner;
public class Arrayl110 {
    public static void main(String[] args){
        int i,j,temp,mindex,arr[];
        Scanner obj=new Scanner(System.in);
        arr=new int[10];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<10;i++){
            arr[i]=obj.nextInt();
        }
        for(i=0;i<9;i++){
            mindex=i;
            for(j=i+1;j<10;j++){
                if(arr[j]<arr[mindex]){
                    mindex=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[mindex];
            arr[mindex]=temp;
            }
        System.out.println("The Sorted array is:");
        for(i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        }
}
