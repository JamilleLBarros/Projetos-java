import java.util.Scanner;
import java.util.zip.CRC32;

public class VerificarCodigo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int CODIGO;

        System.out.println("Verificador de Código");
        System.out.println("Digite: 1,2 ou 3");
        System.out.println("Digite Código: ");
        CODIGO = entrada.nextInt();

        switch(CODIGO){
            case 1:
            System.out.println("um");
            break;

            case 2:
            System.out.println("dois");
            break;

            case 3:
            System.out.println("três");
            break;

            default:
            System.out.println("Código Inválido ");
            
        }
    }
}
