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
 * Servlet implementation class UpdateController
 */
@WebServlet("/UpdateDonationController")
public class UpdateDonationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DonationDAO dao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDonationController() {
        super();
        dao = new DonationDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("donationId"));
		request.setAttribute("d", DonationDAO.getDonationById(id));
		RequestDispatcher view = request.getRequestDispatcher("UPDATE DONATION.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Donation d = new Donation();
		d.setDonationId(Integer.parseInt(request.getParameter("donationId")));
		d.setDonationName(request.getParameter("donationName"));
		d.setDonationCategory(request.getParameter("donationCategory"));
		d.setDonationDetails(request.getParameter("donationDetails"));
		d.setTargetAmount(Double.parseDouble(request.getParameter("targetAmount")));
		
		dao.updateDonation(d);
		
		request.setAttribute("donations", DonationDAO.getAllDonations());
		RequestDispatcher view = request.getRequestDispatcher("LIST DONATION.jsp");
		view.forward(request, response);
	}

}