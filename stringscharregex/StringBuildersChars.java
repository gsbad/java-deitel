package cap14;

public class StringBuildersChars {
    public static void main(String[] args) {
        //Métodos StringBuilder charAt, setCharAt, getChars, reverse

        //Cria um obj buffer Stringbuilder
        StringBuilder buffer = new StringBuilder("hello there\n");

        System.out.printf("buffer = %s%n", buffer.toString());

        System.out.printf("Character at 0 = %s%nCharacter at 4 = %s%n", buffer.charAt(0), buffer.charAt(4));

        char[] charArray = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), charArray, 0);

        System.out.print("The character is: ");

        for(char c : charArray){
            System.out.print(c);
        }

        buffer.setCharAt(0, 'H');
        buffer.setCharAt(6, 'T');
        
        System.out.printf("buffer = %s%n", buffer.toString());

        buffer.reverse();

        System.out.printf("buffer = %s%n", buffer.toString());

    }
}
