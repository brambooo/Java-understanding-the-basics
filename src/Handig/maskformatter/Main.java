package Handig.maskformatter;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class Main {
	// Date format
			MaskFormatter maskFormatter = null;
			try {
				maskFormatter = new MaskFormatter("##-##-####");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			watchedInputField = new JFormattedTextField(maskFormatter);
}
