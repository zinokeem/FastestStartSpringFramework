package org.znkim.trash.dao.impl;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.znkim.trash.dao.DamnDao;
import org.znkim.trash.domain.Damn;
import org.znkim.trash.mapper.DamnMapper;

@Repository
public class DamnDaoImpl implements DamnDao{
    @Autowired
    private SqlSession sqlSession;

    @Override
    public ArrayList<Damn> selectUserData() {
        DamnMapper damnMapper = sqlSession.getMapper(DamnMapper.class);
        ArrayList<Damn> result = damnMapper.selectUserData();
        return result;
    }
}
