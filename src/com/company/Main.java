package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1.5");

        for (int i = 1; i < 11; i++) {
            System.out.println(1./i);
        }

        System.out.println("Задание 1.7");

        System.out.println(factorial(10));

        System.out.println("Задание 1.3");

        int[] a={100, 200, 400, 150};
        int summa=0;

        for(int i=0;i< a.length;i++){
            summa+=a[i];
        }
        System.out.println(summa);

        summa=0;
        int i=0;

        while( i<a.length){

           summa+=a[i] ;
           i++;
        }

        System.out.println(summa);

        summa=0;
        i=0;

        do{

            summa+=a[i];
            i++;
        } while (i<a.length);

        System.out.println(summa);

    }

    private static int factorial(int n) {

        if (n == 1){

            return 1;
        }
        return n * factorial(n-1);

    }

}
