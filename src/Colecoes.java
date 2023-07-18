import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Colecoes {
    public static void main(String[] args) throws Exception {
        listaDeNomes();
    }

    public static void listaDeNomes() {
        List<String> lista = new ArrayList<String>();

        lista.add("Mikaela Guedes");
        lista.add("Manoel Guedes");
        lista.add("Alexandre Guedes");
        lista.add("Vinicios Guedes");
        lista.add("Luli Guedes");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
