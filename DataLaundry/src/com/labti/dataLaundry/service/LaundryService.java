/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataLaundry.service;

import com.labti.dataLaundry.model.Laundry;
import java.util.List;

public interface LaundryService {
    public void save(Laundry laundry);
    public void update(Laundry laundry);
    public void delete(Laundry laundry);
    public Laundry getLaundry(String npm);
    public List<Laundry> getLaundrys();
}