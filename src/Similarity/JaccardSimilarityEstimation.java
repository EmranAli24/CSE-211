package Similarity;
import java.util.*;
public class JaccardSimilarityEstimation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String doc_1,doc_2;
        System.out.println("Enter First String: ");
        doc_1 = sc.nextLine();
        System.out.println("Enter Second String: ");
        doc_2 = sc.nextLine();

        JaccardSimilarity  obj = new JaccardSimilarity();

        float result = obj.similarityCalc(doc_1,doc_2);
        System.out.println(result);
    }

}

class JaccardSimilarity{
    float similarityCalc( String getString1,String getString2){
//        Set<String> set1 = new HashSet<>(Arrays.asList(getString1.split(" ")));

        Set<String> set1 = new HashSet<>(Arrays.asList(getString1.split(" ")));
        Set<String> set2 = new HashSet<>(Arrays.asList(getString2.split(" ")));
       // Set<String> set2 = new HashSet<>(Arrays.asList(getString2.split(" ")));

        // Intersection ( common words )
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        // Union ( all unique words )
        Set<String > union = new HashSet<>(set1);
        union.addAll(set2);

        float result = (float) intersection.size() / union.size();

        return result;
    }
}