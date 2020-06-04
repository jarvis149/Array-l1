
package internit;
import java.util.Scanner;
public class Arrayl117 {
    public static void main(String[] args){
        int size,i,evearr[],evesize=0,arr[];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter The Size Of The Array:");
        size=obj.nextInt();
        arr=new int[size];
        evearr=new int[size];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        for(i=0;i<size;i++){
            if(arr[i]%2==0){
                evearr[evesize]=arr[i];
                evesize++;
            }
        }
         System.out.println("The even elements array is:");
         for(i=0;i<evesize;i++){
             System.out.println(evearr[i]);
         }
    }
}
