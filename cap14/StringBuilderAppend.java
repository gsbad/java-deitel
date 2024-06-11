package cap14;

public class StringBuilderAppend {
    public static void main(String[] args) {
        //Metodos append da classe StringBuilder
        Object objectRef = "hello"; //objeto com uma literal string
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 11;
        long longValue = 2222222L;
        float floatValue = 2.2f;
        double doubleValue = 11.11;

        StringBuilder lastBuffer = new StringBuilder("last buffer");
        StringBuilder buffer = new StringBuilder();

        // Obter a nova linha do sistema
        String newLine = System.lineSeparator();

        buffer.append(objectRef)
              .append(newLine)
              .append(string)
              .append(newLine)
              .append(charArray)
              .append(newLine)
              .append(charArray, 0, 3)
              .append(newLine)
              .append(booleanValue)
              .append(newLine)
              .append(characterValue)
              .append(newLine)
              .append(integerValue)
              .append(newLine)
              .append(longValue)
              .append(newLine)
              .append(floatValue)
              .append(newLine)
              .append(doubleValue)
              .append(newLine)
              .append(lastBuffer);
        System.out.printf("%nbuffer contains: %n%s%n", buffer.toString());
    }
}
