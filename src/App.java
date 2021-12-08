import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        Jokenpo jokenpo = new Jokenpo();

        while(jokenpo.jogador !=0){

            System.out.println("Escolha: \n1 para tesoura \n2 para pedra \n3 para papel \n0 para encerrar");
            jokenpo.jogador = teclado.nextInt();

            jokenpo.Jogo();

        }

        teclado.close();
    }
}
