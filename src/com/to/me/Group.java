package com.to.me;

import java.util.Vector;

public interface Group {
	//�׷� �����
	//�׷� Ż���ϱ� (���̺� �˻��ؼ� �� �׷쿡 �� �� �ȳ��� �Ǹ� �׷��� �������.)
	//�׷��̸� �ٲٱ�
	//�ش� ȸ���� ���̵� ������ �׷� �̸� ��������
	//�׷� ���� ��� ��������
	
	public int insertGroup(GroupDTO groupDTO);
	public int deleteGroup(String groupNum);
	public int renameGroup(String groupNum);
	public Vector<GroupDTO> myGroup(String id);
	public GroupDTO selectGroup(String groupNum);
}
