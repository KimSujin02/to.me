package com.to.me;

import java.util.Vector;

public interface Boardgroup {
	//일기쓰기
	//일기수정하기
	//일기 삭제하기
	//일기보기
	//해당날짜에 그룹회원들이 쓴 일기 리스트 가져오기
	//해당 아이디가 해당그룹에서 쓴 일기를 vector로 가져오기
	//해당 아이디가 해당 그룹에서 쓴 일기의 개수를 가져오기
	
	public int insertBoard(BoardgroupDTO boardgroupDTO);
	public int updateBoard(BoardgroupDTO boardgroupDTO);
	public int deleteBoard(String boardNum);
	public BoardgroupDTO selectBoard(String boardNum);
	public Vector<BoardgroupDTO> listBoard(String groupNum);
	public int countBoard(String groupNum);
}
