/*
package Similarity;

import java.util.*;
public class CosineSimilarityEstimation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text1,text2;

        System.out.println("Enter First text : ");
        text1 = scan.nextLine();
        System.out.println("Enter Second text : ");
        text2 = scan.nextLine();

        CosineSimilarity obj = new CosineSimilarity();

        double result =  obj.cosineSimilarityMethod(text1,text2);

        System.out.println("Cosine similarity between two given text: "+result);
    }
}

class wordFreqEstimation{
    Map<String,Integer> wordFreqEstimationMethod( String getString){

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


class CosineSimilarity extends wordFreqEstimation{
    double cosineSimilarityMethod( String getString1,String getString2){

        Map<String,Integer> docfreq1 = wordFreqEstimationMethod(getString1);
        Map<String,Integer> docfreq2 = wordFreqEstimationMethod(getString2);

    double consine_sim ;
    double mul = 0.0f;
    double fr1 = 0.0f;
    double fr2 = 0.0f;

    for( String key1: docfreq1.keySet()){
        fr1 += Math.pow(docfreq1.get(key1),2);
    }

    for( String key2: docfreq2.keySet()){
        fr2 += Math.pow(docfreq2.get(key2),2);
    }

    for(String key1 : docfreq1.keySet()){
        if(docfreq2.containsKey(key1)){
            mul += docfreq1.get(key1)*docfreq2.get(key1);
        }
    }

    consine_sim = (double) (mul/Math.sqrt((fr1*fr2)));
    return consine_sim;

    }
}*/

package Similarity;
import java.util.*;

public class CosineSimilarityEstimation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text1,text2;

        System.out.println("Enter First String: ");
        text1 = scan.nextLine();
        System.out.println("Enter Second String: ");
        text2 = scan.nextLine();

        CosineSimilarity obj = new CosineSimilarity();

        double result = obj.CosineSimilarityMethod(text1,text2);

        System.out.println("Cosine Similarity between two given String: "+result);
    }
}

class WordFreqEstimation{
    Map<String ,Integer> wordFreqEstimationMethod( String getString){
        Map<String,Integer> wordFreq = new HashMap<String,Integer>();
        Integer count = null;
        String[] token = getString.split(" ");
        String word;

        for ( int i = 0 ; i < token.length ; i++ ){
            word = token[i];
            count = wordFreq.get(word);

            if( count == null ){
                count = 1;
            }
            else {
                count += 1;
            }

            wordFreq.put(word,count);
        }

        return wordFreq;

    }
}
class CosineSimilarity extends WordFreqEstimation {
    double CosineSimilarityMethod( String getString1, String getString2 ){
        Map<String ,Integer>  docFreq1 = wordFreqEstimationMethod(getString1);
        Map<String,Integer> docFreq2 = wordFreqEstimationMethod(getString2);

        double cosine_sim ;
        double mul = 0.0f;
        double fr1 = 0.0f;
        double fr2 = 0.0f;

        for(String key1: docFreq1.keySet()){
            fr1 += Math.pow(docFreq1.get(key1),2);
        }

        for(String key2: docFreq2.keySet()){
            fr2 += Math.pow(docFreq2.get(key2),2);
        }

        for( String key1 : docFreq1.keySet()){
            if(docFreq2.containsKey(key1)){
                mul += docFreq1.get(key1)*docFreq2.get(key1);
            }
        }

        cosine_sim = (double) (mul / Math.sqrt((fr1*fr2))) ;

     return   cosine_sim;
    }


}