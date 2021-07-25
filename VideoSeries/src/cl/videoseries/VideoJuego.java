package cl.videoseries;

import java.util.Calendar;

public class VideoJuego extends VideoSerie implements Entregable{
	private String titulo;
	private int horasEstimadas=10;
	private boolean estado=false;
	private String genero;
	private String compañia;
	private Calendar fechaEntrega;
	private Calendar fechaDevolucion;
	
	public VideoJuego () {
		
	}
	
	public VideoJuego (String tittle, int hrsEst) {
		this.titulo=tittle;
		this.horasEstimadas=hrsEst;
	}
	public VideoJuego (String tittle, int hrsEst, String gen, String cia, Calendar calendario1, Calendar calendario2) {
		this.titulo=tittle;
		this.horasEstimadas=hrsEst;
		this.genero=gen;
		this.compañia=cia;
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

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public Calendar getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Calendar fechaEntrega2) {
		this.fechaEntrega = fechaEntrega2;
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
