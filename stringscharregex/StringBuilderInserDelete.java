package stringscharregex;

public class StringBuilderInserDelete {
    public static void main(String[] args) {
        Object objectRef = "hello"; //objeto com uma literal string
        String string = "goodbye";
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 11;
        long longValue = 2222222L;
        float floatValue = 2.2f;
        double doubleValue = 11.11;

        StringBuilder buffer = new StringBuilder();

        buffer.insert(0, objectRef)
              .insert(0, " ")
              .insert(0, string)
              .insert(0, " ")
              .insert(0, charArray)
              .insert(0, " ")
              .insert(0, booleanValue)
              .insert(0, " ")
              .insert(0, characterValue)
              .insert(0, " ")
              .insert(0, integerValue)
              .insert(0, " ")
              .insert(0, longValue)
              .insert(0, " ")
              .insert(0, floatValue)
              .insert(0, " ")
              .insert(0, doubleValue);

              System.out.printf("%nbuffer contains: %n%s%n", buffer.toString());

              buffer.deleteCharAt(21);
              buffer.delete(1, 4);

              System.out.printf("%nbuffer after deletes: %n%s%n", buffer.toString());
    }
}
