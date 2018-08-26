package com.atguigu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.atguigu.bean.T_MALL_PRODUCT;
import com.atguigu.mapper.SpuMapper;
import com.atguigu.service.SpuServiceInf;
import com.atguigu.util.MyFileUpload;
import com.sun.mail.auth.MD4;

@Controller
public class SpuController {
	@Autowired
	private SpuServiceInf spuServiceInf;
	
	@RequestMapping("/goto_spu_add")
	public String goto_spu_add(Model model , T_MALL_PRODUCT spu) {
		model.addAttribute("spu",spu);
		return "spuAdd";
	}
	

	@RequestMapping("/spu_add")
	public ModelAndView spu_add(T_MALL_PRODUCT spu,@RequestParam("files") MultipartFile[] files) {
		
		//上传图片
		
		List<String> list_name = MyFileUpload.upload_image(files);
		
		//保存商品信息
		spuServiceInf.save_spu(list_name ,spu);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/goto_spu_add.do");
		modelAndView.addObject("flbh1", spu.getFlbh1());
		modelAndView.addObject("flbh2", spu.getFlbh2());
		modelAndView.addObject("pp_id", spu.getPp_id());
		modelAndView.addObject("1","1234");
		
		return  modelAndView;
	}
	
	@RequestMapping("/get_spu_list")
	@ResponseBody
	public List<T_MALL_PRODUCT> get_spu_list(Integer pp_id,Integer flbh2) {
		return spuServiceInf.get_spu_list(pp_id,flbh2);
	}
	
}
