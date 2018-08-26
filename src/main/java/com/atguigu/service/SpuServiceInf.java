package com.atguigu.service;

import java.util.List;

import com.atguigu.bean.T_MALL_PRODUCT;

public interface SpuServiceInf {

	public void save_spu(List<String> list_image, T_MALL_PRODUCT spu);

	public List<T_MALL_PRODUCT> get_spu_list(Integer pp_id, Integer flbh2);

}
