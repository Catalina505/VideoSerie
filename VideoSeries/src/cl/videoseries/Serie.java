package cl.videoseries;

import java.util.Calendar;

public class Serie extends VideoSerie implements Entregable{
	private String titulo;
	private int temporadas=3;
	private boolean estado=false;
	private String genero;
	private String creador;
	private Calendar fechaEntrega;
	private Calendar fechaDevolucion;
	
	public Serie() {
		
	}
	
	public Serie (String tittle, String creator) {
		this.titulo=tittle;
		this.creador=creator;
	}
	
	public Serie (String tittle, int temp, String gen, String creator, Calendar calendario1, Calendar calendario2) {
		this.titulo=tittle;
		this.temporadas=temp;
		this.genero=gen;
		this.creador=creator;
		this.fechaEntrega=calendario1;
		this.fechaDevolucion=calendario2;
	}
	//Getters & Setters

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public Calendar getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Calendar fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Calendar getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Calendar fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	@Override
	public void entregar() {
		estado=true;
		setFechaEntrega(fechaEntrega);
		
	}

	@Override
	public void devolver() {
		estado=false;
		setFechaDevolucion(fechaDevolucion);
		
	}

	@Override
	public boolean isEntregado() {
		return estado;		
		
	}
	
}
