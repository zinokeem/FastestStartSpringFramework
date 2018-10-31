package org.znkim.trash.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.znkim.trash.dao.DamnDao;
import org.znkim.trash.domain.Damn;
import org.znkim.trash.service.DamnService;

@Service
public class DamnServiceImpl implements DamnService {
    @Resource
    private DamnDao damndao;

    @Override
    public ArrayList<Damn> selectUserData() {
        ArrayList<Damn> result = damndao.selectUserData();
        return result;
    }
}
