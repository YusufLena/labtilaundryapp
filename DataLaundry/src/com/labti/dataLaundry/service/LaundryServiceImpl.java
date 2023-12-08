/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataLaundry.service;

import com.labti.dataLaundry.model.Laundry;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.labti.dataLaundry.dao.LaundryDAO;

@Service("LaundryService")
@Transactional(readOnly = true)

public class LaundryServiceImpl implements LaundryService {
    @Autowired
    private LaundryDAO laundryDao;
    
    @Transactional
    @Override
    public void save(Laundry laundry){
        laundryDao.save(laundry);
    }
    
    @Transactional
    @Override
    public void update(Laundry laundry){
        laundryDao.update(laundry);
    }
    
    @Transactional
    @Override
    public void delete(Laundry laundry){
        laundryDao.delete(laundry);
    }
    
    @Override
    public Laundry getLaundry(String npm){
        return laundryDao.getLaundry(npm);
    }
    
    @Override
    public List<Laundry> getLaundrys(){
        return laundryDao.getLaundrys();
    }
}
