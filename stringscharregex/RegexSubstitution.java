package cap14;

import java.util.Arrays;

public class RegexSubstitution {
    public static void main(String[] args) {
        String firsString = "\n\nThis sentence ends in 5 stars *****";
        String secondString = "1, 2, 3, 4, 5, 6, 7, 8";

        System.out.printf("Original string 1: %s%n", firsString);

        //substitui '*' por '^'
        firsString = firsString.replaceAll("\\*", "^");

        System.out.printf("^ substituted for *: %s%n", firsString);

        //substitui astereiscos por circunflexos
        firsString = firsString.replaceAll("stars", "carets");

        System.out.printf("stars substituted for carets: %s%n", firsString);

        //substitui palavras por 'palavra'
        System.out.printf("Every word replaced by \"word\": %s%n" , firsString.replaceAll("\\w+", "palavra"));

        System.out.printf("Original string 2: %s%n", secondString);

        //substitui os primeiros 3 digitos digito 'digito'
        for(int i = 0; i < 3; i++)
            secondString = secondString.replaceFirst("\\d", "digit");
        
        System.out.printf("First 3 digits replaced by \"digit\": %s%n%n", secondString);

        System.out.print("String split at commas: ");

        String[] results = secondString.split(",\\s*"); //divide em virgulas

        System.out.println(Arrays.toString(results));
        

    }
}
