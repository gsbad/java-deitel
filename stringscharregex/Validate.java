package stringscharregex;

public class Validate {
    //valida nome
    public static boolean validateFirstName(String firstName){
        String regex = "[A-Z][a-zA-Z]*";
        return firstName.matches(regex);
    }
    //valida sobrenome
    public static boolean validateLastName(String lastName){
        String regex = "[a-zA-z]+(['-][a-zA-Z]+)*";
        return lastName.matches(regex);
    }
    //valida endereço
    public static boolean validateAddress(String address){
        String regex = "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-z]+)";
        return address.matches(regex);
    }
    //valida cidade
    public static boolean validateCity(String city){
        String regex = "([a-zA-Z]+|[a-zA-Z]+\\s[a-sA-Z]+)";
        return city.matches(regex);
    }
    //valida estado
    public static boolean validateState(String state){
        String regex = "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)";
        return state.matches(regex);
    }
    //valida CEP
    public static boolean validateCEP(String cep){
        String regex = "\\d{5}";
        return cep.matches(regex);
    }
    //valida telefone
    public static boolean validatePhoneNumber(String phone){
        String regex = "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}";
        return phone.matches(regex);
    }
}
