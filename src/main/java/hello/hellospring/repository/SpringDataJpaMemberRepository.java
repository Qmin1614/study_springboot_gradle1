package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * User: pkm16
 * Date: 2022-09-21
 * Time: 오전 11:13
 * Comments:
 */


public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
}
