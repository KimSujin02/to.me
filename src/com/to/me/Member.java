package com.to.me;

public interface Member {
	
	//ȸ�������ϱ�
	//�ߺ����̵� �ִ��� Ȯ���ϱ�
	//�α����ϱ�
	//ȸ�������ϱ�
	//ȸ��Ż���ϱ� (ȸ���� �����Ӹ��ƴ϶� �ش� ȸ���� �� �ϱ⵵ �����ؾ� �Ѵ�.)
	//��й�ȣ ã�� (������ ���̵� ���ؼ� �������� �� ������ ���� ���� �޾ƿͼ� ��й�ȣ�� ������ �Ǹ��� �ش�.)
	//��й�ȣ ����
	//ȸ��������������
	
	public int join(MemberDTO memberDTO);
	public int confirmId(String id);
	public int login(String id, String pw);
	public int updateMember(MemberDTO memberDTO);
	public int deleteMember(MemberDTO memberDTO);
	public int confirmPw(String id, String answer);
	public String updatePw(String id, String newPw);
	public MemberDTO selectMember(String id);
}
