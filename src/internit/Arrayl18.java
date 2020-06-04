package internit;
import java.util.Scanner;
public class Arrayl18 {
    public static void main(String[] args){
        int ele,loc =-1,beg=0,end=9,mid,i,arr[];
        Scanner obj=new Scanner(System.in);
        arr=new int[10];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<10;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("Enter The Element to be searched:");
        ele=obj.nextInt();
        while(beg<end){
        mid=(beg+end)/2;
        if(arr[mid]>ele){
            end=mid-1;
        }
        else if(arr[mid]<ele){
            beg=mid+1;
        }
        else if(arr[mid]==ele){
            loc=mid;
            break;
        }
        }
        if(loc==-1){
            System.out.println("The element is not found.");
        }
        else{
            System.out.println("The element is found at location: "+(loc+1));
        }
}
}
