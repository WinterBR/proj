package com.exemplo.app.controller;

import com.exemplo.app.model.Mensagem;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Mensagem mensagem = new Mensagem("Olá, mundo!");
        request.setAttribute("mensagem", mensagem);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}