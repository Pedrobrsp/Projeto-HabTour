package br.com.generation.ProjetoJava;

public class Pesquisaa {
	
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
	//verifica fumar � receber dados
			private int fumoint;
			private double gastofumo;
			void verificafuma(int _fumoint, double _gastofumo) {
				this.fumoint = _fumoint;
				this.gastofumo = _gastofumo;
				}
			//resposta para quem fuma
					void respostafumo() {
						if(fumoint == 1) {
							malfumo();
					}else if (fumoint == 2) {
						parabensfumo();
					}else {
						System.err.println("Voc� digitou uma op��o inv�lida por isso n�o fizemos a verifica��o(fumo)");
					}
					}
			
			//verifica  beber
			private int latas;
			private int mlsdes;
			private int taca;
			void verificabebe(int _latas, int _mlsdes,int _taca) {	
					//recebendo se a pessoa bebe ou nao
					this.latas = _latas;
					this.mlsdes = _mlsdes;
					this.taca = _taca;		
			}
			//resposta para quem bebe
					void respostabebe() {
						if(latas > 2) {
						latas = latas - 2;
							malbebecerveja();
						}else if(latas <= 2 && latas >0) {
							idealbebecerveja();
						}
						if(mlsdes > 35){
							mlsdes = mlsdes - 35;
							malbebedestilado();
						}else if(mlsdes <=35 && mlsdes > 0){
							idealbebedestilado(); 
						}
						if(taca > 90) {
							taca = taca-90;
							malbebevinho();
						}else if(taca <=90 && taca >0) {
							idealbebevinho();
						}
					}
					private int horasr;
					private int redetrab;
			//verfica redes
					void verificaredes(int _horasr,int _redetrab) {
						this.horasr = _horasr;
						this.redetrab = _redetrab;
					}
			//resposta redes
					void respostaredes() {
						if(redetrab == 1) {
							if(horasr == 0 ) {
								System.out.println(ANSI_Ciano+"Feedback Sobre as redes sociais"+ANSI_RESET);
								System.out.println(ANSI_Ciano+"Pelo visto voc� n�o usa redes sociais,"
										+ " portanto n�o h� riscos a sua sa�de em rela��o a isso (Redes sociais)"+ANSI_RESET);
							}else if(horasr >=1 && horasr <=3) {
								aceitavelrede();
							}else if(horasr >3 && horasr <=7) {
								alertarede();
							}else if(horasr>7) {
								malrede();
							}
						}else if(redetrab ==2) {
							if(horasr == 0 ) {
								System.out.println(ANSI_Ciano+"Feedback Sobre as redes sociais"+ANSI_RESET);
								System.out.println(ANSI_Ciano+"Pelo visto voc� n�o usa redes sociais,"
										+ " portanto n�o h� riscos a sua sa�de em rela��o a isso (Redes sociais)"+ANSI_RESET);
							}else if(horasr >= 1 && horasr <=3) {
								aceitavelredetrab();
							}else if(horasr >=3 && horasr <=7) {
								alertaredetrab();
							}else if(horasr>7) {
								malredetrab();
							}
						}else {
							System.err.println("parece que voc� digitou uma op��o inv�lida, portanto n�o fizemos a verifica��o(redes)");
						}
					}
			
			//verifica jogos
			private int horasj;
			private int jogostrab;
			int exchorasj;
				void verificarjogos(int _horasj, int _jogostrab) {
					this.horasj=_horasj;
					this.jogostrab=_jogostrab;
				}
				
				//resposta jogos
				void respostajogos() {
					if(jogostrab == 1) {
						if(horasj == 0) {
							System.out.println(ANSI_Ciano+"Parece que voc� n�o joga,"
									+ " portanto nao ter� nenhum risco a sa�de em rela��o a isso."+ANSI_RESET);
						}else if(horasj >2 ) {
							 exchorasj = horasj-2;
							 maljogos();
						}else {
							idealjogos();
						}
					}else if(jogostrab ==2) {
						if(horasj == 0) {
							System.out.println(ANSI_Ciano+"Parece que voc� n�o joga,"
									+ " portanto n�o ter� nenhum risco a sa�de em rela��o a isso."+ANSI_RESET);
						}else if(horasj >2 ) {
							 exchorasj = horasj-2;
							maljogostrabalha();
						}else {
							idealjogostrabalha();
						}
					}else {
						System.err.println("Parece que voce digitou uma op��o inv�lida, portanto n�o fizemos a verifica��o(jogos).");
					}
				}
			
