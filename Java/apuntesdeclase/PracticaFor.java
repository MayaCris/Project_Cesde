package apuntesdeclase;

import java.util.List;
import java.util.ArrayList;

public class PracticaFor {
    //public static void main(String[] args) {
        //List<String> lista = new ArrayList<>(); //List.of("Ciudad1", "Ciudad2", "Ciudad3");

        //lista.add("Medellin ");
        //lista.add("Cartagena");
        //lista.add("Bogota");
        //lista.add("Pasto");

        //for (String cities : lista) {
            //System.out.println(cities);
        //}
   //}

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(15);
        lista.add(20);
        lista.add(25);

        System.out.println(lista);
        System.out.println(lista.size());
// estructura del for
        //i significa en que lugar de la lista estamos parados (en cual indice quiero comenzar)
        //i < lista.size() significa que me va a recorrer la lista  hasta que la posicion del indice sea menor al tamaño de la lista
        // i++ corresponde a la serie de pasos que me va a recorrer la lista
        for (int i = 1; i < lista.size(); i++) {
            Integer elemento = lista.get(i);
            System.out.println(i);
            System.out.println(elemento);
        }
    }

}


