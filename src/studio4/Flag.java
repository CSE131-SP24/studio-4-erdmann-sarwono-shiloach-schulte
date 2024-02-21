package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	StdDraw.setPenColor(149, 42, 251);
	StdDraw.filledRectangle(0.5, 0.5, 0.425, 0.275);
	StdDraw.setPenColor(186, 119, 251);
	StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.25);
	StdDraw.setPenColor(240, 195, 17);
	StdDraw.filledCircle(0.5, 0.5, 0.15);
	StdDraw.setPenColor(13, 42, 100);
	double []x= {0.1,0.4,0.22};
	double []y= {0.25,0.25,0.4};
	StdDraw.filledPolygon(x, y);
	double []x1= {0.35,0.65,0.5};
	double []y1= {0.25,0.25,0.5};
	StdDraw.filledPolygon(x1, y1);
	double []x2= {0.6,0.9,0.82};
	double []y2= {0.25,0.25,0.4};
	StdDraw.filledPolygon(x2, y2);

	}
}