package studio4;

import java.io.File;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class Flag {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(.5, .5, 1, 1);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.5, .5, 0.9, .4);
		for (double i = 0.3 ; i <.7; i= i +.05)
		{
			StdDraw.setPenColor(Color.WHITE);
			StdDraw.filledRectangle(.5, i, 0.9, .02);
		}
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(.5, .5, .3);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0, .05, 0.04, 1);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(1, 1.1, 0.04, 1);
		
	
		
	}
}
