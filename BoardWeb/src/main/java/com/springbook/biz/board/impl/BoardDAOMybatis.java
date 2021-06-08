package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOMybatis{
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
//	@Autowired
//	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
//		super.setSqlSessionFactory(sqlSessionFactory);
//	}
//	
//	// 글 등록
//	public void insertBoard(BoardVO vo) {
//		getSqlSession().insert("BoardDAO.insertBoard", vo);
//	}
//	
//	// 글 수정
//	public void updateBoard(BoardVO vo) {
//		getSqlSession().insert("BoardDAO.updateBoard", vo);
//	}
//	
//	// 글 삭제
//	public void deleteBoard(BoardVO vo) {
//		getSqlSession().insert("BoardDAO.deleteBoard", vo);
//	}
//	
//	// 글 상세 조회
//	public BoardVO getBoard(BoardVO vo) {
//		return (BoardVO) getSqlSession().selectOne("BoardDAO.getBoard", vo);
//	}
//	
//	// 글 목록 조회
//	public List<BoardVO> getBoardList(BoardVO vo){
//		return getSqlSession().selectList("BoardDAO.getBoardList", vo);
//	}
	
	// 글 등록
	public void insertBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.insertBoard", vo);
	}
	
	// 글 수정
	public void updateBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.updateBoard", vo);
	}
	
	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		mybatis.insert("BoardDAO.deleteBoard", vo);
	}
	
	// 글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
}
