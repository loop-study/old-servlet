package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

// 롬복으로 게터,세터 사용
@Getter @Setter
public class HelloData {

    private String username;
    private int age;

    // 롬복이라면 직업 안 만들어도 됨.
//   /* public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }*/
}
