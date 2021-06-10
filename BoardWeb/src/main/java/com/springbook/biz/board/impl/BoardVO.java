package com.springbook.biz.board.impl;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name="BOARD")
public class BoardVO {
	//@XmlAttribute
	@Id
	@GeneratedValue
	private int seq;
	private String title;
	private String writer;
	private String content;
	@Temporal(TemporalType.DATE)
	private Date regDate;
	private int cnt;
	//@XmlTransient
	@Transient
	private String searchCondition;
	//@XmlTransient
	@Transient
	private String searchKeyword;
	//@XmlTransient
	@Transient
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
	//@JsonIgnore
	public String getSearchCondition() {
		return searchCondition;
	}
	//@JsonIgnore
	public String getSearchKeyword() {
		return searchKeyword;
	}
	//@JsonIgnore
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
