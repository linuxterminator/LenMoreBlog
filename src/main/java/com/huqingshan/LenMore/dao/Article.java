package com.huqingshan.LenMore.dao;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Article{

	  private String title;
		private String content;
		private String author;
		private LocalDate localDate;

}
