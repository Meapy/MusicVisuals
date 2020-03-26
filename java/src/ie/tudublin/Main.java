package ie.tudublin;

import example.CubeVisual;
import example.MyVisual;
import processing.core.PApplet;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new CubeVisual());

	}

	public static void main(String[] args)
	{
		PApplet.main("ie.tudublin.CubeVisual");
		Main main = new Main();
		main.startUI();			
	}
}