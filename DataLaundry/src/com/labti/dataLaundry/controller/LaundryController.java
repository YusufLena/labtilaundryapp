/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataLaundry.controller;

import com.labti.dataLaundry.app;
import com.labti.dataLaundry.config.LaundryTableModel;
import com.labti.dataLaundry.model.Laundry;
import com.labti.dataLaundry.view.LaundryView;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class LaundryController {
    private final LaundryView laundryView;
    private LaundryTableModel LaundryTableModel;
    private List<Laundry> Laundrys;
    
    public LaundryController (LaundryView LaundryView){
        this.laundryView = LaundryView;
    }
    
    public void tampilData(){
        Laundrys = app.getLaundryService().getLaundrys();
        LaundryTableModel = new LaundryTableModel(Laundrys);
        this.laundryView.getTabel().setModel((TableModel) LaundryTableModel);
    }
    
  public void show(){
        int index = this.laundryView.getTabel().getSelectedRow();
        this.laundryView.getNpm().setText(String.valueOf(
        this.laundryView.getTabel().getValueAt(index, 0)));
        this.laundryView.getNama().setText(String.valueOf(
        this.laundryView.getTabel().getValueAt(index, 1)));
        this.laundryView.getJenisLayanan().setText(String.valueOf(
        this.laundryView.getTabel().getValueAt(index, 2)));
        this.laundryView.getHarga().setText(String.valueOf(
        this.laundryView.getTabel().getValueAt(index, 3)));
    }
    
    public void clear(){
        this.laundryView.getNpm().setText("");
        this.laundryView.getNama().setText("");
        this.laundryView.getJenisLayanan().setText("");
        this.laundryView.getHarga().setText("");
    }
    
    public void saveLaundry(){
        Laundry laundry = new Laundry();
        laundry.setId(this.laundryView.getNpm().getText());
        laundry.setNama(this.laundryView.getNama().getText());
        laundry.setJenisLayanan(this.laundryView.getJenisLayanan().getText());
        laundry.setHarga(this.laundryView.getHarga().getText());
        app.getLaundryService().save(laundry);
        JOptionPane.showMessageDialog(null, "Data Berhasil di simpan", "info",
                JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void updateLaundry(){
       Laundry laundry = new Laundry();
       laundry.setId(this.laundryView.getNpm().getText());
       laundry.setNama(this.laundryView.getNama().getText());
       laundry.setJenisLayanan(this.laundryView.getJenisLayanan().getText());
       laundry.setHarga(this.laundryView.getHarga().getText());
       app.getLaundryService().update(laundry);
       JOptionPane.showMessageDialog(null, "Data berhasil di Edit", "info",
                JOptionPane.INFORMATION_MESSAGE);
        clear();
        tampilData();
    }
    
    public void deleteLaundry(){
        if(this.laundryView.getNpm().getText() == null){
            JOptionPane.showMessageDialog(null, "mahasiswa belum dipilih","error",JOptionPane.ERROR_MESSAGE);
        }else{
            Laundry laundry = new Laundry();
            laundry.setId(this.laundryView.getNpm().getText());
            int pilih = JOptionPane.showConfirmDialog(null,"Apakah data ingin dihapus ?", "Warning",JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (pilih == JOptionPane.YES_OPTION){
                app.getLaundryService().delete(laundry);
                JOptionPane.showMessageDialog(null, "Data Berhasil di Hapus","info",JOptionPane.INFORMATION_MESSAGE);
                clear();
                tampilData();
            }
        }
    }
}
