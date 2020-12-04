package cn.ytu.straw.portal.service.impl;

import cn.ytu.straw.portal.model.Permission;
import cn.ytu.straw.portal.mapper.PermissionMapper;
import cn.ytu.straw.portal.service.IPermissionService;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
