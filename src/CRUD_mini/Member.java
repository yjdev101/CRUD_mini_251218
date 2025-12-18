package CRUD_mini;

public class Member {

	private final int id;			//생성 이후 불변
	private final String name;		//생성 이후 불변
	private String email;			//상태 변경 가능
	
	Member(int id, String name, String email) {	//id, name, email을 매개변수로 받겠다. 이게 없으면 돌아가지 않도록 미리 생성자로 고정
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public int getId() { 
		return id;	
	}
	//public void setId(int id) {	this.id = id; } 회원 생성 후 바뀔 수 있는 값이 아님, 외부에서 마음대로 바뀌면 위험함
	
	public String getName() { 
		return name;	
	}
	//public void setName(String name) { this.name = name; } 개명, 닉네임 변경 가능 → 경우에 따라
	
	public String getEmail() {
		return email; 
	}
	//public void setEmail(String email) {this.email = email;	}	//변경 가능하며, 비즈니스적으로 의미 있는 메서드로 변경
	
	//setter를 무분별하게 사용하는 것의 위험성을 이해하고, 의미 있는 메서드로 변경
	public void changeEmail(String newEmail) {
		this.email = newEmail;
	}
	
	@Override
	public String toString( ) {	// → 객체를 출력할 때 자동으로 호출.
		return "Member{id=" + id + 
			   ", name=" + name + 
			   ", email=" + email + "}";
	}
	
}
