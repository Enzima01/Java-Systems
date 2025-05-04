
public class Animal {
	
	String nome;
	String tipo;
	int idade;

	void exibirDados() {
		System.out.println("========== DADOS ==========");
		System.out.println("Nome: " + nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Idade: " + idade);
		
	}
	
	void falar() {
		if(tipo.equalsIgnoreCase("Cachorro")) {
			System.out.println("Som emitido pelo " + tipo + ": Au Au!");
		}
		else if(tipo.equalsIgnoreCase("Gato")){
			System.out.println("Som emitido pelo " + tipo + ": Miau!");
		}else if(tipo.equalsIgnoreCase("Passaro")) {
			System.out.println("Som emitido pelo " + tipo + ": Piu Piu!");
		}
		else {
			System.out.println("Som desconhecido");
		}
		System.out.println("===========================");
		
	}
}
