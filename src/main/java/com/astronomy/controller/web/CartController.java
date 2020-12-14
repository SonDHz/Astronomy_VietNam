package com.astronomy.controller.web;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.astronomy.Service.ICartService;
import com.astronomy.dto.CartDTO;

@Controller
public class CartController {
	
	@Autowired
	private ICartService service;
	
	@RequestMapping(value = "addCart/{id}")
	public String addCart(HttpServletRequest request,HttpSession session, @PathVariable long id) {
		HashMap<Long, CartDTO> cart = (HashMap<Long, CartDTO>) session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDTO>();
		}
		cart = service.addCart(id, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuanty", service.totalQuanty(cart));
		session.setAttribute("TotalPrice", service.totalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
	}
	
	@RequestMapping(value = "editCart/{id}/{quanty}")
	public String editCart(HttpServletRequest request,HttpSession session, @PathVariable long id, @PathVariable int quanty) {
		@SuppressWarnings("unchecked")
		HashMap<Long, CartDTO> cart = (HashMap<Long, CartDTO>) session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDTO>();
		}
		cart = service.editCart(id, quanty, cart);
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuanty", service.totalQuanty(cart));
		session.setAttribute("TotalPrice", service.totalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
	}
	
	@RequestMapping(value = "deleteCart/{id}")
	public String deleteCart(HttpServletRequest request,HttpSession session, @PathVariable long id) {
		@SuppressWarnings("unchecked")
		HashMap<Long, CartDTO> cart = (HashMap<Long, CartDTO>) session.getAttribute("Cart");
		if(cart == null) {
			cart = new HashMap<Long, CartDTO>();
		}
		session.setAttribute("Cart", cart);
		session.setAttribute("TotalQuanty", service.totalQuanty(cart));
		session.setAttribute("TotalPrice", service.totalPrice(cart));
		cart = service.deleteCart(id, cart);
		return "redirect:" + request.getHeader("Referer");
	}
}
