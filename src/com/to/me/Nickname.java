package com.to.me;

import java.util.Vector;

public interface Nickname {
	//�ش� �׷��ȣ�� ���̵� �����ͼ� �� ���̵��� �г��� �����ϱ�
	//�ش� �׷��ȣ�� ���̵� �����ͼ� �׷��� ���̵��� �г��� ��������
	//�ش� �׷��ȣ�� �޾ƿͼ� �׷쿡 �ִ� ȸ������ �г��ӵ��� ��� ��������
	
	public int updateNick(String groupNum, String id);
	public String selectNick(String groupNum, String id);
	public Vector<NicknameDTO> allNick(String groupNum);
}
