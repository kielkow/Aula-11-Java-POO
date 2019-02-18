package aula11;

import javax.swing.JOptionPane;

public abstract class Pessoa{ 
    
    protected String nome;
    protected String sexo;
    protected int idade;

    
    
    
    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    public Pessoa() {
    }

    
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
    
    public final void fazerAniver(){
        this.setIdade(this.getIdade()+1);
    }
    
    
    protected void status(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\n" +
                                            "Idade: " + this.getIdade() + "\n"+
                                            "Sexo: " + this.getSexo()                                 
                                      );
    }
    
    
    
    
}
