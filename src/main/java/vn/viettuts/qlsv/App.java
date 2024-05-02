package vn.viettuts.qlsv;

import java.awt.EventQueue;

import vn.viettuts.qlsv.controller.LoginController;
import vn.viettuts.qlsv.view.LoginViu;


public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                LoginViu view = new LoginViu();
                LoginController controller = new LoginController(view);
                // hiển thị màn hình login
                controller.showLoginView();
            }
        });
    }}