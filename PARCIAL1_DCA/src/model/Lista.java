package model;

import java.util.Collections;
import java.util.LinkedList;

public class Lista {
	
	LinkedList<Netflix> netflixList;
	NetNombreComparator ordeNombre;
	
	public Lista() {
		
		netflixList = new LinkedList<Netflix>(); 
		ordeNombre = new NetNombreComparator();
	}
	
	
	public void addLista(Netflix net) {
		netflixList.add(net);
	}
	
	public void OrdenarRating() {
		Collections.sort(netflixList);
	}
	
	public void OrdenarNombre() {
		
		Collections.sort(netflixList);
	}
	
	public void OrdenarFecha() {
		Collections.sort(netflixList);
	}

	public LinkedList<Netflix> getNetflixList() {
		return netflixList;
	}

	public void setNetflixList(LinkedList<Netflix> netflixList) {
		this.netflixList = netflixList;
	}

}
