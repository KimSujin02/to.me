package com.to.me;

public interface Member {
	
	//회원가입하기
	//중복아이디 있는지 확인하기
	//로그인하기
	//회원수정하기
	//회원탈퇴하기 (회원의 정보뿐만아니라 해당 회원이 쓴 일기도 삭제해야 한다.)
	//비밀번호 찾기 (질문을 아이디를 통해서 가져오고 그 질문에 대한 답을 받아와서 비밀번호를 수정할 권리를 준다.)
	//비밀번호 수정
	//회원정보가져오기
	
	public int join(MemberDTO memberDTO);
	public int confirmId(String id);
	public int login(String id, String pw);
	public int updateMember(MemberDTO memberDTO);
	public int deleteMember(MemberDTO memberDTO);
	public int confirmPw(String id, String answer);
	public String updatePw(String id, String newPw);
	public MemberDTO selectMember(String id);
}
