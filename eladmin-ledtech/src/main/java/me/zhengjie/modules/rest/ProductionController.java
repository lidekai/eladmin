package me.zhengjie.modules.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.zhengjie.annotation.AnonymousAccess;
import me.zhengjie.aop.log.Log;

/**
 * @author DK_Li
 * @date 2019-11-04
 */
@Api(tags = "业务模块：生产进度")
@RestController
@RequestMapping("/api/production")
public class ProductionController {
	
	@Log("查询生产进度")
    @ApiOperation("查询生产进度")
    @GetMapping(value = "/downloadProduction")
	//@PreAuthorize("@el.check('production:list')")
	@AnonymousAccess
    public void getProductionList(){
		System.out.println("111111111111111111111111111");
	}
}
