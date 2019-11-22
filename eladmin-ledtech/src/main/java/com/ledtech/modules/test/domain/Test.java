package com.ledtech.modules.test.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/***
**测试的实体类。将数据库获取的数据显示到视图层
 * @author DK_Li
 *
 */
@Entity
@Getter
@Setter
@Table(name="TEST",schema = "SSM")
public class Test implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull(groups = Update.class)
    private String test01;
	
	@NotBlank
    @Column(unique = true)
    private String test02;
	
	public @interface Update {}
}