			//mal fumo
			void malfumo() {
				System.out.println(ANSI_amarelo+"-------Feedback sobre Cigarro-------"+ANSI_RESET);
				System.out.println(ANSI_amarelo+"� bom repensar aquele cigarro di�rio se voc� quer melhorar o seu sistema imunol�gico. Segundo o INCA,\r\n "
						+ "o tabagismo surge como um dos inimigos das defesas do corpo e propicia aos fumantes uma chance bem maior de adoecer quando comparados aos n�o-fumantes.\r\n"
						+ " N�o importa sua idade, parar de fumar sempre vale a pena. Parar aumenta a expectativa e a qualidade de vida.\r\n"
						+ "Os benef�cios podem ser percebidos em qualquer faixa et�ria, mas quanto mais cedo o fumante parar, mais sa�de ele ter�, como refor�a o Minist�rio da Sa�de."+ANSI_RESET);
				this.gastofumo = this.gastofumo *365;
				System.out.println(ANSI_amarelo+"Essa � a quantia por ano gasta em cigarros: " + this.gastofumo+ANSI_RESET);
			}
			void parabensfumo(){
				System.out.println(ANSI_amarelo+"-------Feedback sobre Cigarro-------"+ANSI_RESET);
				System.out.println(ANSI_amarelo+"Continue assim, voc� evitar� in�meros riscos a sua sa�de.\r\n"
						+ "� importante lembrar que o tabaco causa n�o apenas c�ncer,\r\n"
						+ "mas uma s�rie de outras doen�as cr�nicas que tamb�m podem levar � morte,\r\n"
						+ "como doen�as cardiovasculares, respirat�rias, enfisemas, bronquite cr�nica."+ANSI_RESET);
			}

