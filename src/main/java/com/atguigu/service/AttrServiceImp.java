package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.OBJECT_T_MALL_ATTR;
import com.atguigu.bean.T_MALL_VALUE;
import com.atguigu.mapper.AttrMapper;

@Service
public class AttrServiceImp implements AttrServiceInf {

	@Autowired
	AttrMapper attrMapper;

	@Override
	public void save_attr(int flbh2, List<OBJECT_T_MALL_ATTR> list_attr) {
		for (int i = 0; i < list_attr.size(); i++) {

			// 插入属性，返回主键
			OBJECT_T_MALL_ATTR attr = list_attr.get(i);
			attrMapper.insert_attr(flbh2, attr);

			// 获得返回主键批量插入属性值
			attrMapper.insert_values(attr.getId(), attr.getList_value());
		}
	}
	

	@Override
	public List<OBJECT_T_MALL_ATTR> get_attr_list(int flbh2) {
		List<OBJECT_T_MALL_ATTR> list_attr = attrMapper.select_attr_list(flbh2);
		//循环 每个都 赋值上 自己的 value 列表
//		for(OBJECT_T_MALL_ATTR temp : list_attr  ) {
//			temp.setList_value(my_get_values(temp.getId() ) );
//		}
		
		return list_attr;
	}


	@Override
	public List<T_MALL_VALUE> my_get_values(Integer attrId) {
		// TODO Auto-generated method stub
		return attrMapper.my_get_values(attrId);
	}

}
