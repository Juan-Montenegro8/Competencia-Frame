package Modelo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Argoty implements Runnable {

    private int vuelta = 1;
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    @Override
    public void run() {
        System.out.println("Argoty comienza");

        // Programar la tarea para que se ejecute cada 400 milisegundos
        scheduler.scheduleAtFixedRate(() -> {
            try {
                if (vuelta <= 7) {
                    System.out.println("Argoty VA POR LA VUELTA " + vuelta);
                    vuelta++;
                } else {
                    System.out.println("Argoty terminó");
                    scheduler.shutdown(); // Detener el scheduler cuando termine
                }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }, 0, 400, TimeUnit.MILLISECONDS);
    }

}
