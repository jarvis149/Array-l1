package internit;
import java.util.Scanner;
public class Arrayl118 {
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
                    arr[j]='0';
                }
            }
        }
        System.out.println(" The  elements and their frequencies  are:");
        for(i=0;i<freq.length;i++)
        {
            if(freq[i]!=' ' && arr[i]!='0')
            {
                    System.out.println(arr[i]+"---"+freq[i]);
        }
        }
    }
}
