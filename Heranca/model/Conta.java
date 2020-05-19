package model;
import regras.RegrasDeContas;

public abstract class Conta implements RegrasDeContas {
	private String agencia;
	private String titular;
	private String conta;
	private Double saldo;
	
	public Conta(){
		this.saldo=0.0;
	}
	
	public Conta(String agencia, String conta, String titular){
		super();
		this.saldo=0.0;
		this.agencia= agencia;
		this.conta= conta;
		this.titular= titular;
	}
	
	public Double getSaldo(){
		return saldo;
	}

	public void setSaldo(Double saldo){
		this.saldo = saldo;
	}
	
	public String getAgencia(){
		return agencia;
	}
	
	public void setAgencia(String agencia){
		this.agencia = agencia;
	}
	
	public String getConta(){
		return conta;
	}
	
	public void setConta(String conta){
		this.conta = conta;
	}
	
	public String getTitular(){
		return titular;
	}
	
	public void setTitular(String titular){
		this.titular= titular;
	}
	
	@Override
	public String toString(){
		return "Conta [Agencia: " + agencia + " Conta: " + conta + " Titular: " + titular + "]";
	}
	
	@Override
	public void sacar(Double valor){
		this.saldo = saldo-valor;
	}
	
	@Override
	public void depositar(Double valor){
		this.saldo = saldo+valor;
	}
}