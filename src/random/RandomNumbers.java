package random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
    	System.out.println("Give a Number");
    	Scanner ui = new Scanner(System.in);
    	int Nth = ui.nextInt();
    	
    	int[] A = new int[500];
    	Random rnm = new Random();
    	for(int i =0; i<500; i++) {
    		A[i] = rnm.nextInt(500);
    		System.out.println(A[i] + "");
    	}
    	Arrays.sort(A);
    	System.out.println("Sorted Numbers :");
    	
    	for(int i = 0;i<A.length;i++) {
    		System.out.println(A[i]+"");
    		
    	}
    	System.out.println("Smallest number is :" +"\t" + A[Nth-1]);
 }
}



