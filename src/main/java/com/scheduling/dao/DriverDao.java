package com.scheduling.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.scheduling.model.Conductor;
import com.scheduling.model.Drivers;

@Component
public class DriverDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Drivers v) {
		int i = (Integer) this.hibernateTemplate.save(v);
		return i;
	}
	//view one driver
		public Drivers viewDriver(int did)
		{
			Drivers drivers=hibernateTemplate.get(Drivers.class, did);
			return drivers;
		}
		public List<Drivers> viewAllDrivers()
		{
			return hibernateTemplate.loadAll(Drivers.class);
		}
		@Transactional
		public void deleteDriver(Drivers drivers)
		{
			hibernateTemplate.delete(drivers);

		}
		@Transactional
		public void updateDriver(Drivers drivers) 
		{	
			hibernateTemplate.update(drivers);
		}
}
