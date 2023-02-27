public class MinhaClasse {

	public static void main(String[] args) {
		String meuNome = "Karina";
		
		int anoDeFabricacao = 2020;
		
		boolean verdadeira = true;
		
		String primeiroNome = "Karina";
		
		String segundoNome = "Ricci";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}



}
