/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

/**
 *
 * @author almeida.hugo
 */
public class ServletCadastroUsuario extends HttpServlet {
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Usuario u = new Usuario();
        u.setNome(request.getParameter("nome"));
        u.setEmail(request.getParameter("email"));
        u.setUsuario(request.getParameter("usuario"));
        u.setSenha(request.getParameter("senha"));
        u.setNascimento(request.getParameter("nascimento"));
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.inserir(u);
        
        request.setAttribute("usuario", u);
        request.getRequestDispatcher("view/principal.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
