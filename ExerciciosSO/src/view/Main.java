package view;

import javax.swing.JOptionPane;
import controller.RedesController;

public class Main 
{

	public static void main(String[] args) 
	{
		// Inst�ncia de classe
		RedesController rc = new RedesController();
		String os = rc.getOS();
		System.out.println(os);
		//Janela de escolhas para o usu�rio
		int opc = 0;
		while (opc != 9) {
		opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Chamada do M�todo ip \n2- Chamada do M�todo ping \n9 - Finaliza"));
		
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
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
			}//Fim do switch
		}//Fim da estrutura de repeti��o
	}
		
}

