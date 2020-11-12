package Saroj;

public class RemoveString {
    public static String calmString(String string, String word) {
        // Check if the word is present in string If found, remove it
        if (string.contains(word)) {
            string = string.replace("IBIZA", "");
        }
             return string;
            }
    public static void main(String[] args) {
        String string1 = "Blablabla ibiza blabla “IBIZA”, blablabla Ibiza blah blah";
        String word = "IBIZA";

        System.out.println("String Before Replacement \n" +string1);
        /* Without Method*/
        //System.out.println("String After Replacement");
        //System.out.println(string1.replace("IBIZA",""));

        /*with calmstring Method*/
        System.out.println(calmString(string1,word));
    }
}
