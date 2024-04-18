import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leirura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leirura.nextLine();

        System.out.println("Qual o ano de lançamento ?");
        int anoDeLancamento = leirura.nextInt();

        System.out.println("Diga sua avaliação para o filme");
        double avaliacao = leirura.nextDouble();

        System.out.println("filme");
        System.out.println("anoDeLancamento");
        System.out.println("avaliacao");
    }
}
