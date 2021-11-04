package com.omer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Choose array length and define elements to sort from - to + within a new array");
        System.out.println("please enter array length");
        int[] userArray = new int[SCANNER.nextInt()];
        System.out.println("please fill in elements:");
        for (int i = 0; i <userArray.length ; i++) {userArray[i] = SCANNER.nextInt();}
        int[] computerArray = new int[userArray.length];
        for (int i = userArray.length-1; i >- 1 ; i--) {computerArray[i]=userArray[i];}
            Arrays.sort(computerArray);
        for (int i = 0; i <computerArray.length ; i++) {
            System.out.print(computerArray[i]+" ");
        }
        }
    }
