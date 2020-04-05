package com.to.me;

import java.util.Vector;

public interface Board {
	
	//�ϱ⾲��
	//�ϱ�����ϱ�
	//�ϱ� �����ϱ�
	//�ϱ⺸��
	//�ش糯¥�� �׷�ȸ������ �� �ϱ� ����Ʈ ��������
	//�ش� ���̵� �ش�׷쿡�� �� �ϱ⸦ vector�� ��������
	//�ش� ���̵� �ش� �׷쿡�� �� �ϱ��� ������ ��������
	
	public int insertBoard(BoardDTO boardgroupDTO);
	public int updateBoard(BoardDTO boardgroupDTO);
	public int deleteBoard(String boardNum);
	public BoardDTO selectBoard(String boardNum);
	public Vector<BoardDTO> listBoard(String groupNum);
	public int countBoard(String groupNum);
}
