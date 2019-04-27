package com.yj.db.entity;

import java.util.List;

/*
 * 图文消息
 */
public class NewsMessage extends BaseMessage{
	
	private String ArticleCount;
	
	private List<PicNews> Articles;

	public String getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(String articleCount) {
		ArticleCount = articleCount;
	}

	public List<PicNews> getArticles() {
		return Articles;
	}

	public void setArticles(List<PicNews> articles) {
		Articles = articles;
	}
	
}
