package es.etg.dam;

public class Main {

    public static void main(String[] args) {

        Sala sala = new Sala();
        for (10 ) {
            Thread entrada = new Thread(new Entrada(sala));
            entrada.start();
        }
    }
}
