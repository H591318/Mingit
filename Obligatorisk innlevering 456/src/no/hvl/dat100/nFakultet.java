package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class nFakultet {

	public static void main(String[] args) {
		
		String tallTxt = showInputDialog ("Oppgi et tall !!");
		
		int n = parseInt(tallTxt);
		int fakultet = 1;
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				fakultet = fakultet * i; 
			}
			showMessageDialog (null, "Fakultet " + n + " er " + fakultet);
		}
	}

}
