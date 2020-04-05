package com.to.me;

import java.util.Vector;

public interface Group {
	//그룹 만들기
	//그룹 탈퇴하기 (테이블 검사해서 그 그룹에 한 명도 안남게 되면 그룹이 사라진다.)
	//그룹이름 바꾸기
	//해당 회원의 아이디가 가입한 그룹 이름 가져오기
	//그룹 정보 모두 가져오기
	
	public int insertGroup(GroupDTO groupDTO);
	public int deleteGroup(String groupNum);
	public int renameGroup(String groupNum);
	public Vector<GroupDTO> myGroup(String id);
	public GroupDTO selectGroup(String groupNum);
}
