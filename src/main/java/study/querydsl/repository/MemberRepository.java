package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.querydsl.entity.Member;

import java.util.List;
                                                                       //search 메소드 호출 가능
public interface MemberRepository extends JpaRepository<Member,Long> , MemberRepositoryCustom {

    List<Member> findByUsername(String username);
}
