package aula11;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
    
    protected int matr;
    protected String curso;
    protected boolean mensalidade;
    protected double preco;

    
    
    
    
    public Aluno(int matr, String curso, boolean mensalidade, double preco) {
        this.matr = matr;
        this.curso = curso;
        this.mensalidade = mensalidade;
        this.preco = preco;
    }
    public Aluno() {
        this.setMensalidade(false);
    }

    
    
    
    
    
    protected int getMatr() {
        return matr;
    }

    protected void setMatr(int matr) {
        this.matr = matr;
    }
    protected String getCurso() {
        return curso;
    }

    protected void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(boolean mensalidade) {
        this.mensalidade = mensalidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
   
    
    
    
    
    protected final void pagarMensalidade(){
        JOptionPane.showMessageDialog(null, "Mensalidade paga");
        this.setMensalidade(true);
    }
    
    
    
    protected void informacoes(){
        this.setNome(JOptionPane.showInputDialog("Nome:"));
        this.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
        this.setSexo(JOptionPane.showInputDialog("Sexo:"));
        this.setCurso(JOptionPane.showInputDialog("Curso:"));
        this.setMatr(Integer.parseInt(JOptionPane.showInputDialog("Matricula:")));
        this.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço do curso:")));
    }    
    
    
    
    @Override
    public void status(){
        String m;
        if(this.getMensalidade()){
            m = "Paga";
        }
        else{
            m = "Em aberto";
        }
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\n" +
                                            "Idade: " + this.getIdade() + "\n"+
                                            "Sexo: " + this.getSexo() + "\n" +
                                            "Matricula: " + this.getMatr() + "\n"+
                                            "Curso: " + this.getCurso() + "\n"+
                                            "Mensalidade: " + m + "\n" +
                                            "Preço final: "+ this.getPreco()
                                      );
    }
    
}
