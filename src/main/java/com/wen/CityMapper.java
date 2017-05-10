package com.wen;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
@Component
public interface CityMapper {
	@Select("select name from city where id = #{id}")
	public String queryByid(@Param("id") String id);
} 