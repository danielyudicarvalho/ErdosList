package erdo;
import java.util.Scanner;
public class ListaAutor {
	
		
			
			public static void cria(int x, int y) {
				Autor[][]autor;
				String n,m;
				Scanner tec = new Scanner(System.in);
				autor = new Autor[x][10];
				
				
					for(int i=0;i<x;i++) {
						
						for(int j=0;j<10;j++) {							
							m = tec.next();
							n=tec.next();
							if(n.charAt(n.length()-1)=='.') {
								autor[i][j]= new Autor(m, n);
								break;
							}
								autor[i][j]= new Autor(m, n);
							}
						}
					System.out.println("Teste "+y);
					Ordena(autor);
				}
					
					
			

					
			
			
			public static void BotaUm(Autor[][] l) {
				for(int i=0; i<l.length;i++) {
					for(int j=0; j<l[i].length;j++) {
						if(l[i][j]==null) {
							int np=0;
						}else {
							if(l[i][j].getNome().equals("P.") && l[i][j].getSobrenome().equals("Erdos")){
								for(int p=0;p<l[i].length;p++) {
									if(l[i][p]==null) {
										int pn=0;
									}else {
										l[i][p].setNumber(1);
									}
							}
						}
					}
				}
			}
			}
			
			public static void NomeIgual(Autor[][] h) {
				for(int i=0;i<h.length;i++) {
					for(int j=0;j<h[i].length;j++) {
						if(h[i][j]==null) {
							int np=0;
						}else {	
							String y = h[i][j].getNome();
							String x = h[i][j].getSobrenome();
								for(int q=0;q<h.length;q++) {
									for(int z=0;z<h[q].length;z++) {
										if(h[q][z]==null) {
											int pn=0;
										}else {
											if(h[q][z].getNome().equals(h[i][j].getNome()) && h[q][z].getSobrenome().equals(h[i][j].getSobrenome())) {
												if(h[i][j].getNumber()>h[q][z].getNumber()) {
													h[q][z].setNumber(h[i][j].getNumber());
												}else{
													h[i][j].setNumber(h[q][z].getNumber());
												}
									
											}
										}
									}
								}
						}
					}
				}
			}
			
			
			public static void Enumera(Autor[][] k) {
				for(int i=0;i<k.length;i++) {
					for(int j=0;j<k[i].length;j++) {
						if(k[i][j]==null) {
							int np=0;
						}else {
							if(k[i][j].getNumber()>0) {
								for(int p=0;p<k[i].length;p++) {
									if(k[i][p]==null) {
										int pn=0;
									}else {
										if(k[i][p].getNumber()==0 || k[i][p].getNumber()>k[i][j].getNumber()) {
											k[i][p].setNumber(k[i][j].getNumber()+1);
										}
									}
								}
							}
						}
					}
				}
			}
			public static void Ordena(Autor[][]p) {
				BotaUm(p);
				NomeIgual(p);
				
				for(int i=0;i<p.length*p[0].length;i++) {
					Enumera(p);
					NomeIgual(p);
				}
				
				Autor [] lista = new Autor[p.length*p[0].length];
				int quant=0;
				for(int i=0;i<p.length;i++) {
					for(int j=0;j<p[i].length;j++) {
						if(p[i][j]==null) {
							int pn =0;
						}else {
							lista[quant]= new Autor(p[i][j].getNome(), p[i][j].getSobrenome(), p[i][j].getNumber());
							quant++;
						}
						
					}
				}
				
				Ordenacao(lista);
				TiraNome(lista);
				
				
				for(int i=0;i<lista.length;i++) {
					if(lista[i]==null) {
						int np =0;
					}else if(lista[i].getNome().equals("P.") && lista[i].getSobrenome().equals("Erdos")) {
						int j=i;
					}else if(lista[i].getNumber()==0){
						System.out.print(lista[i].getNome()+" ");
						System.out.print(lista[i].getSobrenome()+": ");
						System.out.println("Infinito");
					}else {
						System.out.print(lista[i].getNome()+" ");
						System.out.print(lista[i].getSobrenome()+": ");
						System.out.println(lista[i].getNumber());
					}
					}
				}
			
			
				public static void Ordenacao(Autor[]l) {
					
					
					Autor aux;
					
					
					for(int i=0;i<l.length;i++) {
						for(int j=0;j<l.length;j++) {
							if(l[i]==null || l[j]==null) {
								int ab=0;
							}else if(l[i].getNome().equals(l[j].getNome())) {
								if(l[i].getSobrenome().compareTo(l[j].getSobrenome())<0) {
									aux= new Autor(l[i].getNome(), l[i].getSobrenome(), l[i].getNumber());
									l[i]= new Autor(l[j].getNome(), l[j].getSobrenome(), l[j].getNumber());
									l[j]= new Autor(aux.getNome(), aux.getSobrenome(), aux.getNumber());
								}
							}else {
								if(l[i].getNome().compareTo(l[j].getNome())<0) {
									aux= new Autor(l[i].getNome(), l[i].getSobrenome(), l[i].getNumber());
									l[i]= new Autor(l[j].getNome(), l[j].getSobrenome(), l[j].getNumber());
									l[j]= new Autor(aux.getNome(), aux.getSobrenome(), aux.getNumber());
								}
							}
							
						}
					}
					
					
				}
				
				public static void TiraNome(Autor[] t) {
					int n=0;
					for (int i=0;i<t.length;i++) {
						for(int j=i+1;j<t.length;j++) {
							if(t[i]==null || t[j]==null) {
								n++;
							}else if(t[i].getNome().equals(t[j].getNome()) && t[i].getSobrenome().equals(t[j].getSobrenome())) {
								t[j]=null;
							}
						}
					}
				}
				
				
				
				
				
				
			
				
			}
			
				
				
				
				

			
			
			
		

		

	



