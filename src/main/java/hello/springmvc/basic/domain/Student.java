package hello.springmvc.basic.domain;

import lombok.Data;

@Data
public class Student {

    private Integer userNum;
    private String id;
    private String name;
    private String addr;
    private String tel;

}
