package MinimumNumberOfJumps;

import java.util.*;

public class MinimumNumberOfJumps {
    public static int minimumNumberOfJumps(int[] arr){
        Integer []dp=new Integer[arr.length];
        dp[arr.length-1]=0;
        for (int i=arr.length-2;i>=0;i--){
            int step=arr[i];
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=step && i+j< arr.length;j++){
                if(dp[i+j]!=null && dp[i+j]<min){
                    min=dp[i+j];
                }
            if(min!=Integer.MAX_VALUE){
                dp[i]=min+1;
            }
            }

        }
        return dp[0];
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
        System.out.println("Minimum number of Jumps "+minimumNumberOfJumps(arr));
    }
}
