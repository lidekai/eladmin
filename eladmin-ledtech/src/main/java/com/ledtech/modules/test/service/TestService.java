package com.ledtech.modules.test.service;

import java.util.List;

import com.ledtech.modules.test.domain.Test;

/***
**测试的服务层的接口
 * @author DK_Li
 *
 */
public interface TestService {
	List<Test> findAll();
}
