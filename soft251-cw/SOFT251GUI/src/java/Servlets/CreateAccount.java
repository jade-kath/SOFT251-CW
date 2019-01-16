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
@WebServlet(name = "CreateAccount", urlPatterns = {"/CreateAccount"})
public class CreateAccount extends HttpServlet {

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
        
        HttpSession session = request.getSession();
        
        Accounts acc = new Accounts();
        
        acc = acc.readFile();
        
        int num = Integer.parseInt(request.getParameter("userType"));
        System.out.println(num);
        if(num==0){
        Administrator admin = new Administrator();
        admin.setFirstName(request.getParameter("firstName"));
        admin.setSurname(request.getParameter("surname"));
        admin.setAddressLineOne(request.getParameter("addressOne"));
        admin.setAddressLineTwo(request.getParameter("addressTwo"));
        admin.setPostCode(request.getParameter("postCode"));
        admin.setIDNum(request.getParameter("IDnum"));
        admin.setPassword(request.getParameter("pass"));
        
        acc.getAdmin().add(admin);
        }
        
        else if(num==1){
        Secretary secretary = new Secretary();
        secretary.setFirstName(request.getParameter("firstName"));
        secretary.setSurname(request.getParameter("surname"));
        secretary.setAddressLineOne(request.getParameter("addressOne"));
        secretary.setAddressLineTwo(request.getParameter("addressTwo"));
        secretary.setPostCode(request.getParameter("postCode"));
        secretary.setIDNum(request.getParameter("IDnum"));
        secretary.setPassword(request.getParameter("pass"));
        
        acc.getSecretary().add(secretary);
        }
        
        else if(num==2){
        Doctor doctors = new Doctor();
        doctors.setFirstName(request.getParameter("firstName"));
        doctors.setSurname(request.getParameter("surname"));
        doctors.setAddressLineOne(request.getParameter("addressOne"));
        doctors.setAddressLineTwo(request.getParameter("addressTwo"));
        doctors.setPostCode(request.getParameter("postCode"));
        doctors.setIDNum(request.getParameter("IDnum"));
        doctors.setPassword(request.getParameter("pass"));
        System.out.println("Doctor"+doctors.getFirstName());
        acc.getDoctor().add(doctors);
        System.out.println(acc.getDoctor().get(0).getFirstName());
        }
        
        acc.writeFile();
        
        response.sendRedirect("adminUserPage.jsp");
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
