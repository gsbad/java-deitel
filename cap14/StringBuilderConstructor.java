package cap14;

public class StringBuilderConstructor {
    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder();
        StringBuilder b2 = new StringBuilder(11);
        StringBuilder b3 = new StringBuilder("hello");

        System.out.printf("%nb1 = \"%s\"", b1);
        System.out.printf("%nb2 = \"%s\"", b2);
        System.out.printf("%nb3 = \"%s\"", b3);

        //testando metodos da classe StringBuilder: length, setLength, capacity, ensureCapacity
        StringBuilder b4 = new StringBuilder("Dune 2 is a masterpiece of modern cinema!");

        System.out.printf("%nb4 = \"%s\"%nlength = %d%ncapacity = %d%n", b4.toString(), b4.length(), b4.capacity());

        //nova capacidade
        b4.ensureCapacity(77);
        System.out.printf("%nnew capacity = %d%n", b4.capacity());

        //novo tamanho
        b4.setLength(23);
        System.out.printf("%nnew length = %d%nb4 = \"%s\"", b4.length(), b4.toString());

    }
}
