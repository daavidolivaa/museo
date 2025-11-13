package es.etg.dam;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Sala {
    @Getter
    private int cantidad;

    public void incrementar() {
        cantidad++;
        System.out.println(cantidad);
    }

    public void decrementar() {
        if (cantidad > 0) {
            cantidad--;
        }
        System.out.println(cantidad);
    }

}
