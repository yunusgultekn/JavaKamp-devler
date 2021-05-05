package Abstract;

import Entities.Member;

public interface MemberService {
	void add(Member member);
	void delete(Member member);
	void update(Member member);
	void login(Member member);
	void logout(Member member);
	void list();

}
