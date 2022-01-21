package com.leerFichero.leerFicherp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LeerFicherpApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(LeerFicherpApplication.class, args);

		List<Persona> listaPersona = new ArrayList<>() ;

		BufferedReader br = null;
		String nombreFichero = "C:\\Users\\alvaro.fernandez\\Desktop\\fichero.txt";


		br = new BufferedReader(new FileReader(nombreFichero));

		String texto = br.readLine();

		while(texto != null)
		{
			String texto2 = texto;
			String[] parts = texto2.split(":");
			String nombre = parts[0] ;
			String ciudad = parts[1];

			int edad = 0;
			if(parts.length>2){
				edad =  Integer.parseInt(parts[2]);
			}
			Persona p1 = new Persona();

			p1.setNombre(nombre);
			p1.setPoblacion(ciudad);
			p1.setEdad(edad);

			listaPersona.add(p1);


			texto = br.readLine();
		}

		listaPersona.stream().filter(x-> x.getEdad().isPresent()).filter(x-> x.getEdad().get() != 0).filter(x-> x.getEdad().get() < 25).forEach(x-> System.out.println("Linea "+ "Nombre: " +x.getNombre().orElse("Desconocido")+", Poblacion: "+x.getPoblacion().orElse("Desconocido")+ ", Edad: "+x.getEdad()));

	}

}
