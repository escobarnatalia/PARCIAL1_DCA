package controller;

import model.Logica;
import processing.core.PApplet;

public class MainController {
	
	private PApplet app;
	private Logica logica;

	public MainController(PApplet app) {
		this.app = app;
		
		logica = new Logica(app);
		 
	}
	
	public void pintarLogica() {
		logica.pintarLista();
	}
	
	public void ordenarNaturalLogica() {
		logica.ordNatural();
	}
	
	public void ordenarParcialLogica() {
		logica.ordParcial();
	}
	
	public void ordenarParcialLogica1() {
		logica.ordParcial1();
	}


}
