package com.scheduling.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.scheduling.model.Conductor;
import com.scheduling.model.Schedule;

@Component
public class ScheduleDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insert(Schedule schedule) {
        return (Integer) this.hibernateTemplate.save(schedule);
    }

    @Transactional(readOnly = true)
    public boolean checkScheduleExists(String date) {
        String hql = "SELECT COUNT(*) FROM Schedule WHERE sDate = :date";
        Long count = (Long) hibernateTemplate.findByNamedParam(hql, "date", date).get(0);
        return count > 0;
    }

	public List<Schedule> viewSchedules() {
		return hibernateTemplate.loadAll(Schedule.class);
	}
}


