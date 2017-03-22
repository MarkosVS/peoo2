package aula05;
public class Conta {
    private String numConta;
    private Pessoa Titular;
    private double saldo;
    
    public void depositarValor(double quantia){
        this.saldo += quantia;
    }
     public void sacar(double quantia){
         if(this.saldo > 0 && this.saldo > quantia){
             this.saldo -= quantia;
         }
             
     }

    //construtor 
    public Conta (Pessoa p) {
        this.Titular = p;
    }
     
    //getters
    public String getNumConta() {
        return numConta;
    }

    public Pessoa getNomeTitular() {
        return Titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //setters

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setTitular(Pessoa p) {
        this.Titular = p;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
}