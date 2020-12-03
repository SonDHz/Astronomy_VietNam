package com.astronomy.controller.admin;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.astronomy.Service.IOrderService;
import com.astronomy.dto.OrderCreateModifyDTO;
import com.astronomy.entity.OrderEntity;
import com.astronomy.mapper.OrderMapper;

@RequestMapping(value = "admin")
@Controller
public class OrderController {	
	@Autowired
	IOrderService orderService;

	@Autowired
	OrderMapper orderMapper;

	@GetMapping("orderView")
	public String orderView(Model model) {
		List<OrderEntity> list = orderService.getAll();
		model.addAttribute("entity", list);
		return "admin/order_manager";
	}

	@GetMapping("createModify/order")
	public String action(Model model, @RequestParam(value = "id", required = false) Long id) {
		OrderCreateModifyDTO dto = new OrderCreateModifyDTO();
		if (id != null) {
			dto = orderService.findByIdDTO(id);
		}
		model.addAttribute("model", dto);
		return "admin/action/actionOrder";
	}
}
