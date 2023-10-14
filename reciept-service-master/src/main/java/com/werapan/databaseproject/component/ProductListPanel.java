/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.werapan.databaseproject.component;

import com.werapan.databaseproject.model.Product;
import com.werapan.databaseproject.service.ProductService;
import java.awt.GridLayout;
import java.util.ArrayList;

/**
 *
 * @author minnie
 */
public class ProductListPanel extends javax.swing.JPanel {
    private final ProductService productService;
     private final ArrayList<Product> products;

    /**
     * Creates new form ProductListPanel
     */
    public ProductListPanel() {
        initComponents();
        productService = new ProductService();
        products = productService.getProductOrderByName();
        
        int productSize = products.size();
        
        for(Product p: products) {
            pnlProductList.add(new ProductItemPanel(p));
            
        }
        pnlProductList.setLayout(new GridLayout((productSize/3)+((productSize%3 !=0)?1:0),3,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProductList = new javax.swing.JPanel();

        javax.swing.GroupLayout pnlProductListLayout = new javax.swing.GroupLayout(pnlProductList);
        pnlProductList.setLayout(pnlProductListLayout);
        pnlProductListLayout.setHorizontalGroup(
            pnlProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        pnlProductListLayout.setVerticalGroup(
            pnlProductListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlProductList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlProductList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnlProductList;
    // End of variables declaration//GEN-END:variables
}
