/**
 * 
 */
package aluno;

import java.util.Scanner;

/**
 * @author Celia
 *
 */
public class Aluno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       float n1,n2,tr;
	        int idade,numero;
	        String nome;
	        char genero;
	        float media;  
	        Scanner ler = new Scanner(System.in);
	       
	        System.out.print("Introduza o numero do aluno: ");
	        numero=ler.nextInt();
	        ler.nextLine();
	        System.out.print("Introduza o nome e apelido: ");
	        nome=ler.nextLine();
	        System.out.print("Introduza o Genero: ");
	        genero=ler.next().charAt(0);
	        System.out.print("Introduza a Idade: ");
	        idade=ler.nextInt();
	        System.out.print("Introduza a nota 1: ");
	        n1=ler.nextFloat();
	        System.out.print("Introduza a nota 2: ");
	        n2=ler.nextFloat();
	        System.out.print("Introduza a nota do trabalho: ");
	        tr=ler.nextFloat();
	       
	        media = (n1+n2+tr)/3;
	        
	        System.out.println("Nome: "+nome);
	        System.out.println("Genero: "+genero);
	        System.out.println("Idade: "+idade);
	        System.out.println("Nota 1: "+n1);
	        System.out.println("Nota 2: "+n2);
	        System.out.println("Nota trab: "+tr);
	        System.out.println("Média: "+String.format("%.2f", media));
	        System.out.println("Média arredondada: "+Math.round(tr));

	}

}
