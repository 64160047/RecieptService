/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.werapan.databaseproject.service;

import com.werapan.databaseproject.dao.CustomerDao;
import com.werapan.databaseproject.model.Customer;
import java.util.List;

/**
 *
 * @author werapan
 */
public class ValidateException extends Exception{

    public ValidateException(String message) {
        super(message);
    }
    
    
}
