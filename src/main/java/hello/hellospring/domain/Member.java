package hello.hellospring.domain;

/**
 * Created with IntelliJ IDEA.
 * User: pkm16
 * Date: 2022-09-20
 * Time: 오전 8:45
 * Comments:
 */
public class Member {

    private Long id;
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
