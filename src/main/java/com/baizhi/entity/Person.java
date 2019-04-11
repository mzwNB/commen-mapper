package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "person")
public class Person {
    @Id
    @KeySql(sql = "select SEQ_PERSON.nextval from dual", order = ORDER.BEFORE)
    private Integer personid;

    private String name;
    private Integer age;
    private String tel;
    private String address;
    @Transient
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

}
