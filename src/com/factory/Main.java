package com.factory;

public class Main {

    public static void main(String[] args) {
        //int i=0;
	for(int i=0;i<=100;i++){
	    System.out.print(i);
    }
    System.out.println("Printing Even Numbers");
    for(int i=0;i<=100;i++){
	    if(i%2 ==0 && i!=2){
	        System.out.print(i+" ");
        }
    }
    }
}
