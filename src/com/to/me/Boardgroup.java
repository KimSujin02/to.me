package com.to.me;

import java.util.Vector;

public interface Boardgroup {
	//�ϱ⾲��
	//�ϱ�����ϱ�
	//�ϱ� �����ϱ�
	//�ϱ⺸��
	//�ش糯¥�� �׷�ȸ������ �� �ϱ� ����Ʈ ��������
	//�ش� ���̵� �ش�׷쿡�� �� �ϱ⸦ vector�� ��������
	//�ش� ���̵� �ش� �׷쿡�� �� �ϱ��� ������ ��������
	
	public int insertBoard(BoardgroupDTO boardgroupDTO);
	public int updateBoard(BoardgroupDTO boardgroupDTO);
	public int deleteBoard(String boardNum);
	public BoardgroupDTO selectBoard(String boardNum);
	public Vector<BoardgroupDTO> listBoard(String groupNum);
	public int countBoard(String groupNum);
}
