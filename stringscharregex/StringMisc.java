package stringscharregex;

public class StringMisc {
    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];

        System.out.printf("s1: %s%n", s1);

        //testa o metodo length
        System.out.printf("Length of s1: %d%n", s1.length());

        System.out.printf("The string s1 reversed is: %n");

        //testa charAt mostrando o inverso da string
        for(int count = (s1.length() - 1); count >= 0; count--){
            System.out.printf("%s ", s1.charAt(count));
        }

        //copia caracteres  da string para charArray
        s1.getChars(0, 5, charArray, 0);
        System.out.printf("%nThe character array  is: ");

        for (char c : charArray) {
            System.out.print(c);
        }

        System.out.println();

    }
}
