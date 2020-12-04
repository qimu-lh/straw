package cn.ytu.straw.portal.service.impl;

import cn.ytu.straw.portal.model.Question;
import cn.ytu.straw.portal.mapper.QuestionMapper;
import cn.ytu.straw.portal.service.IQuestionService;
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
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements IQuestionService {

}
