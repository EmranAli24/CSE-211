package Similarity;

import java.lang.IllegalArgumentException;
import java.util.Scanner;

public class SimpleMatchingCoefficient {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String binaryString1,binaryString2 ;

        System.out.println("Enter First binary String: ");
        binaryString1 = input.nextLine();
        System.out.println("Enter Second binary String: ");
        binaryString2 = input.nextLine();

        double smcScore = calculateSmc(binaryString1,binaryString2);

        System.out.println("Simple Matching Coefficient(SMC) score: " + smcScore );

    }

    public static double calculateSmc(String binaryString1,String binaryString2){
        if( binaryString1.length() !=  binaryString2.length()) {
            throw new IllegalArgumentException("Binary String must have the same length ");
        }

        int length = binaryString1.length();
        int matchingCount = 0 ;

        // calculate number of matching positions
        for(int i = 0; i < length ; i++){
            if(binaryString1.charAt(i) == binaryString2.charAt(i)){
                matchingCount++;
            }
        }

        double smcScore = (double) matchingCount / length ;

        return smcScore;

    }
}
