public class MainTarea {

    public static void main(String[] args) {

        Tarea tarea1 = new Tarea();
        tarea1.titulo = "Diseñar base de datos";
        tarea1.responsable = "Ana";
        tarea1.horasEstimadas = 8;

        Tarea tarea2 = new Tarea();
        tarea2.titulo = "Programar login";
        tarea2.responsable = "Luis";
        tarea2.horasEstimadas = 5;

        Tarea tarea3 = new Tarea();
        tarea3.titulo = "Hacer pruebas";
        tarea3.responsable = "Maria";
        tarea3.horasEstimadas = 3;

        tarea2.completar();

        tarea1.mostrarInformacion();
        tarea1.mostrarResponsable();
        tarea1.mostrarEstado();

        tarea2.mostrarInformacion();
        tarea2.mostrarResponsable();
        tarea2.mostrarEstado();

        tarea3.mostrarInformacion();
        tarea3.mostrarResponsable();
        tarea3.mostrarEstado();
    }
}
