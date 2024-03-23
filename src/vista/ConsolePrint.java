package vista;

import java.util.List;
import java.util.Scanner;

import modelos.User;

public class ConsolePrint {
	private Scanner input = new Scanner(System.in);
	
	public void bienvenida() {
		System.out.println("Bienvenido a Cnet");
		System.out.println("");
	}
	
	public String menuPrincipal() {
		String opcionString = "";
		
		System.out.println("Menú principal:");
		System.out.println("1. Ingresar como Director");
		System.out.println("2. Ingresar como Profesor");
		System.out.println("3. Ingresar como Alumno");
		System.out.println("4. Salir");
		System.out.print("Ingrese una opcion: ");
		opcionString = input.next();
		System.out.println("");
		
		return opcionString;
	}
	
	public void errorSolicitudOpcion() {
		System.out.println("Error al ingresar la opcion, intente de nuevo");
		System.out.println("");
	}
	
	public void cerrarPrograma() {
		System.out.println("Gracias por usar Cnet");
	}
	
	public String[] inicioSesion() {
		String usuario = "";
		String contraseña = "";
		
		System.out.println("Ingrese su usuario, presione ENTER y luego ingrese su contraseña");
		System.out.print("Usuario: ");
		usuario = input.next();
		System.out.print("Contraseña: ");
		contraseña = input.next();
		System.out.println("");
		
		return new String[] {usuario, contraseña};
	}
	
	public void errorInicioSesion() {
		System.out.println("Error al iniciar sesion, intente de nuevo");
		System.out.println("");
	}
	
	public void bienvenidaDirector() {
		System.out.println("Bienvenido Director");
		System.out.println("");
	}
	
	public void bienvenidaProfesor() {
		System.out.println("Bienvenido Profesor");
		System.out.println("");
	}
	
	public void bienvenidaAlumno() {
		System.out.println("Bienvenido Alumno");
		System.out.println("");
	}
	
	public String menuDirector() {
		String opcionString = "";
		
		System.out.println("1. Gestionar Profesores");
		System.out.println("2. Gestionar Asignaturas");
		System.out.println("3. Cerrar sesion");
		System.out.print("Ingrese una opcion: ");
		opcionString = input.next();
		System.out.println("");
		
		return opcionString;
	}
	
	public String menuProfesor() {
		String opcionString = "";
		
		System.out.println("1. TODO PROFE");
		System.out.println("3. Cerrar sesion");
		System.out.print("Ingrese una opcion: ");
		opcionString = input.next();
		System.out.println("");
		
		return opcionString;
	}
	
	public String menuAlumno() {
		String opcionString = "";
		
		System.out.println("1. TODO ALUMNO");
		System.out.println("3. Cerrar sesion");
		System.out.print("Ingrese una opcion: ");
		opcionString = input.next();
		System.out.println("");
		
		return opcionString;
	}
	
	public String gestionarProfesoresDirector(List<String> profesores) {
		String opcionString = "";
		
		System.out.println("Aqui estan los profesores que estan en el campus:");
		for (String p: profesores) {
			System.out.println(p);
		}
		System.out.println("");
		System.out.println("1. TODO ver profesor");
		System.out.println("2. Crear profesor");
		System.out.println("3. Regresar");
		System.out.print("Ingrese una opcion: ");
		opcionString = input.next();
		System.out.println("");
		
		return opcionString;
	}
	
	public void gestionarAsignaturasDirector() {
		System.out.println("Aqui estan las asignaturas que se imparten en el campus");
		System.out.println("");
	}
	
	public void gestionarAsignaturasProfesor() {
		System.out.println("Aqui estan las asignaturas que estas impartiendo ahora");
		System.out.println("");
	}
	
	public void gestionarAsignaturasAlumno() {
		System.out.println("Aqui estan las asignaturas que estas matriculado ahora");
		System.out.println("");
	}
	
	public String errorProfesoresEnCampusVacio() {
		String opcionString = "";
		
		System.out.println("Error al obtener profesores en campus, intente de nuevo o cree un profesor");
		System.out.println("");
		System.out.println("1. Crear profesor");
		System.out.println("2. Regresar");
		System.out.print("Ingrese una opcion: ");
		opcionString = input.next();
		System.out.println("");
		
		return opcionString;
	}
	
	public User crearProfe() {
		User usuarioProfesor = new User();
		
		System.out.println("Ingrese informacion de profe");
		System.out.print("Ingrese nombre: ");
		usuarioProfesor.setNombre(input.next());
		System.out.print("Ingrese apellido: ");
		usuarioProfesor.setApellido(input.next());
		System.out.print("Ingrese usuario para ingresar a la aplicacion: ");
		usuarioProfesor.setUsuario(input.next());
		System.out.print("Ingrese contraseña: ");
		usuarioProfesor.setContraseña(input.next());
		System.out.print("Ingrese dni: ");
		usuarioProfesor.setDni(input.next());
		System.out.println("");
		
		return usuarioProfesor;
	}
	
	public void verProfe() {
		System.out.println("Ver informacion de profe");
		System.out.println("");
	}
	
	public void profesorCreado() {
		System.out.println("Profesor creado exitosamente");
		System.out.println("");
	}
	
	public void errorCrearProfesor() {
		System.out.println("Error al crear profesor, uno existente con los mismos datos, intente de nuevo");
		System.out.println("");
	}
}
