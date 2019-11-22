package com.ledtech.modules.test.service.impl;

import java.util.List;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ledtech.modules.test.domain.Test;
import com.ledtech.modules.test.repository.TestRepository;
import com.ledtech.modules.test.service.TestService;

/***
**测试的服务层的实现类
 * @author DK_Li
 *
 */
@Service
@CacheConfig(cacheNames = "test")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class TestServiceImpl implements TestService{
	
	private final TestRepository testRepository;
	
	public TestServiceImpl(TestRepository testRepository) {
		this.testRepository=testRepository;
	}

	@Override
	public List<Test> findAll() {
		return testRepository.findAll();
	}

}
