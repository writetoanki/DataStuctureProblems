package FindTheMinAndMaxElement;

import java.util.Scanner;

public class FindTheMinAndMaxElement {
    public static int Max(int[] arr){
        int m= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;

    }
    public static int Min(int[] arr){
        int m= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<m){
                m=arr[i];
            }
        }
        return m;

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
        int min=Min(arr);
        int max=Max(arr);
        System.out.println("Min = "+min+" Max = "+max);

}}
