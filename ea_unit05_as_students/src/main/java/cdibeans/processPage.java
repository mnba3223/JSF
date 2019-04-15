/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;

/**
 *
 * @author mnba3
 */
@Named(value = "processPage")
@SessionScoped
public class processPage implements Serializable {

    private Integer itemID = 1;
    //private String itemID;

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public String processPage() {
        if (itemID == 1) {
            return "page1";
        }

        if (itemID == 2) {
            return "page2";
        }

        if (itemID == 3) {
            return "page3";
        } else {
            return "fail";
        }
    }

}
