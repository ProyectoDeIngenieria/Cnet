package vista;

import modelos.Asignatura;
import modelos.Modelo;
import modelos.Profesor;

public class MenuProfesor {
	GestionarAsignaturas gestionarAsignaturas = new GestionarAsignaturas();
	Modelo modelo = new Modelo();
	
	
	public void gestionarPerfil(String usuario) {
		int opcionActualizar = -1;
		
		Profesor profesor = modelo.getProfesorByProfesorUsername(usuario);
		while (opcionActualizar != 2) {
			try {
				opcionActualizar = Integer.parseInt(ConsolePrint.verProfe(profesor));

				if (opcionActualizar == 1) {
					profesor = ConsolePrint.actualProfe(profesor);
					modelo.modifyProfesor(profesor);
					ConsolePrint.profesorActualizado();
				} else if (opcionActualizar == 2) {
					continue;
				} else {
					ConsolePrint.errorSolicitudOpcion();
				}
			} catch (NumberFormatException e) {
				ConsolePrint.errorSolicitudOpcion();
			}
		}
	}
	
	
	
	public void gestionarAsignaturas(String usuario) {
		int opcionObtener = -1;
		
		Profesor profesor = modelo.getProfesorByProfesorUsername(usuario);
        if (profesor.getAsignaturas().isEmpty()) {
            ConsolePrint.profesorAsignaturasVacio();
        } else {
        	while (opcionObtener != 2) {
        		try {
        			opcionObtener = Integer.parseInt(ConsolePrint.gestionarAsignaturasProfesor(profesor.getAsignaturas()));
                } catch (NumberFormatException e) {
                    ConsolePrint.errorSolicitudOpcion();
                }

				if (opcionObtener == 1) {
					//TODO CUARTO Y QUINTO NIVEL
					int opcionInfoAsignatura = -1;
		    		
		    		try {
		    			opcionInfoAsignatura = Integer.parseInt(ConsolePrint.obtenerAsignaturaProfesor());
		    			
		    			if (opcionInfoAsignatura < profesor.getAsignaturas().size() && opcionInfoAsignatura >= 0) {
		    				int opcioncalificacion= -1;
		    				Asignatura asignatura = modelo.getAsignaturaByAsignaturaName(profesor.getAsignaturas().get(opcionInfoAsignatura));
		    				
		    				while(opcioncalificacion != 2){
		    					try {
		    						opcioncalificacion = Integer.parseInt(ConsolePrint.verAsignaturaProfe(asignatura));
		    	                } catch (NumberFormatException e) {
		    	                    ConsolePrint.errorSolicitudOpcion();
		    	                }
		    					if ( opcioncalificacion == 1 ) {
		    						if (asignatura.getAlumnos().size() > 0) {
										if (ConsolePrint.crearCalificacion(asignatura)) {
											modelo.modifyAsignatura(asignatura);
										}
									} else {
										ConsolePrint.errorCrearCalificacion();
									}
		    					} else if (opcioncalificacion == 2) {
		    						continue;
		    					}
		    					else {
		    						ConsolePrint.errorSolicitudOpcion();
		    					}
		    				}
		    			} else {
		    				ConsolePrint.errorSolicitudOpcion();
		    			}
		    		} catch (NumberFormatException e) {
		    			ConsolePrint.errorSolicitudOpcion();
		    		}
				} else if (opcionObtener == 2) {
					continue;
				} else {
					ConsolePrint.errorSolicitudOpcion();
				}
    		}
        }
	}
}
