package com.to.me;

public interface Comment {
	
	//�ϱ��� ��ȣ�� �����ͼ� �� �ϱ⿡ ��� �ޱ�
	//�ϱ��� ��ȣ�� �޾ƿͼ� �� �ϱ⿡ ��� ��������
	//�ϱ��ȣ�� �ش�Ǵ� ��� ��
	//��� �����ϱ�
	
	public int insertComment(String boardNum);
	public CommentDTO selectComment(String boardNum);
	public int countComment(String boardNum);
	public int deleteComment(String commentNum);
}
