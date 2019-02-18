package aula11;

import javax.swing.JOptionPane;

public class Bolsista extends Aluno{
    
    private double bolsa;

    
    
    
    public Bolsista(double bolsa) {
        this.bolsa = bolsa;
    }

    public Bolsista() {
    }

    
    
    
    
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    
    
    
    public final void renovarBolsa(){
        double x;
        this.setBolsa(Double.parseDouble(JOptionPane.showInputDialog("Valor da bolsa:")));
        x = (this.getPreco()*this.getBolsa() / 100);
        this.setPreco(this.getPreco()-x);
    }
    
    
}
