
package model;


public class Detalhes {
    private String consultaRealizada;
    private String receitaEObservacao;
    private int consultaSelecionada;
    public Detalhes (){
        
        
    }

    public Detalhes(String consultaRealizada, String receitaEObservacao, int consultaSelecionada) {
        this.consultaRealizada = consultaRealizada;
        this.receitaEObservacao = receitaEObservacao;
        this.consultaSelecionada = consultaSelecionada;
    }

    public String getConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(String consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

    public String getReceitaEObservacao() {
        return receitaEObservacao;
    }

    public void setReceitaEObservacao(String receitaEObservacao) {
        this.receitaEObservacao = receitaEObservacao;
    }

    public int getConsultaSelecionada() {
        return consultaSelecionada;
    }

    public void setConsultaSelecionada(int consultaSelecionada) {
        this.consultaSelecionada = consultaSelecionada;
    }
    
}
