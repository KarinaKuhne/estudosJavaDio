package metodo.dio;

public class MinhaClasse {

	public static void main(String[] args) {
		
		int anoDeFabricacao = 2020;
		System.out.println(anoDeFabricacao);
		
		boolean verdadeira = true;
		System.out.println(verdadeira);
		
		String primeiroNome = "Karina";
		
		String segundoNome = "Ricci";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}

}
