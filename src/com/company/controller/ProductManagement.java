package com.company.controller;

import com.company.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManagement {
    private List<Product> products;

    public ProductManagement() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }



    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product findProductById(String id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equalsIgnoreCase(id)) {
                return products.get(i);
            }
        }
        return null;
    }

    public void showListProduct(){
        for (Product product : products){
            System.out.println(product);
        }
    }

    public void productSortById(){
        for (int i = 0; i < products.size(); i++) {
            for (int j = products.size() - 1; j > i; j--) {
                if (products.get(j).getId().compareTo(products.get(j - 1).getId()) < 0) {
                    Product temp = products.get(j);
                    products.set(j, products.get(j - 1));
                    products.set(j - 1, temp);
                }
            }
        }
    }

    public void productSortByPrice(){
        for (int i = 0; i < products.size(); i++) {
            for (int j = products.size() - 1; j > i; j--) {
                if (products.get(j).getPrice() < products.get(j - 1).getPrice()) {
                    Product temp = products.get(j);
                    products.set(j, products.get(j - 1));
                    products.set(j - 1, temp);
                }
            }
        }
    }
}
