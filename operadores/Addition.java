public class Addition{

    public static void main(String args[]){

        java.util.Scanner input = new java.util.Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.print("Digite um número: ");
        number1 = input.nextInt();

        System.out.print("Digite um número: ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("A soma dos dois números é: %d%n", sum);

        // Fechando o scanner após terminar de usá-lo
        input.close();
    }

}