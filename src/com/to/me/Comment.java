package com.to.me;

public interface Comment {
	
	//일기의 번호를 가져와서 그 일기에 댓글 달기
	//일기의 번호를 받아와서 그 일기에 댓글 가져오기
	//일기번호에 해당되는 댓글 수
	//댓글 삭제하기
	
	public int insertComment(String boardNum);
	public CommentDTO selectComment(String boardNum);
	public int countComment(String boardNum);
	public int deleteComment(String commentNum);
}
