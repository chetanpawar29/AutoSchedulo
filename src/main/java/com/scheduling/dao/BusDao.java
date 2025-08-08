package com.scheduling.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.scheduling.model.Bus;
import com.scheduling.model.Drivers;

@Component
public class BusDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

// add bus	
	@Transactional
	public String addBus(Bus bus) {
		
		String i=(String) this.hibernateTemplate.save(bus);
		return i;
	}
//view one bus
			public Bus viewBus(String bid)
			{
				Bus bus=hibernateTemplate.get(Bus.class, bid);
				return bus;
			}
//view all buses
			public List<Bus> viewAllBuses()
			{
				return hibernateTemplate.loadAll(Bus.class);
			}
//delete bus
			@Transactional
			public void deleteBus(Bus bus)
			{
				hibernateTemplate.delete(bus);

			}
//updateBus
			@Transactional
			public void updateBus(Bus bus) 
			{	
				hibernateTemplate.update(bus);
			}
}