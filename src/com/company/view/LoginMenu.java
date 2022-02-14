package com.company.view;

import com.company.controller.UserManagement;
import com.company.model.User;

import java.util.Scanner;


public class LoginMenu {
    public static Scanner scanner = new Scanner(System.in);
    private UserManagement userManagement = new UserManagement();
    private ManagementMenu managementMenu = new ManagementMenu();

    public void run() {
        int choice = -1;
        do {
            menu();
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    doLogin();
                    break;
                }

                case 2: {
                    doRegister();
                    break;
                }
            }
        } while (choice != 0);
    }

    private void doLogin() {
        System.out.println("Nhập username");
        String username = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();
        boolean isLogin = userManagement.checkUserLogin(username,password);
        if (isLogin){
            System.out.println("Đăng nhập thành công!");
            managementMenu.run();
        }else {
            System.err.println("Username hoặc Password không đúng");
        }
    }

    private void doRegister() {
        System.out.println("Đăng ký tài khoản mới!");
        User user = createUser();
        userManagement.register(user);
    }

    private User createUser() {
        String username = inputUsername();
        String password = inputPassword();
        User user = new User(username, password);
        return user;
    }

    private String inputPassword() {
        String password;
        do {
            System.out.println("Nhập password(6 - 12 kí tự:");
            password = scanner.nextLine();
            if (password.length() < 6) {
                System.err.println("Mật khẩu phải có ít nhất 6 kí tự");
            } else if (password.length() > 12) {
                System.err.println("Mật khẩu chỉ được phép tối đa 12 kí tự");
            }
        } while (password.length() < 6 || password.length() > 12);
        return password;
    }

    private String inputUsername() {
        String username;
        do {
            System.out.println("Nhập tên tài khoản( 6 - 12 kí tự :");
            username = scanner.nextLine();
            if (username.length() < 6) {
                System.err.println("Tài khoản phải có ít nhất 6 kí tự");
            } else if (username.length() > 12) {
                System.err.println("Tài khoản chỉ được phép tối đa 12 kí tự");
            } else if (userManagement.checkUsernameExits(username)) {
                System.out.println("Tài khoản đã được đăng ký!");
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (username.length() < 6 || username.length() > 12 || userManagement.checkUsernameExits(username));
        return username;
    }

    private static void menu() {
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        System.out.println("0. Thoát");
    }
}
