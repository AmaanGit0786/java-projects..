package Array;

public class Second_largestelement {
    public static void main(String[] args) {
        int []arr={23,788,786,89,76};
        int mx=Integer.MIN_VALUE;
        int smx=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (mx <arr[i])
                mx=arr[i];



        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=mx)
                smx=Math.max(smx,arr[i]);





    }
        System.out.println(mx);
        System.out.println(smx);
}}
