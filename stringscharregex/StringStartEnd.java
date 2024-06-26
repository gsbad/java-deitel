package stringscharregex;

public class StringStartEnd {
    public static void main(String[] args){
        String[] strings = {"started", "starting", "ended", "ending"};

        for (String string : strings) {
            if(string.startsWith("st"))
                System.out.printf("\"%s\" start with \"st\"%n", string);
        }
        for (String string : strings) {
            if(string.startsWith("art", 2))
                System.out.printf("\"%s\" start with \"art\" at position 2%n", string);
        }
        for (String string : strings) {
            if(string.endsWith("ed"))
                System.out.printf("\"%s\" end with \"ed\"%n", string);
        }
    }
}
