package ederma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ederma.dao.DonationDAO;
/**
 * Servlet implementation class DeleteDonationController
 */
@WebServlet("/DeleteDonationController")
public class DeleteDonationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DonationDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteDonationController() {
        super();
        dao = new DonationDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("donationid"));
		dao.deleteDonation(id);
		request.setAttribute("donations", DonationDAO.getAllDonations());
		RequestDispatcher view = request.getRequestDispatcher("LIST DONATION.jsp");
		view.forward(request, response);
	}
}
