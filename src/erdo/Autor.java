package erdo;

public class Autor {
	private String nome;
	private String sobrenome;
	private int number;
	
	
	public Autor(String nome, String sobrenome) {
		this.nome=nome;
		if(sobrenome.charAt(sobrenome.length()-1)==',') {
			this.sobrenome=sobrenome.replace(",","");
		}else{
			this.sobrenome=sobrenome.replace(".","");
		}
		
	}
	public Autor(String nome, String sobrenome, int number) {
		this.nome=nome;
		this.number=number;
		this.sobrenome=sobrenome;
		
	}
	
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setSobrenome(String n) {
		this.sobrenome = n;
	}
}
