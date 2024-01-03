package Enfermo;

import java.util.ArrayList;
import java.util.List;

public class ListaPaciente {
    
    private static final List<Paciente> lista = new ArrayList<>();
    
    public static List<Paciente> Listar(){
        return lista;
    }
    
    public static void Adicionar(Paciente paciente){
        lista.add(paciente);
    }
    
    public static Paciente getPaciente(int id){
      return lista.get(id);
    }
    
    public static void Atualizar(Paciente paciente, int posPaciente){
        lista.set(posPaciente, paciente);
    }
}
