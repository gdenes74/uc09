
package modelo;


public class Medicao {
    
    private String data;
    private String hora;
    private String pressaoSistolica;
    private String pressaoDiastolica;
    private String estresse;

    public Medicao(){
        
    }

    public Medicao(String data, String hora, String pressaoSistolica, String pressaoDiastolica, String estresse) {
        this.data = data;
        this.hora = hora;
        this.pressaoSistolica = pressaoSistolica;
        this.pressaoDiastolica = pressaoDiastolica;
        this.estresse = estresse;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPressaoSistolica() {
        return pressaoSistolica;
    }

    public void setPressaoSistolica(String pressaoSistolica) {
        this.pressaoSistolica = pressaoSistolica;
    }

    public String getPressaoDiastolica() {
        return pressaoDiastolica;
    }

    public void setPressaoDiastolica(String pressaoDiastolica) {
        this.pressaoDiastolica = pressaoDiastolica;
    }

    public String getEstresse() {
        return estresse;
    }

    public void setEstresse(String estresse) {
        this.estresse = estresse;
    }
    
}
