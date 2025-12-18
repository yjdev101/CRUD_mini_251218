package CRUD_mini;

public class MemberService {
	
	private final MemberRepository repository;
	
	public MemberService(MemberRepository repository) {
		this.repository = repository;
	}
	
	
	public boolean register(int id, String name, String email) {
		if (repository.findById(id) != null) {
			return false;
		}
		Member member = new Member(id, name, email);
		repository.add(member);
		return true;
	}
	
	public Member findMember(int id) {
		return repository.findById(id);
	}
	
	public boolean changeEmail(int id, String newEmail) {
		return repository.updateEmail(id, newEmail);
	}
	
	public boolean removeMember(int id) {
		return repository.deleteById(id);
	}
}
