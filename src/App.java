import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        String jogo;
        // crio um objeto leitor para ler valores digitados no teclado
        Scanner leitor = new Scanner(System.in);
        // configurando ( definindo que os separadores é ; OU \r OU \n)
        leitor.useDelimiter("[;\r\n] +");

        System.out.println("QUal seu jogo do momento: ");
        jogo = leitor.next();

        System.out.println("O jogo é : " + jogo);

    }

    @Override
    public String toString() {
        return "App []";
    }
}
