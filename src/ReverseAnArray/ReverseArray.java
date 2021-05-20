package ReverseAnArray;
import java.util.*;

public class ReverseArray {
    public static void reverseArray(int[] arr,int n){
        int start=0;
        int end=n-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] stringArray=s.split(" ");
        int n=stringArray.length;
        int[] arr=new int[n];
        int i=0;
        for(String sa:stringArray){
            arr[i++]=Integer.parseInt(sa);
        }
        reverseArray(arr,n);
        for(int j:arr){
            System.out.println(j);
        }

    }

}
