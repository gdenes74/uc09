
package model;


public class Consulta {
    private String nome;
    private String CPF;
    private String Telefone;
    private String dataConsulta;
    private String EhPaciente;
    private Detalhes detalhes;

    
    
    public Consulta (){
        
    }
    
    public Consulta(String nome, String CPF,String Telefone, String dataConsulta, String EhPaciente, Detalhes detalhes) {
        this.nome = nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.dataConsulta = dataConsulta;
        this.EhPaciente = EhPaciente;
        this.detalhes = detalhes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getEhPaciente() {
        return EhPaciente;
    }

    public void setEhPaciente(String EhPaciente) {
        this.EhPaciente = EhPaciente;
    }

    public Detalhes getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(Detalhes detalhes) {
        this.detalhes = detalhes;
    }
    
    
}
