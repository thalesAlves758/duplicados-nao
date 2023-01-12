import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Integer[] lista1 = new Integer[] { 1, 2, 3, 4, 5, 6, 7 };
        Integer[] lista2 = new Integer[] { 8, 9, 1, 7, 0 };

        mostrarElementosIguais(Arrays.asList(lista1), Arrays.asList(lista2));
    }

    public static <T> void mostrarElementosIguais(List<T> lista1, List<T> lista2) {
        lista1.forEach(elemento1 -> {
            lista2.forEach(elemento2 -> {
                if (elemento1.equals(elemento2)) {
                    System.out.println(elemento1.toString());
                }
            });
        });
    }
}
