/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Class.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jade_
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String numID = request.getParameter("IDNumber");
        String pword = request.getParameter("pword");
        
        Accounts account = new Accounts ();
        account = account.readFile();
        HttpSession session = request.getSession();
        
        for (int i=0; i < account.getAdmin().size(); i++){
            if (numID == null ? account.getAdmin().get(i).getIDNum() == null : numID.equals(account.getAdmin().get(i).getIDNum())){
                if (pword == null ? account.getAdmin().get(i).getPassword() == null : pword.equals(account.getAdmin().get(i).getPassword())) {
                    session.setAttribute("ID", account.getAdmin().get(i).getIDNum());
                    session.setAttribute("name", account.getAdmin().get(i).getFirstName() + " " + account.getAdmin().get(i).getSurname());
                }
            }
        }
        
        for (int i=0; i < account.getSecretary().size(); i++){
            if (numID == null ? account.getSecretary().get(i).getIDNum() == null : numID.equals(account.getSecretary().get(i).getIDNum())){
                if (pword == null ? account.getSecretary().get(i).getPassword() == null : pword.equals(account.getSecretary().get(i).getPassword())) {
                    session.setAttribute("ID", account.getSecretary().get(i).getIDNum());
                    session.setAttribute("name", account.getSecretary().get(i).getFirstName() + " " + account.getSecretary().get(i).getSurname());
                }
            }
        }
        
        for (int i=0; i < account.getDoctor().size(); i++){
            if (numID == null ? account.getDoctor().get(i).getIDNum() == null : numID.equals(account.getDoctor().get(i).getIDNum())){
                if (pword == null ? account.getDoctor().get(i).getPassword() == null : pword.equals(account.getDoctor().get(i).getPassword())) {
                    session.setAttribute("ID", account.getDoctor().get(i).getIDNum());
                    session.setAttribute("name", account.getDoctor().get(i).getFirstName() + " " + account.getDoctor().get(i).getSurname());
                }
            }
        }
        
        for (int i=0; i < account.getPatient().size(); i++){
            if (numID == null ? account.getPatient().get(i).getIDNum() == null : numID.equals(account.getPatient().get(i).getIDNum())){
                if (pword == null ? account.getPatient().get(i).getPassword() == null : pword.equals(account.getPatient().get(i).getPassword())) {
                    session.setAttribute("ID", account.getPatient().get(i).getIDNum());
                    session.setAttribute("name", account.getPatient().get(i).getFirstName() + " " + account.getPatient().get(i).getSurname());
                }
            }
        }
        
        System.out.println(account.getAdmin().size());
        
        if (numID.charAt(0)== 'A'){
                response.sendRedirect("adminUserPage.jsp");
            }
        else {
        response.sendRedirect("userPage.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
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
 