
package model;

public class Lead {
    private String data,nome,telefone, origem,oferta;

    public Lead(String data, String nome, String telefone, String origem, String oferta) {
        this.data = data;
        this.nome = nome;
        this.telefone = telefone;
        this.origem = origem;
        this.oferta = oferta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

   
   
 
}
