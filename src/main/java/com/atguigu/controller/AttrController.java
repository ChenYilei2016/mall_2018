package com.atguigu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.atguigu.bean.MODEL_T_MALL_ATTR;
import com.atguigu.bean.OBJECT_T_MALL_ATTR;
import com.atguigu.bean.T_MALL_ATTR;
import com.atguigu.service.AttrServiceInf;

@Controller
public class AttrController {

	@Autowired
	AttrServiceInf attrServiceInf;

	@RequestMapping("goto_attr_add")
	public String goto_attr_add(int flbh2, ModelMap map) {
		map.put("flbh2", flbh2);
		return "attrAdd";
	}
	
	@RequestMapping("attr_add")
	public ModelAndView attr_add(Integer flbh2,MODEL_T_MALL_ATTR list_attr ) {
		
		//保存属性
		attrServiceInf.save_attr(flbh2, list_attr.getList_attr());
		
		ModelAndView mv = new ModelAndView("redirect:/goto_attr_add.do");
		mv.addObject("flbh2",flbh2);
		
		return mv;
	}
	
	@RequestMapping("get_attr_list")
	public String get_attr_list(Integer flbh2,Model model){
		
		List<OBJECT_T_MALL_ATTR> list = attrServiceInf.get_attr_list(flbh2);
		model.addAttribute("list_attr",list);
		model.addAttribute("flbh2",flbh2);
		
		return "attrListInner";
	}

}
