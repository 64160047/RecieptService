/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_service;

import com.werapan.databaseproject.dao.ProductDao;
import com.werapan.databaseproject.dao.RecieptDao;
import com.werapan.databaseproject.dao.RecieptDetaillDao;
import com.werapan.databaseproject.model.Product;
import com.werapan.databaseproject.model.Reciept;
import com.werapan.databaseproject.model.RecieptDetail;
import java.util.List;

/**
 *
 * @author user
 */
public class testRecieptDetailDao {
    public static void main(String[] args) {
        
        
        RecieptDetaillDao rdd = new RecieptDetaillDao();
        for(RecieptDetail rd : rdd.getAll()) {
            System.out.println(rd);
        }
        RecieptDao rd = new RecieptDao();
        ProductDao pd = new ProductDao();
        List<Product> products = pd.getAll();
        Product product0 = products.get(0);
        Reciept reciept = rd.get(1);
        RecieptDetail newRecieptDetail = new RecieptDetail(product0.getId(),product0.getName(),product0.getPrice(),1,product0.getPrice()*1,reciept.getId());
        rdd.save(newRecieptDetail);
    }
        
}
