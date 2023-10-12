/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_service;

import com.werapan.databaseproject.model.Customer;
import com.werapan.databaseproject.service.CustomerService;

/**
 *
 * @author user
 */
public class testCustomerService {
    public static void main(String[] args) {
        CustomerService cs = new CustomerService();
        for(Customer test:cs.getCustomers()) {
            System.out.println(test);
        }
        Customer cs1 = new Customer("kob", "0888868888");
        cs.addNew(cs1);
        for(Customer test:cs.getCustomers()) {
            System.out.println(test);
        }
    }
    
}
