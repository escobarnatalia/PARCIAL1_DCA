package model;

import java.lang.reflect.Array;

import processing.core.PApplet;
import processing.core.PImage;

public class Logica {

	private PApplet app;
	private String[] text;
	private Lista lista; 
	private Array[] PImage;
	
	
	private PImage breakingbad, dark, mindhunter, ozark, startrek, strangerthings,theirishman;

	public Logica(PApplet app) {
		this.app = app;
		text = app.loadStrings("../data/netflix.txt");
		lista = new Lista();
		
		breakingbad = app.loadImage("../data/img/breakingbad.jpg");
		dark = app.loadImage("../data/img/dark.jpg");
		mindhunter = app.loadImage("../data/img/mindhunter.jpg");
		ozark = app.loadImage("../data/img/ozark.jpg");
		startrek= app.loadImage("../data/img/startrek.jpg");
		strangerthings = app.loadImage("../data/img/strangerthings.jpg");
		theirishman = app.loadImage("../data/img/theirishman.jpg");
		 
		
				
		 
		for (int i = 0; i<text.length; i ++) {
			String [] temporal = text[i].split(",");
			String nombre = temporal[0];
			String fechaEstreno = temporal[1];
			int rating = Integer.parseInt(temporal[2]);
			
			
			
			lista.addLista(new Netflix(rating, nombre, fechaEstreno));
		}
		
	}
	
	public void pintarLista() {
		app.fill(255);
		for(int i =0; i<lista.getNetflixList().size(); i ++) {
			app.text(lista.getNetflixList().get(i).getNombre(), 50,50 + (i*80));
			app.text(lista.getNetflixList().get(i).getFechaEstreno(), 150,50 + (i*80));
			app.text(lista.getNetflixList().get(i).getRating() + "%", 250,50 + (i*80));
			
			if(lista.getNetflixList().get(i).getNombre().equals("Breaking Bad")){
				app.image(breakingbad,300,50 + (i*80),50,50);
			}
			
			if(lista.getNetflixList().get(i).getNombre().equals("Dark")){
				app.image(dark,300,50 + (i*80),50,50);
			}
			
			if(lista.getNetflixList().get(i).getNombre().equals("The Irishman")){
				app.image(theirishman,300,50 + (i*80),50,50);
			}
			
			if(lista.getNetflixList().get(i).getNombre().equals("Ozark")){
				app.image(ozark,300,50 + (i*80),50,50);
			}
			
			if(lista.getNetflixList().get(i).getNombre().equals("Star Trek")){
				app.image(startrek,300,50 + (i*80),50,50);
			}
			
			if(lista.getNetflixList().get(i).getNombre().equals("Mindhunter")){
				app.image(mindhunter,300,50 + (i*80),50,50);
			}
			
			
			
		}
		
		
	}
	
	public void ordNatural() {
		lista.OrdenarRating();
	}
	
	public void ordParcial() {
		lista.OrdenarNombre();
	}
	
	public void ordParcial1() {
		lista.OrdenarFecha();
	}

}
