/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uibeans;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import repository.Car;
import repository.CarRepositoryBean;

/**
 *
 * @author hychen39@gm.cyut.edu.tw
 */
@Named(value = "carSelectionBean")
@SessionScoped
public class CarSelectionBean implements Serializable {

    private List<Car> options;
    private String selectedValue;

    private String CarID;
    // Inject the car repository
    // DO NOT REMOVE THE CODE
    @EJB
    CarRepositoryBean repository;

    /**
     * Action method to redirect to displayInfo facelets page.
     *
     * @return target page name
     */
    public String displayInfo() {

        return "displayInfo?faces-redirect=true";
    }

    public String getCarID() {
        return this.CarID;
    }

    public void setCarID(String CarID) {
        this.CarID= CarID;
    }
    public Car getCarImfor(){
        return repository.query(Integer.parseInt(CarID));
    }
    public List<Car> getOptions() {

        return repository.findAll();
    }

}
