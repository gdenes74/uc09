
package model;

import java.util.ArrayList;
import java.util.List;


public class ListaPaciente {
    private static final List <Paciente> lista = new ArrayList<>();
    //criando um metodo listar dando um return para a lista
    public static List<Paciente> Listar(){
        return lista;
    }
    public static void Adicionar(Paciente pac){
        lista.add(pac);
    }
    public static Paciente getPaciente(int id){
        return lista.get(id);
    }
    public static void Atualizar(Paciente pac, int posPaciente){
        lista.set(posPaciente,pac);

    }
    
}
