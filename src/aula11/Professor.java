package aula11;

import javax.swing.JOptionPane;

public class Professor extends Pessoa{
    
    
    private String especialidade;
    private double salario;

    
    
    
    
    
    public Professor(String especialidade, double salario) {
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public Professor() {
    }

    
    
    
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    public final void receberAumento(){
        this.setSalario(this.getSalario()+Double.parseDouble(JOptionPane.showInputDialog("Valor do aumento:")));
    }
    
    
    
    protected void informacoes(){
        this.setNome(JOptionPane.showInputDialog("Nome:"));
        this.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
        this.setSexo(JOptionPane.showInputDialog("Sexo:"));
        this.setEspecialidade(JOptionPane.showInputDialog("Especialidade:"));
        this.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salario:")));
    }  
    
    
    
    
    @Override
    public void status(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\n" +
                                            "Idade: " + this.getIdade() + "\n"+
                                            "Sexo: " + this.getSexo()  + "\n" +
                                            "Especialidade: " + this.getEspecialidade() + "\n" +
                                            "Salario: " + this.getSalario()
                                      );
    }
    
}
