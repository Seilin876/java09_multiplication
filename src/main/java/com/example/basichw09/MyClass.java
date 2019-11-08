package com.example.basichw09;


public class MyClass {
    public static void main ( String[] args ) {
        for(int i=2;i<10;i++){
            System.out.printf("---- %d 's multiplication----\n",i);
            for(int j=2;j<10;j++){
                System.out.printf("%d * %d = %d\n",i,j,i*j );
            }
        }

    }
}