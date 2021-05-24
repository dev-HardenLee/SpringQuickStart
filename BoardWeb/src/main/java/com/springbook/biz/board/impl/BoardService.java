package com.springbook.biz.board.impl;

import java.util.List;

public interface BoardService {

	// 글등록
	void insertBoard(BoardVO vo);

	// 수정
	void updateBoard(BoardVO vo);

	// 삭제
	void deleteBoard(BoardVO vo);
	
	// 글 상세 조회
	BoardVO getBoard(BoardVO vo);
	
	// 글 목록 조회
	List<BoardVO> getBoardList(BoardVO vo);

}