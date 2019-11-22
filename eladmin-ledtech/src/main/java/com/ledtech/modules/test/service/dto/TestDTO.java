package com.ledtech.modules.test.service.dto;

import java.io.Serializable;
import lombok.Data;
import me.zhengjie.annotation.Query;

/***
**测试的javabean。获取视图层传来的数据
 * @author DK_Li
 *
 */
@Data
public class TestDTO implements Serializable{
	@Query
	private String onePass;
	@Query
	private String twoPass;
}
