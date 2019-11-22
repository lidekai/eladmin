package com.ledtech.modules.test.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ledtech.modules.test.service.TestService;
import com.ledtech.modules.test.service.dto.TestDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.zhengjie.annotation.AnonymousAccess;
import me.zhengjie.aop.log.Log;

/***
**测试的控制层
 * @author DK_Li
 *
 */
@Api(tags = "测试")
@RestController
@RequestMapping("/api/test")
@SuppressWarnings("unused")
public class TestController {
	
	private final TestService testService;
	
	public TestController(TestService testService) {
		this.testService=testService;
	}

	
	@Log("测试")
    @ApiOperation("查询测试")
    @GetMapping(value = "/test")
	@AnonymousAccess
    public void getTest(){
		System.out.println("00000000000");
	}
	
	@SuppressWarnings("rawtypes")
	@Log("测试")
    @ApiOperation("查询测试")
    @GetMapping(value = "/testAll")
	@AnonymousAccess
    public ResponseEntity getTestList(){
		System.out.println("55555555");
		return new ResponseEntity<>(testService.findAll(),HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@Log("测试")
    @ApiOperation("获取前端数据测试")
	@PostMapping(value = "/sendData")
	@AnonymousAccess
    public ResponseEntity sendData(@Validated @RequestBody TestDTO testDTO){
		System.out.println("获取前端传来的数据："+testDTO.getOnePass());
		return new ResponseEntity<>(testService.findAll(),HttpStatus.OK);
	}
}
