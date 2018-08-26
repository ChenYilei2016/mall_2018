package com.atguigu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.T_MALL_PRODUCT;
import com.atguigu.mapper.SpuMapper;

@Service
public class SpuServiceImp implements SpuServiceInf {

	@Autowired
	SpuMapper spuMapper;

	@Override
	public void save_spu(List<String> list_image, T_MALL_PRODUCT spu) {
		// 插入spu信息,返回生成的主键
		spu.setShp_tp(list_image.get(0));
		spuMapper.insert_spu(spu);

		// 根据spu的主键，批量插入spu图片
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("shp_id", spu.getId());
		map.put("list_image", list_image);
		spuMapper.insert_images(map);
	}

	@Override
	public List<T_MALL_PRODUCT> get_spu_list(Integer pp_id, Integer flbh2) {
		// TODO Auto-generated method stub
		return spuMapper.get_spu_list(pp_id,flbh2);
	}

}
