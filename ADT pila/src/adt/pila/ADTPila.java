package adt.pila;

public class ADTPila {

    public static void main(String[] args) {
        Pilas<String> pilaPrueba = new Pilas();
        System.out.println("-----Metodo isEmpty-----");
        pilaPrueba.isEmpty();
        System.out.println("-----Metodo length-----");
        pilaPrueba.length();
        System.out.println("-----Metodo push-----");
        pilaPrueba.push("Quesadilla");
        pilaPrueba.push("Taco");
        pilaPrueba.push("Chilaquil");
        pilaPrueba.push("Sope");
        System.out.println("-----Metodo isEmpty-----");
        pilaPrueba.isEmpty();
        System.out.println("-----Metodo length-----");
        pilaPrueba.length();
        System.out.println("-----Metodo peek-----");
        pilaPrueba.peek();
        System.out.println("-----Metodo pop-----");
        pilaPrueba.pop();
        System.out.println("-----Metodo peek-----");
        pilaPrueba.peek();
        System.out.println("---------------------------");
        System.out.println("-----Pila con limite-----");
        PilaLimitada<String> pilaPrueba2 = new PilaLimitada(4);
        pilaPrueba2.push("Quesadilla");
        pilaPrueba2.push("Taco");
        pilaPrueba2.push("Chilaquil");
        pilaPrueba2.push("Sope");
        System.out.println("-----Metodo isFull-----");
        pilaPrueba2.isFull();
        System.out.println("-----Metodo push con la pila llena-----");
        pilaPrueba2.push("Tortilla");
        pilaPrueba2.peek();

    }

}
