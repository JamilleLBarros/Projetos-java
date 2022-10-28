import java.util.Scanner;

public class Numeros{
    public static void main(String[] args) {
        
  
    Scanner ler = new Scanner(System.in);
   
    System.out.printf("Digite o primeiro número:");
    int numero1 = ler.nextInt();

    System.out.printf("Digite o segundo número:");
    int numero2 = ler.nextInt();

    if(numero1 > numero2){
    System.out.println("Diferença de número é " + (numero1-numero2));
    }else{ 
        System.out.print("Diferença de número é " + (numero2-numero1));
    }
}
};