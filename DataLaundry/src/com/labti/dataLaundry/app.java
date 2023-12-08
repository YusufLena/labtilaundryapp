/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.dataLaundry;

import com.labti.dataLaundry.view.LaundryView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.labti.dataLaundry.service.LaundryService;

public class app {

    private static ApplicationContext applicationContext;
    
    public static void main(String[] args){
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new LaundryView().setVisible(true);
    }

   public static LaundryService getLaundryService(){
        return(LaundryService)applicationContext.getBean("LaundryService");
    }
    
}