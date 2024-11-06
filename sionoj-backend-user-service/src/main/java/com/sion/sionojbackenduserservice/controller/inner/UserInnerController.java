package com.sion.sionojbackenduserservice.controller.inner;

import com.sion.sionojbackendmodel.model.entity.User;
import com.sion.sionojbackendserviceclient.service.UserFeignClient;
import com.sion.sionojbackenduserservice.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

/**
 * @Author : wick
 * @Date : 2024/11/6 15:25
 * 改服务仅仅内部调用,不给前端
 */
@RestController
@RequestMapping("/inner")
public class UserInnerController implements UserFeignClient {


    @Resource
    private UserService userService;

    /**
     * 根据ID 获得用户
     *
     * @param userId
     * @return {@link User }
     */
    @GetMapping("/get/id")
    @Override
    public User getById(@RequestParam("userId") long userId) {
        return userService.getById(userId);
    }

    /**
     * 根据id 获取用户列表
     *
     * @param idList
     * @return {@link List }<{@link User }>
     */
    @GetMapping("/get/ids")
    @Override
    public List<User> listByIds(@RequestParam("idList") Collection<Long> idList) {
        return userService.listByIds(idList);
    }


}
