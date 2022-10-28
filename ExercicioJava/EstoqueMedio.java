import java.util.Scanner;
public class EstoqueMedio {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a peça desejada");
        String peca = ler.nextLine();

        System.out.println("Digite o estoque mínimo da peça:");
        int estoqueMI = ler.nextInt();

        System.out.println("Digite o estoque máximo da peça:");
        int estoqueMA = ler.nextInt();

        int media = (estoqueMA-estoqueMI)/2;
        System.out.println("O estoque médio é de " + media);

    }
}
