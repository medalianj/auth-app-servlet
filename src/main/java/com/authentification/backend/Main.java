package com.authentification.backend;

import com.authentification.backend.DAO.LoginDAO;
import com.authentification.backend.IDAO.ILoginDAO;

public class Main {
    public static void main(String[] args) {
        ILoginDAO loginDAO = new LoginDAO();
        System.out.println("The user is : " + loginDAO.isUserExistent("anejae", "anejae123"));
    }
}
