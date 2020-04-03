package view;

import controller.MainController;
import processing.core.PApplet;

public class Main extends PApplet {

	private MainController controller;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void settings() {
		size(600, 600);

	}

	public void setup() {

		controller = new MainController(this);

	}

	public void draw() {
		background(0);
		controller.pintarLogica();
	}

	
	public void mousePressed() {
		controller.ordenarNaturalLogica();

	}
	
	public void keyPressed() {
		switch (keyCode) {
		case UP:
			controller.ordenarParcialLogica();
			break;
		case DOWN:
			controller.ordenarParcialLogica1();
			break;
		}
	}
	
	

}
