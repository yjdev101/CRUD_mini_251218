📘 CRUD Mini Project (Java Console)
📌 프로젝트 소개

자바 콘솔 환경에서 회원 정보를 관리하는 CRUD 미니 프로젝트입니다.
객체의 책임 분리와 컬렉션 활용을 목표로 설계했으며,
단순 기능 구현을 넘어 Service 계층의 필요성을 경험하는 데 중점을 두었습니다.

🛠 사용 기술

- Java (Console)
- Eclipse IDE
- Git / GitHub
- Java Collection Framework (List, ArrayList)

📂 프로젝트 구조
src
 └─ CRUD_mini
     ├─ Member.java
     ├─ MemberRepository.java
     ├─ MemberService.java
     └─ Main.java

🔍 주요 설계 포인트
1️⃣ 도메인 객체 설계 (Member)

- 필수 값(id, name, email)은 생성자로 강제
- id, name은 생성 이후 변경 불가
- email은 의미 있는 메서드(changeEmail)로만 변경 가능
- setter 남용을 줄여 객체 안정성 고려

2️⃣ Repository 계층

- List<Member> 기반으로 회원 데이터 저장
- 저장(add), 조회(findById), 삭제(delete) 역할만 담당
- 비즈니스 판단 로직은 포함하지 않음

3️⃣ Service 계층 도입

- 회원 등록 시 중복 id 검사
- 이메일 변경, 삭제 등 업무 흐름과 판단 로직 담당
- Main과 Repository 사이의 역할 분리

4️⃣ Main 클래스 역할

- 사용자 입력 및 실행 흐름 담당
- Service만 호출하도록 설계하여 로직 단순화

🧠 배운 점

- 생성자와 setter의 역할 차이를 이해하고, setter를 줄이는 설계의 필요성을 체감함
- Service 계층을 통해 업무 규칙과 저장 로직을 분리하는 경험을 함
- Java API 공식 문서를 활용해 컬렉션 메서드를 탐색하는 습관을 기름
- CRUD 구조를 코드 흐름 관점에서 바라보는 시야를 얻음

🚀 실행 방법

- Eclipse에서 프로젝트 실행
- Main.java 실행
- 콘솔에서 CRUD 흐름 확인

✍️ 향후 개선 아이디어

- 입력 검증 로직 강화
- 예외 처리 추가
- Spring 기반 구조로 확장

📅 작업 기록

- Service 계층 추가 및 Member 도메인 리팩토링 완료
- GitHub 저장소 연동 및 커밋 경험
