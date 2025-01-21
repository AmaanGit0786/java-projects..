package mergeSorting_Amaan;

public class mergeSorting_REcursively {
    public static void print(int []arr) {
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int []a,int[]b,int[]c) {
        int i=0, j=0,k=0;
        while(a.length<i &&b.length<j){
            if(a[i]<=b[j])
            a[i++]=c[k++];
            else
           // if(a[i]>=b[j])
                b[j++]=c[k++];
        }
        while(a.length<i) a[i++]=c[k++];
        while(b.length<j) b[j++]=c[k++];

    }
    public static void mergesort(int []arr) {
        int n=arr.length;
        if(n==1)
            return;
        int []a=new int[n/2];
        int []b=new int[n-n/2];
        for(int i=0;i<n/2;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i]=arr[i+n/2];
        }
        mergesort(a);
       // print(a);
;        mergesort(b);
       // print(b);
        merge(a,b,arr);
//mergesort(a,b,arr);
    }
    public static void main(String[] args) {

        int arr[]={20,40,90,10,30,50,100,70,60,80};
        System.out.println("original Array");
        print(arr);
        mergesort(arr);

        print(arr);

    }
}
