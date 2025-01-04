package com.bank;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/bank")
public class BankServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Bank Account Details</h1>");
        out.println("<p>Account Number: 123456</p>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String accountType = request.getParameter("accountType");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Registration Successful</h1>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Account Type: " + accountType + "</p>");
    }
}