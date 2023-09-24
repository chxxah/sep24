package com.movie.web.detail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailService {
	@Autowired
	private DetailDAO detailDAO;

	public String movie(String mv_name) {
		return detailDAO.movie(mv_name);
	}
}
