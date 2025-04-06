package Laboratorio.punto1;

public class ListaEnlazadaSimple {
    private Nodo primero;
    private int tamanio;

    public ListaEnlazadaSimple() {
        this.primero = null;
        this.tamanio = 0;
    }

    public void agregarAlFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamanio++;
    }

    public void mostrarPosicionesImpares() {
        Nodo actual = primero;
        int posicion = 0;
        System.out.print("Valores en posiciones impares: ");
        while (actual != null) {
            if (posicion % 2 != 0) {
                System.out.print(actual.getValor() + " ");
            }
            actual = actual.getSiguiente();
            posicion++;
        }
        System.out.println();
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }
}


