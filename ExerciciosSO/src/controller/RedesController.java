package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class RedesController {
	
	public RedesController () {
		super();
	}
	//Definição do SO e Método OS a fim de retorná-lo via console
	private String os = System.getProperty("os.name");
	//Acesso ao atributo privado	
	public void setOS (String os) {
		this.os = os;
	}
	//Retorno da String
	public String getOS () {
		return os;
	}
	
	//Método IP
	public void IP (String ip)  {
		try { //Tentativa de execução de processo por meio de buffers
		Process Identificador = Runtime.getRuntime().exec(ip);
		InputStream passaDados = Identificador.getInputStream();
		InputStreamReader r = new InputStreamReader(passaDados);
		BufferedReader buffer = new BufferedReader(r);
		String line = buffer.readLine();
		while (line != null) {
			System.out.println(line);
			line = buffer.readLine();
		}//Fim da Estrutura de repetição
		buffer.close();
		passaDados.close();
		r.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}//Fim do Catch
	}//Fim do método IP
	
	//Método ping
	public void PING (String ping) {
		try { //Tentativa de execução de processo por meio de buffers
			Process Identificador = Runtime.getRuntime().exec(ping);
			InputStream dataFlow = Identificador.getInputStream();
			InputStreamReader leitor = new InputStreamReader(dataFlow);
			BufferedReader buff = new BufferedReader(leitor);
			String linha = buff.readLine();
			String primeiralinha = new String(linha.getBytes());
			String ultimalinha = new String("");
			while (linha != null) {
				linha = buff.readLine();
				if (linha != null) {
					ultimalinha = new String (linha.getBytes());
				}
			}//Fim da Estrutura de repetição
			String [] resultado = ultimalinha.split("/");
			System.out.println(resultado[1]+ " "+ resultado[4] +"ms");
			
			buff.close();
			dataFlow.close();
			leitor.close(); 
			
			} catch (IOException e) {
				e.printStackTrace();
			}//Fim do Catch
	}//Fim do método PING
}//Fim da Public class