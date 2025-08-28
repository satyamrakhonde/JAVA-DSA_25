public class RemoveBlankSpaces {

    public static void main(String[] args) {
        String sentence = "This is my name";
        String[] words = sentence.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word);
        }

        System.out.println(sb.toString());

        // Alternate way

        String noSpaces = sentence.replace(" ", "");
        System.out.println(noSpaces);
    }
}
