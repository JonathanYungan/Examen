
package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Empleado;

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Empleado> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Empleado", Empleado.class).getResultList();
    }

    @Override
    @Transactional
    public Empleado findOne(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Empleado.class, id);
    }

    @Override
    @Transactional
    public void add(Empleado empleado) {
        Session session = sessionFactory.getCurrentSession();
        session.save(empleado);
    }

    @Override
    @Transactional
    public void update(Empleado empleado) {
        Session session = sessionFactory.getCurrentSession();
        session.update(empleado);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Session session = sessionFactory.getCurrentSession();
        Empleado empleado = session.byId(Empleado.class).load(id);
        if (empleado != null) {
            session.delete(empleado);
        }
    }
}