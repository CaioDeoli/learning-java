import java.util.Scanner;

public class BodyMassIndex {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Peso: ");
		int peso = entrada.nextInt();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		
		boolean abaixoPesoIdeal = imc < 18.5;
		
		// if -> estrutura de controle condicional
		// so executa o bloco de codigo de a expressao for verdadeira
		// o fluxo da execucao depende da mensagem do usuario
		if (imc < 18.5) {
			System.out.println("Abaixo do peso ideal.");
		}
		// tambem pode ser sem as chaves, elas sao opcionais
		// mas apenas quando tem apenas uma linha apos
		// nao eh recomendado nao fazer sem as chaves
		
		// atencao quando criar varias instrucoes de if para duas nao serem realizadas sem intencao
		
		if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso ideal");
		}
		
		if (imc >= 25 && imc < 30) {
			System.out.println("Acima do peso.");
		}
		
		if (imc >= 30 && imc < 35) {
			System.out.println("Obesidade grau I.");
		}
		
		if (imc >= 35 && imc < 40) {
			System.out.println("Obesidade grau II.");
		}
		
		if (imc >= 40) {
			System.out.println("Obesidade grau III.");
		}
		
		System.out.println("Fim do programa");
	}
	
}