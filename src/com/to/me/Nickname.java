package com.to.me;

import java.util.Vector;

public interface Nickname {
	//해당 그룹번호와 아이디를 가져와서 그 아이디의 닉네임 변경하기
	//해당 그룹번호와 아이디를 가져와서 그룹의 아이디의 닉네임 가져오기
	//해당 그룹번호를 받아와서 그룹에 있는 회원들의 닉네임들을 모두 가져오기
	
	public int updateNick(String groupNum, String id);
	public String selectNick(String groupNum, String id);
	public Vector<NicknameDTO> allNick(String groupNum);
}
