package KadaneAlgorithm;

import java.util.*;;
import  java.lang.*;

public class KadaneAlgortihm {
    public static int maximumSum(int[] arr){
        int current_best=arr[0];
        int overall_best=arr[0];
        for (int i=1;i<arr.length;i++){
            current_best=Math.max(arr[i],arr[i]+current_best);
            overall_best=Math.max(overall_best,current_best);

        }
        return overall_best;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] stringArray=s.split(" ");
        int n=stringArray.length;
        int[] arr=new int[n];
        int i=0;
        for(String sa:stringArray){
            arr[i++]=Integer.parseInt(sa);}
        System.out.println("Maximum Sum= "+maximumSum(arr));
        }

}
