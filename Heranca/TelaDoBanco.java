import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TelaDoBanco{
	public static void main(String[] args){
	Conta contaDoAndre = new ContaCorrente();
	
	contaDoAndre.setAgencia("1111");
	contaDoAndre.setConta("2222");
	contaDoAndre.setTitular("Andre");
	
	contaDoAndre.depositar(20.00);
	
	System.out.println("Dados do Cliente.: " + contaDoAndre.toString());
	System.out.println("Saldo => " + contaDoAndre.getSaldo());
	
	ContaPoupanca contaDoClaudemir = new ContaPoupanca();
	
	contaDoClaudemir.setAgencia("4444");
	contaDoClaudemir.setConta("6666");
	contaDoClaudemir.setTitular("Claudemir");
	
	contaDoClaudemir.depositar(100.00);
	
	Double valorComRendimento = contaDoClaudemir.gerarRendimento(0.05, contaDoClaudemir.getSaldo());
	contaDoClaudemir.setSaldo(valorComRendimento);
	
	System.out.println("Dados do Cliente.: " + contaDoClaudemir.toString());
	System.out.println("Saldo => " + contaDoClaudemir.getSaldo());
	
}

}

