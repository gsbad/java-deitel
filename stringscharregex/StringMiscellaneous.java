package stringscharregex;

public class StringMiscellaneous {
    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];

        System.out.printf("s1 = %s%n", s1);

        //testa o método length
        System.out.printf("s1.length = %s", s1.length());

        //faz loop pelos caracteres em s1 com charAt e os exibe na ordem inversa
        System.out.printf("%nThe String reversed is:%n");

        for(int c = s1.length() - 1; c >= 0; c--){
            System.out.printf("%c ", s1.charAt(c));
        }

        // copia caracteres a partir da string (s1) para charArray
        s1.getChars(0, 5, charArray, 0);
        System.out.printf("%nThe char array is:%n");
        //itera pelo array de caracteres para provar que a string foi copiada com o uso de getChars
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
