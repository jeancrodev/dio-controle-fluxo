import java.util.Scanner;

public class Contador {
    public static void main (String args[]) throws ParametrosInvalidosException{
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        try {
        System.out.print("Insira o primeiro número: ");
        numero1 = teclado.nextInt();
        System.out.print("Insira o último número: ");
        numero2 = teclado.nextInt();
        String numeros = numeroMenor(numero1, numero2);
        int iteracoes = numero2 - numero1;
        for (int i = 1; i <= iteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
        } catch (Exception e) {
            System.out.print("Insira um número final menor que o inicial");
            }teclado.close();
        }

    static String numeroMenor(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1 > numero2){
            throw new ParametrosInvalidosException();
        }return"Insira um número final menor que o inicial";
    }
}
