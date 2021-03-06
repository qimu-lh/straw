package cn.ytu.straw.portal.service.impl;

import cn.ytu.straw.portal.model.Comment;
import cn.ytu.straw.portal.mapper.CommentMapper;
import cn.ytu.straw.portal.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
