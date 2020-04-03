package model;

import java.util.Comparator;

public class NetNombreComparator implements Comparator<Netflix >{
	
	@Override
	public int compare(Netflix n1, Netflix n2) {
		return n2.getNombre().compareTo(n1.getNombre());
	}

}
