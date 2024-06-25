package cap14;

public class StringCompare {
    public static void main(String[] args) {
        //declaração de variaveis
        String s1 = new String("hello");
        String s2 = "goodbye";
        String s3 = "Happy Birthday";
        String s4 = "happy birthday";
        //teste de uso dos metodos equals, equalsIgnoreCase e regionMatches
        
        //teste de igual usando o metodo 'equals' que é um metodo da classe Object e sobrescrito pela classe String
        if(s1.equals("hello"))
            System.out.printf("%ns1 igual a \"hello\"");

        //testa quanto à igualdade com ==
        if(s1 == "hello")
            System.out.printf("%ns1 igual a \"hello\"");
        else
            System.out.printf("%ns1 nao é igual a literal \"hello\""); //nao é igual pq a literal "hello" nao é o mesmo que um objeto String contendo uma literal "hello"


        //testa quanto à igualdade(ignora maiusculas e minusculas)
        if(s3.equalsIgnoreCase(s4))
            System.out.printf("%ns3 é igual a s4 (se o case for ignorado)");

        //testa regionMatches
        if(s3.regionMatches(0, s4, 0, 5))
            System.out.printf("%nPrimeiros 5 caracteres de s3 e s4 sao iguais");
        else    
            System.out.printf("%nPrimeiros 5 caracteres de s3 e s4 nao sao iguais");

        //testa regionMatches(ignora maiuscula e minusculas)s
        if(s3.regionMatches(true, 0, s4, 0, 5))
            System.out.printf("%nPrimeiros 5 caracteres de s3 e s4 sao iguais (se o case for ignorado)%n");
        else    
            System.out.printf("%nPrimeiros 5 caracteres de s3 e s4 nao sao iguais (se o case for ignorado)%n");
    }
}
