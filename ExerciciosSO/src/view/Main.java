package view;

import javax.swing.JOptionPane;
import controller.RedesController;

public class Main 
{

	public static void main(String[] args) 
	{
		// Instância de classe
		RedesController rc = new RedesController();
		String os = rc.getOS();
		System.out.println(os);
		//Janela de escolhas para o usuário
		int opc = 0;
		while (opc != 9) {
		opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Chamada do Método ip \n2- Chamada do Método ping \n9 - Finaliza"));
		
		switch (opc) {
		
		case 1: String ip = "ifconfig";
				rc.IP(ip);
				break;
		case 2: String ping = "ping -4 -c 10 www.google.com.br";
				rc.PING(ping);
				break;
		case 9:
				JOptionPane.showMessageDialog(null, "Finaliza");
				break;
		default: 
				JOptionPane.showMessageDialog(null, "Opção Inválida");
			}//Fim do switch
		}//Fim da estrutura de repetição
	}
		
}

