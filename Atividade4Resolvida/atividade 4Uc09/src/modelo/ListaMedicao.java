
package modelo;

import java.util.ArrayList;
import java.util.List;


public class ListaMedicao {
    private static final List<Medicao> lista = new ArrayList<>();

    public static List<Medicao> Listar() {
        return lista;
    }

    public static void Adicionar(Medicao medicao) {
        lista.add(medicao);
    }

    public static Medicao idMedicao(int id) {
        return lista.get(id);
    }  
}
