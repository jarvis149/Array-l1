package internit;
import java.util.Scanner;
public class Arrayl116 {
   public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int i,j,size,arr[];
        System.out.println("Enter the size of the array:");
        size=obj.nextInt();
        arr=new int[size];
        int[] freq=new int[size];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        for(i=0;i<size;i++)
        {
            freq[i]=1;
            for(j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j]){
                    freq[i]++;
                    arr[j]=' ';
                }
            }
        }
        System.out.println(" The distinct elements are:");
        for(i=0;i<freq.length;i++)
        {
            if(freq[i]==1 && arr[i]!=' ')
            {
                    System.out.println(arr[i]);
        }
        }
    }
}
