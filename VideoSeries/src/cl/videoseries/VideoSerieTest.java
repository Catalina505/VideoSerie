package cl.videoseries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class VideoSerieTest {

	public static void main(String[] args) {
		Calendar cal1 = new GregorianCalendar(2020, 07, 15);
		Calendar cal2 = new GregorianCalendar(2020, 07, 17);
		
		Serie serie1 = new Serie("Dark", "Baran bo Odar & Jantje Friese");
		serie1.entregar();
		Serie serie2 = new Serie("Game of trhones", 8, "Fantasía medieval", "David Benioff", cal1, cal2);
		serie2.entregar();
		Serie serie3 = new Serie("The Good Doctor", "David Shore");
		Serie serie4 = new Serie("Braking Bad", 6, "Drama", "Vince Gilligan", cal1, cal2);
		Serie serie5 = new Serie("Vikings", "Michael Hirst");
		
		VideoJuego vj1 = new VideoJuego("Mario Car", 5);
		VideoJuego vj2 = new VideoJuego("Assasin's Creed", 4);
		VideoJuego vj3 = new VideoJuego("Fortnite", 7);
		vj3.entregar();
		VideoJuego vj4 = new VideoJuego("Fifa 20", 10);
		VideoJuego vj5 = new VideoJuego("Mortal Kombat", 7);
		vj5.entregar();

		ArrayList<String> series = new ArrayList<String>();
		series.add(serie1.toString());
		series.add(serie2.toString());
		series.add(serie3.toString());
		series.add(serie4.toString());
		series.add(serie5.toString());
		ArrayList<String> videoJuego = new ArrayList<String>();
		videoJuego.add(vj1.toString());
		videoJuego.add(vj2.toString());
		videoJuego.add(vj3.toString());
		videoJuego.add(vj4.toString());
		videoJuego.add(vj5.toString());
		
		System.out.println("-----------Menú para agregar títulos----------");
		System.out.println("Selecciona el tipo que deseas agregar:\n" + "1: Serie\n" + "2:Video Juego");
			Scanner sc2 = new Scanner (System.in);
			int opcionB = sc2.nextInt();
			if (opcionB == 1) {
				Scanner sc3 = new Scanner (System.in);
				System.out.println("Ingrese el título de la serie");
				Serie serie6 = new Serie(sc2.next(), null);
				Scanner sc4 = new Scanner (System.in);
				System.out.println("Ingrese el creador de la serie");
				serie6.setCreador(sc3.next());
			}else if (opcionB ==2) {
				Scanner sc3 = new Scanner (System.in);
				System.out.println("Ingrese el título del video juego");
				VideoJuego vj6 = new VideoJuego(sc2.next(), 0);
				Scanner sc4 = new Scanner (System.in);
				System.out.println("Ingrese las horas estimadas");
				vj6.setHorasEstimadas(sc3.nextInt());
			}
		
	}
}