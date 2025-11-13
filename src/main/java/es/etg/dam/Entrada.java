package es.etg.dam;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Entrada implements Runnable {

    private Sala sala;

    @Override
    public void run() {
        synchronized (sala) {
            sala.incrementar();
        }
    }
}
