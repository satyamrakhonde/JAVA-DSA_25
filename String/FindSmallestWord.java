class FindSmallestWord {

    public static void main(String[] args) {

        String input = "This is name Satyam";

        String[] words = input.split(" ");
        String smallest = words[0];

        for (String word : words) {
            if (word.length() < smallest.length())
                smallest = word;
        }
        System.out.println("Smallest word : " + smallest);
    }
}