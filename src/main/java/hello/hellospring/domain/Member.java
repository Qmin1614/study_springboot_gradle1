package hello.hellospring.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: pkm16
 * Date: 2022-09-20
 * Time: 오전 8:45
 * Comments:
 */

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Column(name = "username")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
