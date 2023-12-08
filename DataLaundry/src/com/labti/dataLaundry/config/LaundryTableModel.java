/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataLaundry.config;

import com.labti.dataLaundry.model.Laundry;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class LaundryTableModel extends AbstractTableModel {
    private List<Laundry> Laundrys = new ArrayList<>();
    private final String HEADER[] = {"id","nama","jenislayanan","harga"};
    
    public LaundryTableModel(List<Laundry> mahasiswas){
        this.Laundrys = mahasiswas;
    }
    
    @Override
    public int getRowCount(){
        return Laundrys.size();
    }
    
    @Override
    public int getColumnCount(){
        return HEADER.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return HEADER[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Laundry laundry = Laundrys.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return laundry.getId();
            case 1:
                return laundry.getNama();
            case 2:
                return laundry.getJenisLayanan();
            case 3:
                return laundry.getHarga();
            default:
                return null;
        }
    }
}