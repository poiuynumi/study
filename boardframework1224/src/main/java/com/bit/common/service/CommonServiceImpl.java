package com.bit.common.service;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.util.BoardConstance;
import com.bit.util.PageNavigation;

@Service
public class CommonServiceImpl implements CommonService {
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public PageNavigation makePageNavigation(Map<String, String> param) {
		int pg = Integer.parseInt(param.get("pg"));
		int pageSize = BoardConstance.PAGE_COUNT;
		int listSize = BoardConstance.LIST_COUNT;
		
		PageNavigation navigation = new PageNavigation();
		
		int newArticleCount;
		navigation.setNewArticleCoount(newArticleCount);
		int totalArticleCount = sqlSession;
		navigation.setTotalArticleCoount(totalArticleCount);
		int totalPageCount = (totalArticleCount - 1) / listSize +1;
		navigation.setTotalPageCoount(totalPageCoount);
		navigation.setPageNo(pg);
		navigation.setNowFirst(pg <= pageSize);
		navigation.setNowEnd((totalPageCount -1) / pageSize * pageSize < pg);
		return navigation;
	
	}
}

/*
 
 tA-1
 
 
 tp
 pg
 nf
 ne
 
 pg
 tp/LIST_COUNT 
  
 */

