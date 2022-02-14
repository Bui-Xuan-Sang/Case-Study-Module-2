package com.company.view;

import com.company.controller.ProductManagement;
import com.company.model.Product;

public class Main {
    public static ProductManagement productManagement = new ProductManagement();

    public static void main(String[] args) {
        Product product = new Product("IP","Iphone13promax",33000000,"100%");
        Product product1 = new Product("MAC","MacbookPro2021",46000000,"100%");
        Product product2 = new Product("IPA","IpadPro2021",28000000,"100%");
        productManagement.addProduct(product);
        productManagement.addProduct(product1);
        productManagement.addProduct(product2);
        LoginMenu loginMenu = new LoginMenu();
        loginMenu.run();
    }
}
