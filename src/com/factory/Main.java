package com.factory;

public class Main {

    public static void main(String[] args) {
        //int i=0;
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("Printing Prime Numbers");
        for (int i = 0; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
                if(isPrime){
                    System.out.print(i+" ");
                }

            }
        }

    }
