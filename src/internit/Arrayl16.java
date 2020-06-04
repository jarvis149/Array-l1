package internit;
import java.util.Scanner;
public class Arrayl16 {
    public static void main(String[] args){
        int ele,loc = 0,count=0,i,sum=0,arr[];
        Scanner obj=new Scanner(System.in);
        arr=new int[10];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<10;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter The Element to be searched:");
        ele=obj.nextInt();
        for(i=0;i<10;i++){
            if(arr[i]==ele){
                count=1;
                loc=i;
                break;
            }
        }
        if(count==1){
            System.out.println("The element has been found in: "+(loc+1)+" location.");
        }
        else{
            System.out.println("The Element has not been found.");
        }
}
}
