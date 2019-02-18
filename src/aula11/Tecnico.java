package aula11;

import javax.swing.JOptionPane;

public class Tecnico extends Aluno{
    
    
    private int registroProfissional;
    private boolean praticar;

    
    
    
    public Tecnico(int registroProfissional, boolean praticar) {
        this.registroProfissional = registroProfissional;
        this.praticar = praticar;
    }
    public Tecnico() {
        this.setPraticar(false);
    }

    
    
    
    
    
    
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    public boolean getPraticar(){
        return praticar;
    }
    public void setPraticar(boolean praticar){
        this.praticar = praticar;
    }
    
    
    
    public final void praticando(){
        this.setRegistroProfissional(Integer.parseInt(JOptionPane.showInputDialog("Numero do registro:")));
        this.setPraticar(true);
        
        String p;
        if(this.getPraticar()){
            p = "Praticando";
        }
        else{
            p = "Não praticando";
        }
        
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
                                            "Preço final: "+ this.getPreco() + "\n" +
                                            "Pratica: " + p
                                      );
    }
    
    
    
    
}