			//mal bebe
			void malbebecerveja(){
				System.out.println(ANSI_amarelo+"Voce est� bebendo "+ latas + " De acordo com pesquisas da BVS,"
						+ " � recomendado que homens e mulheres n�o excedam uma quantidade de at� duas latas ( 350ml ) de cerveja por dia"+ANSI_RESET);
			}
			void idealbebecerveja() {
				System.out.println(ANSI_Verde+"Voc� est� na media de beber cerveja,De acordo com pesquisas da BVS,"
						+ " � recomendado que homens e mulheres n�o excedam uma quantidade de at� duas latas ( 350ml ) de cerveja por dia "+ANSI_RESET);
			}
			void malbebedestilado() {
				System.out.println(ANSI_amarelo+"Voce est� bebendo " + mlsdes+ " De acordo com pesquisas da BVS,"
						+ " � recomendado que homens e mulheres n�o excedam uma quantidade de at� uma dose ( 35ml ) de destilados por dia."+ANSI_RESET);
			}
			void idealbebedestilado() {
				System.out.println(ANSI_amarelo+"Voc� est� na m�dia de beber destilados, De acordo com pesquisas da BVS,"
						+ " � recomendado que homens e mulheres n�o excedam uma quantidade de at� uma dose ( 35ml ) de destilados por dia."+ANSI_RESET);
			}
			void malbebevinho() {
				System.out.println(ANSI_amarelo+"Voce est� bebendo "+ taca + " De acordo com pesquisas da BVS,"
						+ " � recomendado que homens e mulheres n�o excedam uma quantidade de at� um c�lice ( 90 ml ) de vinho por dia"+ANSI_RESET);
			}
			void idealbebevinho() {
				System.out.println(ANSI_amarelo+"Voc� est� na media de beber vinho, De acordo com pesquisas da BVS,"
						+ " � recomendado que homens e mulheres n�o excedam uma quantidade de at� uma dose ( 35ml ) de destilados por dia."+ANSI_RESET);
			}
			//maljogos
			void maljogos() {
				System.out.println(ANSI_amarelo+"-------Feedback Sobre jogos-------"+ANSI_RESET);
				System.out.println(ANSI_amarelo+"Alerta! Voc� est� dentro do que � considerado al�m do seguro.\r\n"
						+ "Verifique se esse h�bito n�o est� prejudicando suas rela��es interpessoais(Deixando de interagir com fam�lia e amigos).\r\n"
						+ "O excesso tamb�m pode fazer com que deixe de realizar outras atividades e prejudique o seu sono.\r\n" 
						+ "O ideal � 2 horas por dia ou menos e voc� est� " + exchorasj+" horas acima do ideal."+ANSI_RESET);
			}
			void idealjogos() {
				System.out.println(ANSI_amarelo+"-------Feedback Sobre jogos-------"+ANSI_RESET);
				System.out.println(ANSI_amarelo+"Muito bem! Voc� est� dentro do que � considerado tranquilo.\r\n"
						+ "Lembrando que, segundo alguns estudos,jogar videogames faz bem ao c�rebro, desde que n�o seja em excesso."+ANSI_RESET);
			}
			void maljogostrabalha() {
				System.out.println(ANSI_amarelo+"-------Feedback Sobre jogos-------"+ANSI_RESET);
				System.out.println(ANSI_amarelo+"Sabemos que voc� trabalho com isso,mas alerta! Voc� est� dentro do que � considerado al�m do seguro.\r\n"
						+ "Verifique se esse h�bito n�o est� prejudicando suas rela��es interpessoais (Deixando de interagir com fam�lia e amigos).\r\n"
						+ "O excesso tamb�m pode fazer com que deixe de realizar outras atividades e prejudique o seu sono.\r\n" 
						+ "O ideal � 2 horas por dia ou menos e voc� est� " + exchorasj+" horas acima do ideal."+ANSI_RESET);
			}
			void idealjogostrabalha() {
				System.out.println(ANSI_amarelo+"-------Feedback Sobre jogos-------"+ANSI_RESET);
				System.out.println(ANSI_amarelo+"Muito bem! Voc� est� dentro do que � considerado tranquilo mesmo que voc� trabalhe com isso. Lembrando que,\r\n"
						+ "segundo alguns estudos, jogar videogames faz bem ao c�rebro, desde que n�o seja em excesso."+ANSI_RESET);
			}
			//malredes
			void aceitavelrede() {
				System.out.println(ANSI_amarelo+"-------Feedback Sobre as redes sociais-------"+ANSI_RESET);
				System.out.println(ANSI_amarelo+"Muito bem! voc� est� dentro do aceit�vel.\r\n"
						+ "Um estudo publicado pelo Journal of Social and Clinical Psychology,\r\n"
						+ "que concluiu que utilizar as redes sociais por at� 30 minutos por dia pode trazer bons resultados � sa�de mental,\r\n"
						+ "mas passar at� 3h n�o afeta tanto."+ANSI_RESET);
			}
			void alertarede() {
				System.out.println(ANSI_amarelo+"-------Feedback Sobre as redes sociais-------"+ANSI_RESET);
				System.out.println(ANSI_amarelo+"Cuidado! Voc� est� em estado de alerta. Passar mais de 3 horas nas redes sociais afeta o sono,\r\n"
						+ "induz um comportamento mais sedent�rio durante o dia,aponta estudo na BVS(Biblioteca Virtual em Sa�de)."+ANSI_RESET);
			}
			void malrede() {
				System.out.println(ANSI_amarelo+"-------Feedback Sobre as redes sociais-------");
				System.out.println(ANSI_amarelo+"\r\n"
						+ "Aten��o!"
						+ "O uso das redes sociais em grande escala pode afetar a baixa autoestima,\r\n"
						+ "a insatisfa��o pessoal, a depress�o ou hiperatividade e,inclusive, a falta de afeto.\r\n"
						+ "O psiquiatra Cristiano Nabuco, coordenador do grupo de Depend�ncias Tecnol�gicas do Instituto de Psiquiatria do Hospital das Cl�nicas da USP, informa que,\r\n"
						+ "quanto mais se busca a perfei��o nas redes sociais e se negligencia a vida real,\r\n"
						+ "mais infeliz o usu�rio pode se sentir. �Oitenta e cinco por cento de todas as fotografias que s�o postadas s�o editadas.\r\n"
						+ "Isso � um problema, porque se desenvolve uma autoestima virtual e n�o pessoal, e quanto mais o indiv�duo busca se equiparar a essa vida paralela,\r\n"
						+ "mais infeliz ele vai se sentir na vida real.� Tira um tempo para respirar da tecnologia e vai interagir pessoalmente com outro.\r\n"
						+ "Fica a dica:\r\n"
						+ "O tempo � algo que n�o podemos nos dar ao luxo de desperdi�ar. Ent�o, o que voc� acha de planejar como us�-lo, assim como faria com dinheiro? \r\n"
						+ "*Escreva quanto tempo acha que seria razo�vel gastar numa rede social. Depois, veja como se saiu durante um m�s. Se voc� ultrapassou sua meta,\r\n"
						+ "fa�a ajustes onde necess�rio.\r\n"
						+ "*Concentre-se no que vai fazer no momento.\r\n"
						+ "*Desligue os seus alertas e notifica��es.\r\n"
						+ "* Escolha momentos para verificar e-mails e redes sociais.\r\n"
						+ "Espero que goste!!\r\n"
						+ ""+ANSI_RESET);
			}
			void aceitavelredetrab() {
				System.out.println(ANSI_amarelo+"-------Feedback Sobre as redes sociais-------"+ANSI_RESET);
				System.out.println(ANSI_amarelo+"Muito bem!Mesmo trabalhando voc� est� dentro do aceit�vel.\r\n"
						+ "Um estudo publicado pelo Journal of Social and Clinical Psychology,\r\n"
						+ "que concluiu que utilizar as redes sociais por at� 30 minutos por dia pode trazer bons resultados � sa�de mental,\r\n"
						+ "mas passar at� 3h n�o afeta tanto.\r\n"+ANSI_RESET);
			}
			void alertaredetrab() {
				System.out.println(ANSI_amarelo+"-------Feedback Sobre as redes sociais-------");
				System.out.println("Sabemos que voc� est� trabalhando,mas Cuidado! Passar mais de 3 horas nas redes sociais afeta o sono,\r\n"
						+ "induz um comportamento mais sedent�rio durante o dia,aponta estudo na BVS(Biblioteca Virtual em Sa�de)."+ANSI_RESET);
			}
			void malredetrab() {
				System.out.println(ANSI_amarelo+"-------Feedback Sobre as redes sociais-------"+ANSI_RESET);
				System.out.println(ANSI_amarelo+"Tome muito cuidado.\r\n"
						+ "Sabemos que � por causa do trabalho mas Aten��o! O uso das redes sociais em grande escala pode afetar a baixa autoestima,\r\n"
						+ "a insatisfa��o pessoal, a depress�o ou hiperatividade e,inclusive, a falta de afeto.\r\n"
						+ "O psiquiatra Cristiano Nabuco, coordenador do grupo de Depend�ncias Tecnol�gicas do Instituto de Psiquiatria do Hospital das Cl�nicas da USP, informa que,\r\n"
						+ "quanto mais se busca a perfei��o nas redes sociais e se negligencia a vida real,\r\n"
						+ "mais infeliz o usu�rio pode se sentir. �Oitenta e cinco por cento de todas as fotografias que s�o postadas s�o editadas.\r\n"
						+ "Isso � um problema, porque se desenvolve uma autoestima virtual e n�o pessoal, e quanto mais o indiv�duo busca se equiparar a essa vida paralela,\r\n"
						+ "mais infeliz ele vai se sentir na vida real.� Tira um tempo para respirar da tecnologia e vai interagir pessoalmente com outro.\r\n"
						+ "Fica a dica:\r\n"
						+ "O tempo � algo que n�o podemos nos dar ao luxo de desperdi�ar. Ent�o, o que voc� acha de planejar como us�-lo, assim como faria com dinheiro? \r\n"
						+ "\r\n"
						+ "*Escreva quanto tempo acha que seria razo�vel gastar numa rede social. Depois, veja como se saiu durante um m�s. Se voc� ultrapassou sua meta,fa�a ajustes onde necess�rio.\r\n"
						+ "*Concentre-se no que vai fazer no momento.\r\n"
						+ "*Desligue os seus alertas e notifica��es.\r\n"
						+ "*Escolha momentos para verificar e-mails e redes sociais.\r\n"
						+ "Espero que goste!!\r\n"
						+ ""+ANSI_RESET);
			}
		
}
