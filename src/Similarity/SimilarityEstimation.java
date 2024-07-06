/*
package Similarity;

import java.util.Map;
import java.util.HashMap;

public class SimilarityEstimation {
    public static void main(String[] args) {
        String testString1 = "the best data science course in the Engg course";

        Map<String,Integer> word_freq = new HashMap<String,Integer>();

        Integer count = null;
        //String delims = " ";
        String[] token = testString1.split(" ");
        String word;
        for (int i = 0 ; i < token.length ; i++ ){
            word = token[i];
            count = word_freq.get(word);

            if(count == null){
                count = 1;
            }
            else {
                count += 1 ;
            }

            word_freq.put(word,count);
        }

        System.out.println(word_freq);
    }
}
*/

package Similarity ;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class SimilarityEstimation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String testString1 = input.nextLine();
        Map<String,Integer> word_freq = new HashMap<String , Integer>();

        Integer count = null;
        String[] token = testString1.split(" ");
        String word;
        for(int i = 0; i < token.length ;i++){
            word = token[i];
            count = word_freq.get(word);

            if( count ==  null ){
                count = 1;

            }
            else {
                count += 1 ;
            }

            word_freq.put(word,count);
        }

        System.out.println(word_freq);

    }
}

