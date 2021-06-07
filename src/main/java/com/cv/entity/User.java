package com.cv.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class User implements Serializable {
    /**
     * 如果返回字段值为null，int类型会报错，Integer不会报错。因为int类型声明的是变量，而null是对象所以会报错。Integer是包装类
     * 包装类符合对象的特征并提供了一些必要的属性和方法。
     * int类型的默认值为0，Integer类型的默认值为null。
     * **/
    private Integer id;
    private String username;
    private String avatar;
    private String email;
    private String password;
    private Integer status;
    private String created;
    private String last_login;
}
