package CRUD_mini;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

	private List<Member> members = new ArrayList<>();	//List인터페이스와 ArrayList 구현체를 사용해 저장소 역할을 분리
	
	public void add(Member member) {
		members.add(member);
	}
	
	public List<Member> findAll() {
		return members;
	}
	
	public Member findById(int id) {	//조회
		for (Member member : members) {
			if (member.getId() == id) {
				return member;
			}
		}
		return null;
	}
	
	public boolean updateEmail(int id, String newEmail) {	//수정
		Member member = findById(id);
		
		if(member == null) {
			return false;
		}
		
		member.changeEmail(newEmail);
		return true;
	}
	
	public boolean deleteById(int id) {	//삭제
		
		Member member = findById(id);
		
		if (member == null) {
			return false;
		}
		
		members.remove(member);
		return true;
	}
}
