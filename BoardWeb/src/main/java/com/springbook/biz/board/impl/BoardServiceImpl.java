package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.common.Log4jAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
//	@Autowired
//	private BoardDAO boardDAO;
//	@Autowired
//	private BoardDAO boardDAO;
	
	@Autowired
	private BoardDAOMybatis boardDAO;
	
	@Override
	public void insertBoard(BoardVO vo) {
//		if(vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다");
//		}
		boardDAO.insertBoard(vo);
		//boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
		
	}
	
	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}
	
	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}
	
	
	
}
