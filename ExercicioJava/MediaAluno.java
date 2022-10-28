import java.util.Scanner;
public class MediaAluno {
   
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva sua primeira nota:");
        double nota1 = ler.nextDouble();

        System.out.println("Escreva sua segunda nota:");
        double nota2 = ler.nextDouble();

        System.out.println("Escreva sua terceira nota:");
       double nota3 = ler.nextDouble();

        System.out.println("Escreva sua quarta nota:");
        double nota4 = ler.nextDouble();

        double media = (nota1+nota2+nota3+nota4)/4;

        if(media >= 7){
            System.out.println("Parabéns você foi aprovado!!! Sua nota foi " + media );
        }else{
                System.out.println("Sua nota não foi suficiente! Nota:" + media);
               
            }
            
            if(media<7){
           System.out.println("Digite sua nota de recuperação:");
            double notaR = ler.nextDouble();
            double novaNota = (notaR + media)/2;

        if(novaNota >= 7){
            System.out.println("Parabéns, você foi aprovado!!! Sua nota foi " + novaNota);
        }else{

            System.out.println("Infelizmente, você não foi aprovado. Sua nota foi " + novaNota);
        }
      }
     }
    }

