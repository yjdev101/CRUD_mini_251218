package CRUD_mini;

public class Main {

	public static void main(String[] args) {
		
		MemberRepository repo = new MemberRepository();
		MemberService service = new MemberService(repo);
		
		service.register(1, "홍길동", "a@a.com");
		service.register(2, "김철수", "b@b.com");
		
		System.out.println(service.findMember(1));
		
		service.changeEmail(2, "service@new.com");
		System.out.println(service.findMember(2));
		
		service.removeMember(1);
		System.out.println(repo.findAll());
		
	}
	
}
