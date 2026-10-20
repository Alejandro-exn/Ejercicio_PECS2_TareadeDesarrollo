public class Tarea {

    public String titulo;
    public String responsable;

    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo + " | Horas estimadas: " + horasEstimadas);
    }

    public void completar() {
        completada = true;
    }

    void mostrarResponsable() {
        System.out.println("Responsable: " + responsable);
    }

    void mostrarEstado() {
        System.out.println("Completada: " + completada);
    }
}