package Arrays;

import java.util.HashMap;

class FrequencyCountOfWords {

    public static void main(String[] args) {

        String sentence = "hello world hello java java world";

        String[] words = sentence.split(" ");

        HashMap<String, Integer> frequencyOfWords = new HashMap<>();

        // getOrDefault
        for (String word : words) {
            frequencyOfWords.put(word, frequencyOfWords.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequencyOfWords);
    }

}