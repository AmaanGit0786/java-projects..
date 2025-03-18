package frequent_askedprogram.java;

public class reverseString {
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder("Hello all  dear students");
        //  sb.reverse();
        // System.out.println(sb);
        String[] arr = {"the", "sky ", "is", "blue"};
        int n = arr.length;
      /*  for (int i = 0; i < n; i++) {   //revrese each word of the string
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }*/
        // reverse whole string
            int i = 0;
            int j = n - 1;
            while (i < j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;

            }
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");

            }
        }
    }
