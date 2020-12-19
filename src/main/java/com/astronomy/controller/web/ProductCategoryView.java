package com.astronomy.controller.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.astronomy.Service.IProductCategoryService;
import com.astronomy.entity.ProductCategoryEntity;

@Controller
public class ProductCategoryView {

	@Autowired
	IProductCategoryService productCategoryService;
	
}
