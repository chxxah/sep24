package com.movie.web.detail;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DetailDAO {

	String movie(String mv_name);

}
