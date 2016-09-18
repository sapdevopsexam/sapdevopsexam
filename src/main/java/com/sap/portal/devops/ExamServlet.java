package com.sap.portal.devops;

import java.io.IOException;

/**
 * Created by I042428 on 18-09-16.
 */
public class ExamServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        throw new RuntimeException("No POST for you!");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().write("Well done!");
    }
}
