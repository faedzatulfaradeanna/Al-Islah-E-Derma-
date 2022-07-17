package ederma.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ederma.dao.DonationDAO;
import ederma.model.Donation;

/**
 * Servlet implementation class AddDonationController
 */
@WebServlet("/AddDonationController")
public class AddDonationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DonationDAO dao;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDonationController() {
        super();
        dao = new DonationDAO();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Donation d = new Donation();
		d.setDonationName(request.getParameter("donationName"));
		d.setDonationCategory(request.getParameter("donationCategory"));
		d.setDonationDetails(request.getParameter("donationDetails"));
		d.setTargetAmount(Double.parseDouble(request.getParameter("targetAmount")));
		
		dao.addDonation(d); //invoke method addShawl() in ShawlDAO
		
		request.setAttribute("donations", DonationDAO.getAllDonations());
		RequestDispatcher view = request.getRequestDispatcher("LIST DONATION.jsp");
		view.forward(request, response);
	}
}
