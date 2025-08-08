package com.scheduling.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.scheduling.model.Drivers;
import com.scheduling.model.Route;

@Component

public class RouteDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public RouteDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public RouteDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RouteDao [hibernateTemplate=" + hibernateTemplate + "]";
	}

	@Transactional
	public int addRoute(Route route) {
		int i=(Integer) hibernateTemplate.save(route);
		return i;
	}
	//view one Route
			public Route viewRoute(int rid)
			{
				Route routes=hibernateTemplate.get(Route.class, rid);
				return routes;
			}
			public List<Route> viewAllRoutes()
			{
				return hibernateTemplate.loadAll(Route.class);
			}
			@Transactional
			public void deleteRoute(Route route)
			{
				hibernateTemplate.delete(route);

			}
			@Transactional
			public void updateRoute(Route route) 
			{	
				hibernateTemplate.update(route);
			}

}
