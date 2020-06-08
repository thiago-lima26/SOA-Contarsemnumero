package contasemnumero;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String conjunto1[] = {"aa","bb","cc","dd"};
		String conjunto2[] = {"@","#","$","%","&"};
		
		/* Código feito antes da aula explicativa, compara se os elementos do conjunto1 estão no conjunto 2
		 * 
		 * try (Scanner ler = new Scanner(System.in)) { 
		 * 		String aux;
		 * 		System.out.printf("Digite os objetos para o 1º conjunto: "); 
		 * 		aux = ler.next(); 
		 * 		conjunto1 = formatConj(aux);
		 * 		System.out.printf("\nDigite os objetos para o 2º conjunto: "); 
		 * 		aux = ler.next(); 
		 * 		conjunto2 = formatConj(aux); 
		 * }
		 * int j = 0; int igual = 0;
		 * while(igual == 0 && (j < conjunto1.length || j < conjunto2.length)) { 
		 * 		if (conjunto1[j].equals(conjunto2[j])) { 
		 * 			igual = 0; 
		 * 			j++; 
		 * 		} else 
		 * 			igual = 1; 
		 * } */
		
		if (conjunto1.length == conjunto2.length)
			System.out.printf("São iguais -> Ambos tem " + conjunto1.length + " elementos");
		else
			System.out.printf("São diferentes -> \tConjunto 1 tem " + conjunto1.length + " elementos \n\t\t\tConjunto 2 tem " 
					+ conjunto2.length + " elementos");
	}
		
	public static String[] formatConj(String conjunto) {
		String div[] = conjunto.split(",");
		String novoconj[] = new String[div.length];
		
		for(int i = 0; i < div.length; i++) {
			novoconj[i]= div[i];
		}
		return novoconj;
	}
}