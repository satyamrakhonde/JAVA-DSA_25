public class countVowelConsonents {

    public static void main(String[] args) {
        String input = "aieousrrr";

        // count vowel and consonants

        int vowel = 0;
        int consonants = 0;
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                    || input.charAt(i) == 'o' || input.charAt(i) == 'u' || input.charAt(i) == 's') {
                vowel++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels in String are : " + vowel + " Consonants in String are : " + consonants);
    }
}
