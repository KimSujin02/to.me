package com.to.me;

import java.util.Vector;

public interface Board {
	//일기쓰기
	//일기수정하기
	//일기삭제하기
	//일기 보기
	//일기리스트로 가져오기 vector사용
	public int insertBoard(BoardDTO boardDTO);
	public int updateBoard(BoardDTO boardDTO);
	public int deleteBoard(String boardNum);
	public BoardDTO selectBoard(String boardNum);
	public Vector<BoardDTO> allBoard(String writer);
}
