package org.znkim.trash.dao.impl;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.znkim.trash.dao.SampleDao;
import org.znkim.trash.domain.Sample;
import org.znkim.trash.mapper.SampleMapper;

@Repository
public class SampleDaoImpl implements SampleDao{
    @Autowired
    private SqlSession sqlSession;

    @Override
    public ArrayList<Sample> selectUserData() {
        SampleMapper sampleMapper = sqlSession.getMapper(SampleMapper.class);
        ArrayList<Sample> result = sampleMapper.selectUserData();
        return result;
    }
}
