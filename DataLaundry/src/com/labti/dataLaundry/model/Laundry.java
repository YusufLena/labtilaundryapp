/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataLaundry.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "datalaundry")
@Entity
public class Laundry {
    @Id
    @Column(name = "id", length = 8)
    private String id;
    
    @Column(name = "nama", length = 50)
    private String nama;
    
    @Column(name = "jenislayanan", length = 50)
    private String jenislayanan;
    
    @Column(name = "harga", length = 12)
    private String harga;
    
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getJenisLayanan(){
        return jenislayanan;
    }
    public void setJenisLayanan(String jenislayanan){
        this.jenislayanan = jenislayanan;
    }
    
    public String getHarga(){
        return harga;
    }
    
    public void setHarga(String  harga){
        this.harga = harga;
    }
    
}