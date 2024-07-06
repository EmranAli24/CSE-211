package Similarity;
import java.util.*;

public class SimilarityEstimation2 {
    public static void main(String[] args) {
        String testString1 = "the best data science course in the engg course";
        SimilarityDescriptor similarityObj = new SimilarityDescriptor();

        Map<String,Integer> word_freq = similarityObj.wordFreqEstimation(testString1);
        System.out.println(word_freq);
    }
}

class SimilarityDescriptor {
    Map<String,Integer> wordFreqEstimation( String getString){

        Map<String,Integer> word_freq = new HashMap<String ,Integer>();
        Integer count = null;

        String delims = " ";
        String[] token = getString.split(delims);
        String word ;

        for( int i=0; i< token.length;i++){

            word = token[i];
            count = word_freq.get(word);
            if( count == null){
                count = 1;
            }
            else {
                count += 1 ;
            }
            word_freq.put(word,count);
        }
        return word_freq;

    }
}