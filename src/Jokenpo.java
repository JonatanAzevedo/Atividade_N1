import java.util.Random;

public class Jokenpo{
    // tesoura = 1;
    // pedra = 2;
    // papel = 3;
    public int jogador = 1;

    public void Jogo(){

        if(jogador == 0){
            System.exit(0);
        }

        Random aleatorio = new Random();
        
        int ia = aleatorio.nextInt(3);
        ia = ia + 1;

        if(jogador == ia) {

            System.out.println("Vocês empataram!");

        } else if(jogador != 3 || ia != 3){

            if(jogador > ia){

                System.out.println("Você ganhou!!");

            } else {

                System.out.println("Você perdeu.");

            }

        } else if(jogador == 3 || ia == 3){

            if(jogador == 1 && ia == 3){

                System.out.println("Você ganhou!!");

            } else{

                System.out.println("Você perdeu.");

            }

        }

    }
}