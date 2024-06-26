package stringscharregex;

public class StringValueOf {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        boolean b1 = true;
        int i1 = 100;
        long l1 = 10000000000L;
        float f1 = 111111.11F;
        double d1 = 333.333;
        char c1 = 'C';
        Object objeto = "hello";

        //testa o método da classe String.valueOf() de todos os tipos primitivos e ref Object
        System.out.printf("%nString.valueOf(charArray) = %s%n", String.valueOf(charArray));
        System.out.printf("%nString.valueOf(b1) = %s%n", String.valueOf(b1));
        System.out.printf("%nString.valueOf(i1) = %s%n", String.valueOf(i1));
        System.out.printf("%nString.valueOf(l1) = %s%n", String.valueOf(l1));
        System.out.printf("%nString.valueOf(f1) = %s%n", String.valueOf(f1));
        System.out.printf("%nString.valueOf(d1) = %s%n", String.valueOf(d1));
        System.out.printf("%nString.valueOf(c1) = %s%n", String.valueOf(c1));
        System.out.printf("%nString.valueOf(objeto) = %s%n", String.valueOf(objeto));
    }
}
