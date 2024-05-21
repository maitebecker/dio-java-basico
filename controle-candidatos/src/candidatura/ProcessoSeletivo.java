package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGSTO",
								"MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		
		String [] selecionados = selecaoCandidatos(candidatos);
		for(String selecionado : selecionados) {
			entrarEmContato(selecionado);
		}
		
	}
	
	static void entrarEmContato(String candidato) {
		int tentativas = 1;
		boolean continuaTentando =  true;
		boolean atendeu = false;
		
		do {
			atendeu = atender();
			continuaTentando = !atendeu;
			if(continuaTentando) {
				tentativas++;
			}
			
			
		}while(tentativas < 3 && continuaTentando);
		
		
		if(atendeu) {
			System.out.println("Contato realizado com sucesso para o candidato " + candidato + " na tentativa " + tentativas);
		}else {
			System.out.println("Contato não realizado com o candidato " + candidato); 
		}
	}
	
	static void imprimrSelecionados() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGSTO"};
		
		System.out.println("Imprimindo selecionados com indice");
		for(int i = 0; i < candidatos.length; i++) {
			System.out.println(("O candidato de número " + (i + 1) + " é " + candidatos[i] ));
		}
		
		System.out.println("Forma abreviada de iteração");
		for (String candidato : candidatos) {
			System.out.println("O candidato  é " + candidato );
		}
	}
	
	static String[] selecaoCandidatos (String [] candidatos) {
		String selecionados[] = new String[5];
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salário "+ salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("o candidato " + candidato + " foi selecionado para a vaga");
				selecionados[candidatosSelecionados] = candidato;
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
		return selecionados;
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contraproprosta");
		}else {
			System.out.println("Aguardadar demais candidatos");
		}
			
	}
	
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
}
