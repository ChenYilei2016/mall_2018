package com.atguigu.service;

import java.util.List;

import com.atguigu.bean.OBJECT_T_MALL_ATTR;
import com.atguigu.bean.T_MALL_VALUE;

public interface AttrServiceInf {

	void save_attr(int flbh2, List<OBJECT_T_MALL_ATTR> list_attr);

	List<OBJECT_T_MALL_ATTR> get_attr_list(int flbh2);
	
	List<T_MALL_VALUE> my_get_values(Integer attrId);

}
