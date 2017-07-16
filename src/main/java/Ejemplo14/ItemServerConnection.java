/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo14;

/**
 *
 * @author cesar
 */
public class ItemServerConnection {
    
    
    @Url(protocol="https",host = "www.gogle.com",port = 8000)
    private String itemUrl;
    
    public ItemServerConnection(String itemUrl){
        this.itemUrl = itemUrl;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }
    
    
}
