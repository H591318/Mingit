package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class KarakterskalaC {

	public static void main(String[] args) {
		
		for (int antallStudenter = 1; antallStudenter <= 10;) {
			String tallTxt = showInputDialog("Oppgi poengsum: ");
			int poeng = parseInt(tallTxt);
			
			
			if ((poeng>=0)&&(poeng<=39)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter F";
				antallStudenter++;
				showMessageDialog(null, utTxt);
			}
			
			if ((poeng>=40)&&(poeng<=49)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter E";
				antallStudenter++;
				showMessageDialog(null, utTxt);
			}
			
			if ((poeng>=50)&&(poeng<=59)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter D";
				antallStudenter++;
				showMessageDialog(null, utTxt);
			}
			
			if ((poeng>=60)&&(poeng<=79)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter C";
				antallStudenter++;
				showMessageDialog(null, utTxt);
			}
			
			if ((poeng>=80)&&(poeng<=89)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter B";
				antallStudenter++;
				showMessageDialog(null, utTxt);
			}
			
			if ((poeng>=90)&&(poeng<=100)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nDu har oppnåd karakter A";
				antallStudenter++;
				showMessageDialog(null, utTxt);
			}
			
			if ((poeng>=100)&&(poeng<0)) {
				String utTxt = "Student nummer " + antallStudenter + " av 10" + "\nUgyldig poengsum";
				showMessageDialog(null, utTxt);
			}
		}
	}

}
