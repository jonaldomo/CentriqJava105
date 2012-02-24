package friday.swing;

import java.awt.Color;

import javax.swing.JFileChooser;

/**
 * Example of using swing with a console program
 * Quickly choose a file and print it out
 *
 */
public class FileChooser {
	
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser("\\Users\\Student\\workspace\\CentriqJava105");
		chooser.setBackground(Color.cyan);
		int returnValue = chooser.showDialog(null, "Select File");
		System.out.println(chooser.getSelectedFile());
		
		System.out.println(chooser.getBackground());
		System.out.println(returnValue);
	}

}
