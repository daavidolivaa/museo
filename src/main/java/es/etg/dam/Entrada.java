package es.etg.dam;

public class Entrada extends Thread {

    private int sala;

    @Override
    public void run() {
        sala.incrementar();
    }
}
