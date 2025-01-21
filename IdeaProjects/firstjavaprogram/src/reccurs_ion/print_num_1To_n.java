package reccurs_ion;

import java.util.Scanner;

public class print_num_1To_n {
    //public static void main(String[] args) {
    static int n;
        public static void print(int x) {
            if(x>n) return ;
            System.out.println(x);
            print(x+1);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value");
             n= sc.nextInt();
            print(1);
            //System.out.println(j);
        }
    }



