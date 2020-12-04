package cn.ytu.straw.portal.service.impl;

import cn.ytu.straw.portal.model.Tag;
import cn.ytu.straw.portal.mapper.TagMapper;
import cn.ytu.straw.portal.service.ITagService;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
