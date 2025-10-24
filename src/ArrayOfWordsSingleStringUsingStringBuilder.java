public class ArrayOfWordsSingleStringUsingStringBuilder {
    public static void main(String[] args) {
        //create an array of words
        String[] words = {"Java", "is", "fun", "to","learn"};

        //create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        //loop for each through the array and append each word
        for(String word : words){
            sb.append(word).append(" "); // add a space after each word
        }

        //convert StringBuilder to a string
        String result = sb.toString().trim();

        //print
        System.out.println("Concatenated word string: " + result);
    }
}
