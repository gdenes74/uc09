package Enfermo;

public class Paciente {
    private String txtPaciente;
    private String txtCPF;
    private String txtTelefone;
    private String txtData;
    private String cbPaciente;
    private String ConRe;
    private String ConObs;
    
    public Paciente(){
        
    }

    public Paciente(String txtPaciente, String txtCPF, String txtTelefone, String txtData, String cbPaciente, String ConRe, String ConObs) {
        this.txtPaciente = txtPaciente;
        this.txtCPF = txtCPF;
        this.txtTelefone = txtTelefone;
        this.txtData = txtData;
        this.cbPaciente = cbPaciente;
        this.ConRe = ConRe;
        this.ConObs = ConObs;
    }
    
    
    public String getTxtPaciente() {
        return txtPaciente;
    }

    public String getTxtCPF() {
        return txtCPF;
    }

    public String getTxtTelefone() {
        return txtTelefone;
    }

    public String getTxtData() {
        return txtData;
    }

    public String getcbPaciente() {
        return cbPaciente;
    }
    
    public String getConRe(){
        return ConRe;
    }

    public String getConObs() {
        return ConObs;
    }
    
    
    public void setTxtPaciente(String txtPaciente) {
        this.txtPaciente = txtPaciente;
    }

    public void setTxtCPF(String txtCPF) {
        this.txtCPF = txtCPF;
    }

    public void setTxtTelefone(String txtTelefone) {
        this.txtTelefone = txtTelefone;
    }

    public void setTxtData(String txtData) {
        this.txtData = txtData;
    }

    public void setcbPaciente(String cbPaciente) {
        this.cbPaciente = cbPaciente;
    }
    
    public void setConRe(String ConRe){
        this.ConRe = ConRe;
    }

    public void setConObs(String ConObs) {
        this.ConObs = ConObs;
    }
        
}
