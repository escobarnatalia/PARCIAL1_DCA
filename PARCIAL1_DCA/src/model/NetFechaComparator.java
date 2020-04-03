package model;

import java.util.Comparator;

public class NetFechaComparator implements Comparator<Netflix> {

	 

	@Override
	public int compare(Netflix o1, Netflix o2) {
		 
		return o1.getFechaEstreno().compareTo(o2.getFechaEstreno());
	}

}
