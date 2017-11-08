package top.shic.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Administrator on 2017/11/5.
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(length = 20,nullable = false)
    private String name;

    @Column(length = 20,nullable = false)
    private String password;

    public Student() {
    }

    public Student(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
