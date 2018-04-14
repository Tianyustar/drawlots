package com.jit.drawlots.service.impl;

import com.jit.drawlots.entity.Student;
import com.jit.drawlots.mapper.StudentMapper;
import com.jit.drawlots.service.IStudentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author libre
 * @since 2018-04-14
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
