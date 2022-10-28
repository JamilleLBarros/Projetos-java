import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a grade de funcionários:");
        String funcionarios = ler.nextLine();

        System.out.println("Digite seus salários:");
        float Salario1= ler.nextInt();
        System.out.println("Digite seus salários:");
        float Salario2= ler.nextInt();
        System.out.println("Digite seus salários:");
        float Salario3= ler.nextInt();

        float media = (Salario1+Salario2+Salario3)/3;
        System.out.println(media);

     
    }
}
