package brincadeiraDeAdivinhar;

import java.util.Random;

import javax.swing.JOptionPane;

public class VamosBrincar {

	public static void main(String[] args) {

		int randomico = 0;
		int entrada = -1;

		Random radom = new Random();

		randomico = radom.nextInt(10);

		 //System.out.println(randomico);
		try {

			while (randomico != entrada) {

				entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero inteiro de 0 a 10"));

				if (entrada == randomico && entrada <= 10 && entrada >= 0) {

					JOptionPane.showMessageDialog(null, "A o Bidu");
					JOptionPane.showMessageDialog(null, "O numero era:" + randomico);

				} else if (entrada > randomico && entrada <= 10 && entrada >= 0) {
					JOptionPane.showMessageDialog(null, "Esse numero e maior");
				} else if(entrada < randomico && entrada <= 10 && entrada >= 0) {
					JOptionPane.showMessageDialog(null, "Esse numero e menor");
				}

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Favor inserir somente valores de 0 a 10");
		}
	}
}
