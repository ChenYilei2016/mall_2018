package mall_1018_manage_teacher;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.atguigu.bean.T_MALL_CLASS_1;
import com.atguigu.mapper.T_MALL_CLASS_1_mapper;
import com.google.gson.Gson;

public class TESTT {
	
	@Test
	public void TEST() throws IOException {
		
		//获取sqlSessionFactory
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		//获取session
		SqlSession session = sqlSessionFactory.openSession();
		//获取mapper
		T_MALL_CLASS_1_mapper class_1_mapper = session.getMapper(T_MALL_CLASS_1_mapper.class);
		//操作获取数据
		List<T_MALL_CLASS_1> class1list = class_1_mapper.getList();
		System.out.println(class1list.size());
		//创建gson对象
		Gson gson = new Gson();
		//转json
		String class1str = gson.toJson(class1list);
			  
		//生成静态文件
		Writer out = new FileWriter("H:/class_1.txt");
//		out.write(class1str.getBytes());
//		out.write("a藏212族b".getBytes("utf-8"));
		out.write("a的s萨1达");
		out.close();
	}
}
