/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.supinfo.supsms.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Clement
 */
@Entity
public class Customer implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String first_name;
    private String last_name;
    private String password;
    private String email;
    private Long phone;
    private Long card;
    
    private Set<Contact> contact;
    private Invoice invoice;
    private Sms sms;
    
    @NotNull
    @Column(nullable=false)
    private Date created;
    
    public Customer(){
        super();
    }
    
}