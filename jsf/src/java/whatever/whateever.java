/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatever;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author mnba3
 */
@Named(value = "whateever")
@RequestScoped
public class whateever {

    private String name;

    
     public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String printout() {
        name += "**";
        return "newjsf2";
    }

    /**
     *
     * Creates a new instance of whateever
     */
    public whateever() {
    }

}
