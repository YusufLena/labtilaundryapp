/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataLaundry.dao;

import com.labti.dataLaundry.model.Laundry;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LaundryDAOImpl implements LaundryDAO {
     @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void save(Laundry laundry){
        sessionFactory.getCurrentSession().save(laundry);
    }
    
    @Override
    public void update(Laundry laundry){
        sessionFactory.getCurrentSession().update(laundry);
    }
    
    @Override
    public void delete(Laundry laundry){
        sessionFactory.getCurrentSession().delete(laundry);
    }
    
    @Override
    public Laundry getLaundry(String id){
        return (Laundry) sessionFactory.getCurrentSession().get(Laundry.class, id);        
    }
    
    @Override
    public List<Laundry> getLaundrys(){
        return sessionFactory.getCurrentSession().createCriteria(Laundry.class).list();
    }
}