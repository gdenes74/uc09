
package model;


public class Paciente {
    private String nome;
    private String telefone;
    private String cpf;
    private String data;
    private String ehPaciente;
    private String consultaRealizada;
    private String consultaObservacoes;

    public Paciente(){
        
    }

    public Paciente(String nome, String telefone, String cpf, String data, String ehPaciente, String consultaRealizada, String consultaObservacoes) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.data = data;
        this.ehPaciente = ehPaciente;
        this.consultaRealizada = consultaRealizada;
        this.consultaObservacoes = consultaObservacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEhPaciente() {
        return ehPaciente;
    }

    public void setEhPaciente(String ehPaciente) {
        this.ehPaciente = ehPaciente;
    }

    public String getConsultaRealizada() {
        return consultaRealizada;
    }

    public void setConsultaRealizada(String consultaRealizada) {
        this.consultaRealizada = consultaRealizada;
    }

    public String getConsultaObservacoes() {
        return consultaObservacoes;
    }

    public void setConsultaObservacoes(String consultaObservacoes) {
        this.consultaObservacoes = consultaObservacoes;
    }
}        
    
    

   