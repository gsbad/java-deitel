package cap14;

public class StringBuilderConstructor {
    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder();
        StringBuilder b2 = new StringBuilder(11);
        StringBuilder b3 = new StringBuilder("hello");

        System.out.printf("%nb1 = \"%s\"", b1);
        System.out.printf("%nb2 = \"%s\"", b2);
        System.out.printf("%nb3 = \"%s\"", b3);
    }
}
