/**
 * 
 */
package com.buenmaestro.project.services;

import java.util.ArrayList;
import java.util.List;

import com.buenmaestro.project.entity.Empleado;

/**
 * @author Eliezer
 * Clase que permite realizar la logica de negocio para empleados
 *
 */
public class EmpleadoService {
	
	/**
	 *
	 * Metodo que permite consultar la lista de empleados de empresas de TI.
	 *
	 */
	public List<Empleado> consultarEmpleados(){
		
		//Generar la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoHP = new Empleado();
		Empleado empleadoNetflix = new Empleado();
		Empleado empleadoStarlink = new Empleado();
	
		empleadoIBM.setNombre("Victor");
		empleadoIBM.setPrimerApellido("Ramirez");
		empleadoIBM.setSegundoApellido("Gonzales");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis");
		empleadoMicrosoft.setPrimerApellido("Altamira");
		empleadoMicrosoft.setSegundoApellido("Romero");
		empleadoMicrosoft.setPuesto("CEO");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Daniel");
		empleadoApple.setPrimerApellido("Lopez");
		empleadoApple.setSegundoApellido("Hernanadez");
		empleadoApple.setPuesto("Architect");
		empleadoApple.setEstatus(true);
		
		//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		empleadoAmazon.setNombre("Gabriel");
		empleadoAmazon.setPrimerApellido("Lopez");
		empleadoAmazon.setSegundoApellido("Hernanadez");
		empleadoAmazon.setPuesto("Architect");
		empleadoAmazon.setEstatus(true);
		
		empleadoOracle.setNombre("Juan Jose");
		empleadoOracle.setPrimerApellido("Lopez");
		empleadoOracle.setSegundoApellido("Hernanadez");
		empleadoOracle.setPuesto("Architect");
		empleadoOracle.setEstatus(true);
		
		empleadoHP.setNombre("Manuel");
		empleadoHP.setPrimerApellido("Lopez");
		empleadoHP.setSegundoApellido("Hernanadez");
		empleadoHP.setPuesto("Architect");
		empleadoHP.setEstatus(true);
		
		
		empleadoNetflix.setNombre("Jazmin");
		empleadoNetflix.setPrimerApellido("Lopez");
		empleadoNetflix.setSegundoApellido("Hernanadez");
		empleadoNetflix.setPuesto("Architect");
		empleadoNetflix.setEstatus(true);
		
		empleadoStarlink.setNombre("Maribel");
		empleadoStarlink.setPrimerApellido("Lopez");
		empleadoStarlink.setSegundoApellido("Hernanadez");
		empleadoStarlink.setPuesto("Architect");
		empleadoStarlink.setEstatus(true);
		
		
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		empleados.add(empleadoOracle);
		empleados.add(empleadoNetflix);
		empleados.add(empleadoStarlink);
		empleados.add(empleadoApple);
		
		return empleados;
		
	}

}
