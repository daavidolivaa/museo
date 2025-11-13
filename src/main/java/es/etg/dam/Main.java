package es.etg.dam;

public class Main {

    public static void main(String[] args) {

        Sala sala = new Sala(100);

        for (int i = 0; i < 1000; i++) {
            Thread entrada = new Thread(new Entrada(sala));
            entrada.start();
        }

        for (int i = 0; i < 1000; i++) {
            Thread salida = new Thread(new Salida(sala));
            salida.start();
        }

        System.out.println(sala.getCantidad());

    }
}
