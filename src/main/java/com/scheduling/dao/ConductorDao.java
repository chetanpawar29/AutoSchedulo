package com.scheduling.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;


import com.scheduling.model.Conductor;
import com.scheduling.model.Drivers;

@Component
public class ConductorDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Conductor v) {
		int i = (Integer) this.hibernateTemplate.save(v);
		return i;
	}
	//view one conductor
			public Conductor viewConductor(int cid)
			{
				Conductor conductor=hibernateTemplate.get(Conductor.class, cid);
				return conductor;
			}
			public List<Conductor> viewAllConductors()
			{
				return hibernateTemplate.loadAll(Conductor.class);
			}

			@Transactional
			public void deleteConductor(Conductor conductor)
			{
				hibernateTemplate.delete(conductor);

			}
			@Transactional
			public void updateConductor(Conductor conductor) 
			{	
				hibernateTemplate.update(conductor);
			}
	
}
