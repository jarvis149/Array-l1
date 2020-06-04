package internit;
import java.util.Scanner;
public class Arrayl113 {
   public static void main(String[] args){
        int i,j,temp,size,arr[];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        size=obj.nextInt();
        arr=new int[size];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        for(i=0;i<size-1;i++){
            for(j=0;j<size-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The smallest and the largest elements is :"+arr[0]+" and "+arr[size-1]);
}
}