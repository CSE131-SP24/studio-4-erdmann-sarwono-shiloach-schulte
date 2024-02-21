package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shapeType = in.next();
		int redComponent=in.nextInt();
		int greenComponent=in.nextInt();
		int blueComponent=in.nextInt();
		boolean isFilled =in.nextBoolean();
		
		StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
		if(shapeType.equals("ellipse")) {
			double comp1=in.nextDouble();
			double comp2=in.nextDouble();
			double comp3=in.nextDouble();
			double comp4=in.nextDouble();
			if(isFilled) {
				StdDraw.filledEllipse(comp1,comp2,comp3,comp4);
			}
			else {
				StdDraw.ellipse(comp1,comp2,comp3,comp4);
			}
		}
		if(shapeType.equals("rectangle")) {
			if(isFilled) {
				StdDraw.filledRectangle(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());
			}
			else {
				StdDraw.rectangle(in.nextDouble(),in.nextDouble(),in.nextDouble(),in.nextDouble());
			}
		}
		if(shapeType.equals("triangle")) {
			double[]x = {in.nextDouble(),in.nextDouble(),in.nextDouble()};
			double[]y = {in.nextDouble(),in.nextDouble(),in.nextDouble()};
			if(isFilled) {
				StdDraw.filledPolygon(x,y);
			}
			else {
				StdDraw.polygon(x,y);
			}
		}
		
	}
}