package com.company.view;

import com.company.controller.ProductManagement;

import java.util.Scanner;

public class UserLogin {
    private static Scanner scanner = new Scanner(System.in);
    public void run(){
        int choice = -1;
        do {
            System.out.println("Menu sản phẩm");
            System.out.println("1. Mua sản phẩm");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice){
                case 1: {
                    ProductMenu.buyProductById(Main.productManagement);
                    System.out.println("1. Thêm vào giỏ hàng");
                    System.out.println("0. Quay lại");
                    break;
                }

            }
        }while (choice != 0);

    }
}
