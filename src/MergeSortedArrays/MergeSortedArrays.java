package MergeSortedArrays;
import  java.util.*;
public class MergeSortedArrays {
    public static  void mergeSortedArrays(int[] firstArray,int[] secondArray,int n,int m){
        int l=m+n-1;
        int i=n-1;
        int j=m-1;
        while(i>=0 && j>=0){
            if(firstArray[i]>=secondArray[j]){
                firstArray[l--]=firstArray[i];
                i--;
            }
            else{
                firstArray[l--]=secondArray[j];
                j--;
            }
        }
        while(i>=0){
            firstArray[l--]=firstArray[i--];
        }
        while(j>=0){
            firstArray[l--]=secondArray[j--];
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println(a);
        String b=sc.nextLine();
        System.out.println(b);
        int n=sc.nextInt();
        int m=sc.nextInt();


        String[] arraya=a.split(" ");
        String[] arrayb=b.split(" ");
        int[] firstArray=new int[arraya.length];
        int[] secondArray =new int[arrayb.length];
        int i=0;
        int j=0;
        for(String as:arraya){
            firstArray[i++]=Integer.parseInt(as);
        }
        for(String bs:arrayb){
            secondArray[j++]=Integer.parseInt(bs);
        }
        mergeSortedArrays(firstArray,secondArray,n,m);
        for(int k:firstArray){
            System.out.print("->"+k);
        }
    }
}
