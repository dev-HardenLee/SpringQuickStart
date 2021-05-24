package com.springbook.biz;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.biz.board.impl.BoardService;
import com.springbook.biz.board.impl.BoardVO;

public class BoardServiceClient {
	
	public static void main(String[] args) {
		
		// 1. Spring �����̳ʸ� �����Ѵ�
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring �����̳ʷκ��� BoardServiceImpl ��ü�� Look Up �Ѵ�.
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		// 3. �۵�� �׽�Ʈ
		BoardVO vo = new BoardVO();
		vo.setTitle("�ӽ�����");
		vo.setWriter("ȫ�浿");
		vo.setContent("�ӽó���....!");
		boardService.insertBoard(vo);
		
		// 4. �� ��� �˻� ��� �׽�Ʈ
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for (BoardVO boardVO : boardList) {
			System.out.println("### " + boardVO.toString());
		}
		
		// 5. Spring �����̳� ����
		container.close();
	}
	
}
