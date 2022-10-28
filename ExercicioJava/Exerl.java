import java.util.Scanner;;
public class Exerl {
    public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

        System.out.println("Escreva o primeiro número ");
        int numero1 = ler.nextInt();

        System.out.println("Escreva o segundo número ");
        int numero2 = ler.nextInt();

        if(numero1>numero2){
            System.out.println("O menor número é " + numero2 + " e o maior é " + numero1);
        }else if(numero2>numero1){
            System.out.println("O menor número é " + numero1+ " e o maior é " + numero2);
        }else{
            System.out.println("Os números são iguais");
        }





    }
}
