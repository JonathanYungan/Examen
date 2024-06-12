package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.EmpleadoDAO;
import com.distribuida.entities.Empleado;

public class PrincipalEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//PATRON IOC INVERSION DEL CONTROL
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		EmpleadoDAO empleadoDAO = context.getBean("empleadoDAOImpl",EmpleadoDAO.class);
		
		List<Empleado>empleado = empleadoDAO.findALL();
				empleado.forEach(item ->{
					System.out.println(item.toString());
				});
		
		context.close();
		}
}
