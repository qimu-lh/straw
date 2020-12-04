package cn.ytu.straw.portal.service.impl;

import cn.ytu.straw.portal.model.User;
import cn.ytu.straw.portal.mapper.UserMapper;
import cn.ytu.straw.portal.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ytu.cn
 * @since 2020-12-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
