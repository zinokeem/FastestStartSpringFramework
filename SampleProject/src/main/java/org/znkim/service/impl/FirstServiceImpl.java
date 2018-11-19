package org.znkim.service.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.znkim.domain.First;
import org.znkim.persistent.FirstMapper;
import org.znkim.service.FirstService;

@Service
@Transactional
public class FirstServiceImpl implements FirstService{
    @Autowired
    FirstMapper mapper;

    public List<First> selectUserData() {
        return mapper.selectUserData();
    }
}
