package br.com.senaitaguatinga.app2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		AviaoEmbraer aviao = new AviaoEmbraer();
	
		int resp = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano atual?"));
		
		JOptionPane.showMessageDialog(null, "O primeiro avi�o da embraer foi lan�ado "+ (resp - aviao.getAnoDeLan�amento()) +" anos atr�s");
	}

}
