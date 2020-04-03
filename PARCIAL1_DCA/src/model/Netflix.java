package model;

public class Netflix implements Comparable<Netflix> {
	
	private String nombre, fechaEstreno;
	private int rating;
	
	public Netflix(int rating, String nombre, String fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
		this.nombre = nombre;
		this.rating = rating;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(String fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public int compareTo(Netflix n) {
		return rating - n.getRating();
	}

}
