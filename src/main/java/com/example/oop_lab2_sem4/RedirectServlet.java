package com.example.oop_lab2_sem4;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "RedirectServlet", urlPatterns = {"/services", "/contact", "/feedback","/about"})
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = request.getServletPath();
        String targetPage = path.substring(1) + ".html";

        response.setStatus(response.SC_ACCEPTED);
        response.setHeader("Location", targetPage);
        response.sendRedirect(targetPage);
    }
}