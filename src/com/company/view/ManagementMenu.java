package com.company.view;

import com.company.model.Product;
import com.company.controller.ProductManagement;

import java.util.Scanner;

public class ManagementMenu {
    public static Scanner scanner = new Scanner(System.in);
    UserLogin userLogin = new UserLogin();

    public void run(String username) {
        if (username.equals("admin123")) {


            int choice = -1;
            ProductManagement productManagement = new ProductManagement();
            do {
                menu();
                System.out.println("Nhập lựa chọn của bạn:");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        ProductMenu.run();
                        break;
                    }
                }
            } while (choice != 0);
        } else {
            userLogin.run();
        }
    }

    private void menu() {
        System.out.println("--- Ứng dụng quản lý sản phẩm---");
        System.out.println("1. Quản lý sản phẩm");
        System.out.println("0. Thoát");
    }

//        do {
//            System.out.println("---Ứng dụng quản lí sản phẩm---");
//            menu();
//            System.out.println("Nhập lựa chọn của bạn:");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1: {
//                    System.out.println("---Danh sách sản phẩm---");
//                    productManagement.displayAllProduct();
//                    break;
//                }
//                case 2: {
//                    System.out.println("---Thêm mới sản phẩm---");
//                    System.out.println("Nhập vị tí muốn thêm sản phẩm");
//                    int index = scanner.nextInt();
//                    Product product = inputProduct();
//                    productManagement.addNewProduct(index, product);
//                    break;
//                }
//                case 3: {
//                    System.out.println("---Cập nhật thông tin sản phẩm---");
//                    System.out.println("Nhập vị tí muốn thêm sản phẩm");
//                    int index = scanner.nextInt();
//                    Product product = inputProduct();
//                    productManagement.updateProduct(index, product);
//                    break;
//                }
//                case 4: {
//                    System.out.println("---Xóa sản phẩm---");
//                    System.out.println("Nhập vị tí muốn thêm sản phẩm");
//                    int index = scanner.nextInt();
//                    productManagement.removeProduct(index);
//                    break;
//                }
//            }
//        } while (choice != 0);
//    }
//
//    public static Product inputProduct() {
//        System.out.println("Nhập thông tin của sản phẩm");
//        System.out.println("Nhập mã sản phẩm:");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Nhập tên sản phẩm:");
//        String name = scanner.nextLine();
//        System.out.println("Nhập giá sản phẩm:");
//        double price = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.println("Nhập mô tả sản phẩm");
//        String description = scanner.nextLine();
//        return new Product(id, name, price, description);
//    }
//
//    public void menu() {
//        System.out.println("---MENU QUẢN LÝ SẢN PHẨM---");
//        System.out.println("1. Hiển thị danh sách sản phẩm");
//        System.out.println("2. Thêm sản phẩm");
//        System.out.println("3. Cập nhật sản phẩm");
//        System.out.println("4. Xóa sản phẩm");
//        System.out.println("5. Sắp xếp danh sách sản phẩm");
//        System.out.println("6. Tìm kiếm sản phẩm theo tên");
//        System.out.println("0. Thoát chương trình");
//    }
}
