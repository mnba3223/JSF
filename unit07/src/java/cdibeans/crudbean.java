/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdibeans;

import entitys.Item;
import ejb.ItemFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author mnba3
 */
@Named(value = "crudbean")
@SessionScoped
public class crudbean implements Serializable {

    /**
     * Creates a new instance of crudbean
     */
    @EJB
    private ItemFacade itemFacade;
    
    
    private Item newItem;
    private Item updateItem;

    public Item getUpdateItem() {
        return updateItem;
    }

    public void setUpdateItem(Item updateItem) {
        this.updateItem = updateItem;
    }
   

    public Item getNewItem() {
        return newItem;
    }

    public void setNewItem(Item newItem) {
        this.newItem = newItem;
    }
    
    
    public List<Item> findAll(){
        return itemFacade.findAll();
    }
    
    public String goNewItemPage(){
        this.newItem = new Item();
        return "createItem";
    }
    
     public String goUpdateItemPage(long id){
         this.updateItem=itemFacade.find(id);
        return "updateItem";
    }
     
      public String RemoveItem(Item item){
        this.itemFacade.remove(item);
        return "itemList";
    }
    
    public String addItem(){
        itemFacade.create(newItem);
        return "itemList";
    }
  
    public String modifyItem(){
        this.itemFacade.edit(this.updateItem);
        return "itemList";
    }
    
    public crudbean() {
    }
    
}
