/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5;

/**
 *
 * @author dante
 */
public class ListaSimplementeLigada<T> {

    Nodo<T> head;
    int tamanio;

    public ListaSimplementeLigada() {
        head = null;
        tamanio = 0;
    }

    public boolean estaVacia() {
        System.out.println(this.head == null);
        return this.head == null;
    }

    public int getTaminio() {
        System.out.println(this.tamanio);
        return this.tamanio;
    }

    public void agregarAlFinal(T valor) {
        if (this.head == null) {
            head = new Nodo<>(valor);
            tamanio++;
        } else {
            Nodo<T> nuevo = new Nodo<>(valor);
            Nodo<T> aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            tamanio++;
        }
    }

    public void agregarAlInicio(T valor) {
        if (this.head == null) {
            head = new Nodo<>(valor);
            tamanio++;
        } else {
            Nodo<T> nuevo = new Nodo<>(valor);
            nuevo.setSiguiente(head);
            head = nuevo;
        }
        tamanio++;
    }

    public void agregarDespuesDe(T referencia, T valor) {
        if (this.head == null) {
            head = new Nodo<>(valor);
            tamanio++;
        } else {
            Nodo<T> nuevo = new Nodo<>(valor);
            Nodo<T> aux = this.head;
            while (aux.getDato() != referencia) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);

            tamanio++;
        }
    }

    public void eliminar(int posicion) {
        if (head == null) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo<T> aux = this.head;
            for (int i = 0; i < tamanio; i++) {
                if ((i + 1) != posicion) {
                    aux = aux.getSiguiente();
                } else {

                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                }

            }
            tamanio--;

        }

    }

    public void eliminarElPrimero() {
        if (this.head == null) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo<T> aux = this.head;
            this.head = aux.getSiguiente();
        }
        tamanio--;

    }

    public void eliminarElFinal() {
        if (head == null) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo<T> aux = this.head;
            for (int i = 0; i < tamanio; i++) {
                if ((i + 1) != tamanio) {
                    aux = aux.getSiguiente();
                } else {
                    aux.setSiguiente(null);
                }
            }
            tamanio--;
        }

    }

    public void buscar(T valor) {
        if (head == null) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo<T> aux = this.head;
            int indice = 0;
            int B = 0;
            while (aux.getDato() != null && indice<tamanio) {
                if (aux.getDato() != valor) {
                    aux = aux.getSiguiente();
                    indice++;
                } else {
                    B = 1;
                    break;
                }

            }
            if (B == 1) {
                System.out.println("El elemento de encuentra en la posicion " + indice);
            } else {
                System.out.println("El elemento no se cuentra");
            }
        }

    }

    public void actualizar(T buscar, T valor) {
        if (head == null) {
            System.out.println("La lista esta vacia");
        } else {
            Nodo<T> aux = this.head;
            int indice = 0;
            int B = 0;
            while (aux.getDato() != null && indice<tamanio) {
                if (aux.getDato() != buscar) {
                    aux = aux.getSiguiente();
                    indice++;
                } else {
                    aux.setDato(valor);
                    B = 1;
                    break;
                }
               

            }
            if(B==0)
                 System.out.println("El elemento no se cuentra");
        }

    }

    public void transversal() {
        Nodo<T> aux = this.head;
        for (int i = 0; i < tamanio; i++) {
            System.out.println(aux);
            aux = aux.getSiguiente();

        }
    }

}
