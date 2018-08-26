package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.bean.MODEL_T_MALL_SKU_ATTR_VALUE;
import com.atguigu.bean.T_MALL_PRODUCT;
import com.atguigu.bean.T_MALL_SKU;
import com.atguigu.service.AttrServiceInf;
import com.atguigu.service.SkuServiceInf;

@Controller
public class SkuController {
	
	@Autowired
	private AttrServiceInf attrServiceInf;
	
	@Autowired
	SkuServiceInf skuServiceInf;
//
	@RequestMapping("/save_sku")
	public ModelAndView save_sku(T_MALL_SKU sku, MODEL_T_MALL_SKU_ATTR_VALUE list_attr, T_MALL_PRODUCT spu,
			ModelMap map) {

		skuServiceInf.save_sku(sku, spu, list_attr.getList_attr());

		ModelAndView mv = new ModelAndView("redirect:/goto_sku_add.do");
		mv.addObject("flbh1", spu.getFlbh1());
		mv.addObject("flbh2", spu.getFlbh2());

		return mv;
	}
	
	@RequestMapping("/goto_sku_add.do")
	public String goto_sku_add(Integer flbh1,Integer flbh2,Model model) {
		
		model.addAttribute("list_attr",attrServiceInf.get_attr_list(flbh2));
		model.addAttribute("flbh1",flbh1);
		model.addAttribute("flbh2",flbh2);
		return "skuAdd";
	}
	

	
	
}
