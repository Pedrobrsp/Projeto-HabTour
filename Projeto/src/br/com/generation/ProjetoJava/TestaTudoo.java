package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class TestaTudoo {

	// Declarando ANSI_RESET para que podemos resetar a cor
    public static final String ANSI_RESET = "\u001B[0m";
    // Declarando as cores
    // declara��o customizada
    public static final String ANSI_Verde="\u001B[32m";
    public static final String ANSI_Ciano = "\u001B[36m";
    public static final String ANSI_White = "\u001B[37m";
    public static final String ANSI_amarelo="\u001B[33m";
    public static final String ANSI_azul =  "\u001B[34m";
    public static final String ANSI_roxo =  "\u001B[35m";
    public static final String ANSI_preto = "\u001B[30m";
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boasvindas();
		//recebendo o nome
		System.out.println(ANSI_Ciano+"Digite seu nome: "+ ANSI_RESET);
		String nome = input.nextLine();
		//verificando se o usuario nao esta digitando numeros 
		while(!matchesOnlyText(nome)){
			System.err.println("Voc� n�o pode inserir n�meros ou caracteres especiais no nome.");
			System.out.println(ANSI_Ciano+"Digite seu nome: "+ ANSI_RESET);
			nome = input.nextLine();
		}
			System.out.println(ANSI_Ciano+"Qual sua idade?"+ ANSI_RESET);
			int i = input.nextInt();
		//criando objeto com os parametros do m�todo construtor Usuario()
		Usuario u1 = new Usuario(nome,i);
		
		//indo para a primeira pergunta
		
		System.out.println();
		System.out.println();
		System.out.println(ANSI_Ciano+"Vamos para a primeira pegunta..."+ANSI_RESET);
		//perguntando se fuma
		System.out.println(ANSI_Ciano+u1.getNome() + ",voc� fuma? Digite '1' para sim, e digite '2' para n�o."+ANSI_RESET);
		int fumoint = input.nextInt();
		double gastofumo = 0.0;
		if(fumoint == 1) {
			System.out.println(ANSI_Ciano+u1.getNome() + ",quanto em dinheiro voc� gasta com cigarros por dia?"+ANSI_RESET);
			gastofumo = input.nextDouble();
		}
		//criando objeto para classe recebendo os dados de quem fuma
		Pesquisaa f1 = new Pesquisaa();
			f1.verificafuma(fumoint,gastofumo);
			
			System.out.println();
			System.out.println();
		//indo para a segunda pergunta
			System.out.println(ANSI_Ciano+"Vamos para a segunda pergunta..."+ANSI_RESET);
		//perguntando se bebe
			System.out.println(ANSI_Ciano+u1.getNome()+",voc� costuma beber bebidas alc�olicas? Digite '1' para sim e '2' para n�o? "+ANSI_RESET);
			int bebe = input.nextInt();
			String naobebe = "";
			//criando objeto para bebe
			Pesquisaa b1 = new Pesquisaa();
			 if (bebe == 1) {
				 System.out.println(ANSI_Ciano+"Quantas latas de cerveja por dia?(o ideal � 2 latas)"+ANSI_RESET);
				 int latas = input.nextInt();
					System.out.println(ANSI_Ciano+"Quantos MLs de destilado por dia?(o ideal � 35ml)"+ANSI_RESET);
					int mlsdes = input.nextInt();
					System.out.println(ANSI_Ciano+"Quantas ta�as de vinho por dia?(o ideal � 90 ml)"+ANSI_RESET);
					int taca = input.nextInt();
					//puxando metodo verificabebe()
					b1.verificabebe(latas, mlsdes, taca);
			 }else if(bebe == 2) {
				 naobebe =ANSI_amarelo+"Desse jeito evitamos o desenvolvimento de doen�as cr�nicas,\r\n"
				 		+ "incluindo hipertens�o arterial, doen�a card�aca, acidente vascular cerebral,\r\n "
				 		+ "doen�a hep�tica e problemas digestivos,\r\n"
				 		+ "e problemas de sa�de/mental causados pelo �lcool,incluindo depress�o e ansiedade"+ANSI_RESET;
			 }
			 
			 System.out.println();
			System.out.println();
		//indo para a terceira pegunta
		System.out.println(ANSI_Ciano+"Vamos para a terceira pergunta..."+ANSI_RESET);
		System.out.println(ANSI_Ciano+u1.getNome()+", quantas horas por dia voc� fica nas redes sociais?"+ANSI_RESET);
		int horasr = input.nextInt();
		System.out.println(ANSI_Ciano+"� por trabalho ou lazer? '1'-lazer/'2'-trabalho"+ANSI_RESET);
		int redetrab = input.nextInt();
		//criando objeto para rede social
		Pesquisaa r1 = new Pesquisaa();
		//puxando metodo verificarede()
		r1.verificaredes(horasr,redetrab);
		System.out.println();
		System.out.println();
		//indo para a quarta pergunta
		System.out.println(ANSI_Ciano+"Vamos para a quarta pergunta..."+ANSI_RESET);
		System.out.println(ANSI_Ciano+u1.getNome()+" quantas horas por dia voc� passa jogando jogos eletr�nicos?"+ANSI_RESET);
		int horasj = input.nextInt();
		System.out.println(ANSI_Ciano+"� por trabalho ou lazer? '1'-lazer/'2'-trabalho"+ANSI_RESET);
		int jogostrab = input.nextInt();
		//criando objeto para jogos
		Pesquisaa j1 = new Pesquisaa();
		//puxando metodo verificajogos()
		j1.verificarjogos(horasj, jogostrab);
		//printando as respostas para o usuario
		f1.respostafumo();
		System.out.println();
		if(bebe ==1) {
			System.out.println(ANSI_amarelo+"-------Feedback sobre beber--------"+ANSI_RESET);
			b1.respostabebe();
		}else if(bebe==2) {
			System.out.println(ANSI_amarelo+"-------Feedback sobre beber--------"+ANSI_RESET);
			System.out.println(naobebe);
		}else {
			System.err.println("Voc� digitou uma op��o inv�lida por isso n�o fizemos nenhuma verifica��o(beber)");
		}
		System.out.println();
		r1.respostaredes();
		System.out.println();
		j1.respostajogos();
		
		input.close();
		
		System.out.println(ANSI_Ciano+"------------------------------------------------------------"+ANSI_RESET);
		System.out.println(ANSI_Ciano+"Obrigado(a) por participar de nossas pesquisas, "+u1.getNome()
		+" espero que nosso programa ajude."+ANSI_RESET);

}
	
	public static boolean matchesOnlyText(String text) {
	    return text.matches("[a-zA-Z\\s]+");
	}

	static void boasvindas() {
		System.out.println(ANSI_amarelo+"============================================================="+ANSI_RESET);
		System.out.println(ANSI_amarelo+"====                                                      ==="+ANSI_RESET);
		System.out.println(ANSI_amarelo+"====                                                      ==="+ANSI_RESET);
		System.out.println(ANSI_amarelo+"====              SEJA BEM VINDE!!!                       ==="+ANSI_RESET);
		System.out.println(ANSI_amarelo+"====                <Habtour/>                            ==="+ANSI_RESET);
		System.out.println(ANSI_amarelo+"====                                                      ==="+ANSI_RESET);
		System.out.println(ANSI_amarelo+"====                                                      ==="+ANSI_RESET);
		System.out.println(ANSI_amarelo+"============================================================="+ANSI_RESET);
		
		System.out.println();
	}
	

		
	}





