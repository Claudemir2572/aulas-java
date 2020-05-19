package dominio;

public class Aluno {
	
	private String nome;
	private int idade;
	private String cidade;
	
	// Construtor implicito
	public Aluno () {}
	
	//Se voce tiver um construtor com um campo ou mais
	//voce se torna obrigado a ter um segundo construtor explicito vazio
	//exemplo
	// public Aluno () {}
	public Aluno ( String nome ) {
		this.nome = nome;
	}
	
	// Construtor 
	public Aluno ( String nome, int idade, String cidade ) {
		this.nome = nome;
		this.idade = idade;
		this.cidade = cidade;
	}
		
	//metodo publico pois precisa ser acessivel ja que o atributo é privado
	//um atributo privado só é acessivel por metodos de dentro da classe
	//String por que retorna uma string
	//getNome por que tem que ser get mais o nome do atributo
	
	// Estes são os getters and setters
	// Set => atribui valore
	// Get => Pega valor
	public String getNome() {
		return nome;
	}
	
	//void por que o setNome nao tem retorno
	// setNome( String nome )
	public void setNome( String nome ) {
		this.nome = nome;
		//nome da classe <= o nome que veio do metodo
	}
	// getIdade() metodo
	public int getIdade() {
		return idade;
	}
	// setIdade( int idade ) metodo com paramentro ( int idade )
	public void setIdade( int idade ) {
		this.idade = idade;
	}	
	
	public String getCidade() {
		return cidade;
	}	
	public void setCidade( String cidade ) {
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", cidade=" + cidade + "]";
	}
	
}

	