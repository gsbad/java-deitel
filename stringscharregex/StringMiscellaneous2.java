package stringscharregex;

public class StringMiscellaneous2 {
    public static void main(String[] args) {
        //testa os metodos replace, indexOf, lastIndexOf, toLowerCase, toUpperCase, trim, toCharArray
        String s1 = "   trim   ";
        String s2 = "hello";
        String s3 = "Duna - Frank Herbert";
        String s4 = "abcdefghijklmnopqrsuvxyzabcdefghijklmnopqrsuvxyz";

        System.out.printf("%n%ns1.trim = %s", s1.trim());
        System.out.printf("%n%ns2.replace('l', 'L') = %s", s2.replace("l", "L"));
        System.out.printf("%n%ns3.toLowerCase = %s", s3.toLowerCase());
        System.out.printf("%n%ns3.toUpperCase = %s", s3.toUpperCase());
        
        //indexOf
        System.out.printf("%n%ns4.indexOf('c') = %s", s4.indexOf("c"));
        System.out.printf("%n%ns4.indexOf('nop') = %s", s4.indexOf("nop"));

        //lastIndexOf
        System.out.printf("%n%ns4.lastIndexOf('c') = %s", s4.lastIndexOf("c"));
        System.out.printf("%n%ns4.lastIndexOf('nop') = %s", s4.lastIndexOf("nop"));

        //toCharArray
        char[] charArray = s3.toCharArray();

        System.out.printf("%ncharArray = ");
        for (char c : charArray){
            System.err.print(c);
        }
    }
}
