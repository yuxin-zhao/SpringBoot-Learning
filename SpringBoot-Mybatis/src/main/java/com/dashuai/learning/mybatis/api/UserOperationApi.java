package com.dashuai.learning.mybatis.api;

import com.dashuai.learning.mybatis.model.User;
import com.dashuai.learning.mybatis.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User operation api
 * <p/>
 * Created in 2018.11.09
 * <p/>
 * 此例子只是简单的配置mybatis，后面会配置一个双数据源的
 *
 * @author Liaozihong
 */
@RestController
@Api(value = "Mybatis测试接口", tags = "UserOperationApi")
public class UserOperationApi {
    /**
     * The User service.
     */
    @Autowired
    UserService userService;

    /**
     * Gets all.
     *
     * @return the all
     */
    @GetMapping("/getAll")
    public String getAll() {
        return "";
    }
}
