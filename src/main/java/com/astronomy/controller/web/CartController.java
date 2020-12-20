package com.astronomy.controller.web;

import static com.astronomy.constant.EConstant.SESSION_CART;
import static com.astronomy.constant.EConstant.SESSION_TOTAL_PRICES;
import static com.astronomy.constant.EConstant.SESSION_TOTAL_QUANTITY;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.astronomy.Service.ICartService;
import com.astronomy.Service.IOrderDetailService;
import com.astronomy.Service.IOrderService;
import com.astronomy.Service.IProductCategoryService;
import com.astronomy.Utils.CartUtils;
import com.astronomy.Utils.NavigateUtils;
import com.astronomy.dto.CartDTO;
import com.astronomy.dto.MyUser;
import com.astronomy.dto.OrderCreateModifyDTO;
import com.astronomy.entity.OrderEntity;
import com.astronomy.entity.ProductCategoryEntity;
import com.astronomy.entity.UserEntity;

@Controller
public class CartController {

	@Autowired
	private ICartService service;
	
	@Autowired
	private IOrderService orderService;
	
	@Autowired
	private IOrderDetailService orderDetailService;

	@Autowired
	HttpServletRequest request;

	@Autowired
	HttpSession session;
	
	@Autowired
	private IProductCategoryService productCategoryService;

	@RequestMapping(value = "addCart/{id}")
	public String addCart(@PathVariable long id) {
		HashMap<Long, CartDTO> cart = service.addCart(id, CartUtils.getOrInitialCart(session));
		this.transformSession(cart);
		return NavigateUtils.toReferer(request);
	}

	@RequestMapping(value = "editCart/{id}/{quanty}")
	public String editCart(@PathVariable long id, @PathVariable int quanty) {
		HashMap<Long, CartDTO> cart = service.editCart(id, quanty, CartUtils.getOrInitialCart(session));
		this.transformSession(cart);
		return NavigateUtils.toReferer(request);
	}

	@RequestMapping(value = "deleteCart/{id}")
	public String deleteCart(@PathVariable long id) {
		HashMap<Long, CartDTO> cart = service.deleteCart(id, CartUtils.getOrInitialCart(session));
		this.transformSession(cart);
		return NavigateUtils.toReferer(request);
	}

	private void transformSession(HashMap<Long, CartDTO> cart) {
		session.setAttribute(SESSION_CART.name(), cart);
		session.setAttribute(SESSION_TOTAL_QUANTITY.name(), CartUtils.calQuantities(cart));
		session.setAttribute(SESSION_TOTAL_PRICES.name(), CartUtils.calPrices(cart));
	}

	@GetMapping(value = "checkout")
	public String checkOut(Model model) {
		List<ProductCategoryEntity> list = productCategoryService.getAll();
		model.addAttribute("productCategorySession", list);
		OrderCreateModifyDTO dto = new OrderCreateModifyDTO();
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal != null) {
			dto.setAddress(((MyUser) principal).getAddress());
			dto.setName(((MyUser) principal).getFullName());
			dto.setEmail(((MyUser) principal).getEmail());
		}
		model.addAttribute("order", dto);
		return "web/checkout";
	}

	@SuppressWarnings("unchecked")
	@PostMapping(value = "checkout")
	public String checkOutBill(@ModelAttribute("order") OrderCreateModifyDTO dto) {
		dto.setQuanty((int)session.getAttribute(SESSION_TOTAL_QUANTITY.name()));
		dto.setTotal((double)session.getAttribute(SESSION_TOTAL_PRICES.name()));
		if(orderService.addOrders(dto) != null) {
			HashMap<Long, CartDTO> cart = (HashMap<Long, CartDTO>)session.getAttribute(SESSION_CART.name());
			orderDetailService.addOrderDetail(cart);
		}
		session.removeAttribute(SESSION_CART.name());
		session.removeAttribute(SESSION_TOTAL_QUANTITY.name());
		session.removeAttribute(SESSION_TOTAL_PRICES.name());
		return "redirect:/shoppingTools";
	}
}
