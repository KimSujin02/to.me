package com.to.me;

import java.util.Vector;

public interface Board {
	//�ϱ⾲��
	//�ϱ�����ϱ�
	//�ϱ�����ϱ�
	//�ϱ� ����
	//�ϱ⸮��Ʈ�� �������� vector���
	public int insertBoard(BoardDTO boardDTO);
	public int updateBoard(BoardDTO boardDTO);
	public int deleteBoard(String boardNum);
	public BoardDTO selectBoard(String boardNum);
	public Vector<BoardDTO> allBoard(String writer);
}
