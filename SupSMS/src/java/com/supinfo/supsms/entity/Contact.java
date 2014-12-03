/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.supinfo.supsms.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 *
 * @author Clement
 */
@Entity
public class Contact extends Customer implements Serializable {
    
    private Date update;
        
    @ManyToOne @JoinColumn
    private Sms sms;
    
    public Contact(){
        super();
    }
    
}
