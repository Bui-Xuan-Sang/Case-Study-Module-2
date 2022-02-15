package com.company.view;

import com.company.controller.ProductManagement;
import com.company.model.Product;

import java.util.Scanner;

public class ProductMenu {
    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        int choice = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 1: {
                    Main.productManagement.showListProduct();
                    break;
                }
                case 2: {
                    Product product = inputProduct();
                    Main.productManagement.addProduct(product);
                    break;
                }
                case 3: {
                    showUpdateProduct(Main.productManagement);
                    break;
                }
                case 4: {
                    showDelete(Main.productManagement);
                    break;
                }
                case 5: {
                    searchProduct(Main.productManagement);
                    break;
                }
                case 6: {
                    Main.productManagement.productSortById();
                    System.out.println("Đã sắp xếp");
                    break;
                }
                case 7: {
                    Main.productManagement.productSortByPrice();
                    System.out.println("Đã sắp xếp");
                    break;
                }
            }
        } while (choice != 0);
    }

    public static Product inputProduct() {
        System.out.println("Nhập sản phẩm muốn thêm");
        System.out.println("Nhập id sản phẩm: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        Long price = scanner.nextLong();
        scanner.next();
        System.out.println("Nhập số lượng sản phẩm");
        int amount = scanner.nextInt();
        System.out.println("Nhập mô tả sản phẩm: ");
        String description = scanner.nextLine();
        Product product = new Product(id,name,price,amount,description);
        return product;
    }

    public static void showUpdateProduct(ProductManagement productManagement){
        System.out.println("Chỉnh sửa thông tin sản phẩm");
        System.out.println("Nhập mã sản phẩm cần chỉnh sửa");
        String id = scanner.nextLine();
        Product result = productManagement.findProductById(id);

        if (result == null){
            System.out.println("Không tìm được");
        }else {
            System.out.println("Nhập id sản phẩm");
            String newId = scanner.nextLine();
            result.setName(newId);
            System.out.println("Nhập tên sản phẩm");
            String newName = scanner.nextLine();
            result.setName(newName);
            System.out.println("Nhập giá sản phẩm");
            long newPrice = scanner.nextLong();
            scanner.nextLine();
            result.setPrice(newPrice);
            System.out.println("Nhập mô tả sản phẩm");
            String newDescription = scanner.nextLine();
            result.setDescription(newDescription);
        }
        }
 public static void showDelete(ProductManagement productManagement){
        // người dùng nhập một chuỗi
     // tìm trong productManagement xem có sản phẩm nào trùng id với chuỗi trên không
        // nếu kq == null thì thông báo
     // nếu kq != null thì kq khoi danh sach nằm trong productManagement
     System.out.println("Nhập id muốn xóa");
     String id = scanner.nextLine();
     Product result = productManagement.findProductById(id);
     if (result == null){
         System.out.println("Không có trong danh sách");
     }else {
         productManagement.removeProduct(result);
         System.out.println("Đã xóa!");
     }
 }

 public static void searchProduct(ProductManagement productManagement){
     System.out.println("Nhập id ");
     String id = scanner.nextLine();
     Product result = productManagement.findProductById(id);
     if (result == null){
         System.out.println("Không có trong danh sách");
     }else {
         System.out.println(result);
     }
 }

 public static void buyProductById(ProductManagement productManagement){
        int choice = -1;
     System.out.println("Nhập Id sản phẩm bạn muốn mua");
     String id = scanner.nextLine();
     Product result = productManagement.findProductById(id);
     if (result == null){
         System.out.println("Không có sản phẩm bạn muốn mua");
     }else {
         System.out.println(result);
     }
 }


    public static void menu() {
        System.out.println("1. Danh sách các sản phẩm");
        System.out.println("2. Thêm sản phẩm");
        System.out.println("3. Cập nhật sản phẩm");
        System.out.println("4. Xóa sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm");
        System.out.println("6. Sắp xếp sản phẩm theo ID");
        System.out.println("7. Sắp xếp sản phẩm theo giá");
        System.out.println("0. Quay lại");
    }
}
