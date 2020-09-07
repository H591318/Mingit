package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class KarakterskalaB {

	public static void main(String[] args) {
		
		for (int antallStudenter = 1; antallStudenter <= 10; antallStudenter++) {
			String tallTxt = showInputDialog("Oppgi poengsum: ");
			int poeng = parseInt(tallTxt);
			
			
			if ((poeng>0)&&(poeng<=39)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter F";
				showMessageDialog(null, utTxt);
			}
			
			if ((poeng>0)&&(poeng<=49)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter E";
				showMessageDialog(null, utTxt);
		    }
			
			if ((poeng>0)&&(poeng<=59)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter D";
				showMessageDialog(null, utTxt);
	        }
			
			if ((poeng>0)&&(poeng<=79)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter C";
				showMessageDialog(null, utTxt);
			}
			
			if ((poeng>0)&&(poeng<=89)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter B";
				showMessageDialog(null, utTxt);
			}
			
			if ((poeng>0)&&(poeng<=99)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter A";
				showMessageDialog(null, utTxt);
			}
			
			if ((poeng<0)&&(poeng>100)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nUgyldig poengsum";
				showMessageDialog(null, utTxt);
			}
			

				
			
			}	
}
		}
			