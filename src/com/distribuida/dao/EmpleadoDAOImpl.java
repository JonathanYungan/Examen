package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Empleado;





public class EmpleadoDAOImpl {

	@Autowired
	private SessionFactory sessionFactory;	
	
	

	@Override
	@Transactional
	public List<Empleado> findALL() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Empleado", Empleado.class).getResultList();
	}
 
	@Override
	public Empleado findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}
//xl
	@Override
	public void add(Empleado empleado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Empleadp empleado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

}
