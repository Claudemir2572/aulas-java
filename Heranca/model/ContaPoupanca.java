package model;

public class ContaPoupanca extends Conta {
	
	public Double gerarRendimento(Double valor, Double saldoNovo) {
		saldoNovo = (saldoNovo) * (1.0 + valor);
		return saldoNovo;
	}
}