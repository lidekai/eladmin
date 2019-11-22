package com.ledtech.modules.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ledtech.modules.test.domain.Test;

/***
**测试的数据层
 * @author DK_Li
 *
 */
public interface TestRepository extends JpaRepository<Test, Long>, JpaSpecificationExecutor<Test>{
	List<Test> findAll();
}
