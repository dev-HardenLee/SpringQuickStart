package com.springbook.biz.board.impl;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class BoardVO {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
	private String searchCondition;
	private String searchKeyword;
	private MultipartFile uploadFile;
	
	public int getSeq() {
		return seq;
	}
	public String getTitle() {
		return title;
	}
	public String getWriter() {
		return writer;
	}
	public String getContent() {
		return content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public int getCnt() {
		return cnt;
	}
	public String getSearchCondition() {
		return searchCondition;
	}
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	@Override
	public String toString() {
		return "BoardDAO [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate=" + regDate + ", cnt=" + cnt + "]";
	}
}
