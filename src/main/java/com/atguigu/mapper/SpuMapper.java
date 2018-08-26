package com.atguigu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.atguigu.bean.T_MALL_PRODUCT;

public interface SpuMapper {

	void insert_spu(T_MALL_PRODUCT spu);

	void insert_images(Map<Object, Object> map);

	List<T_MALL_PRODUCT> get_spu_list(@Param("pp_id")Integer pp_id,@Param("flbh2") Integer flbh2);

}
