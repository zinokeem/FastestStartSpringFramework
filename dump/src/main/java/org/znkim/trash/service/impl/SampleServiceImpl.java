package org.znkim.trash.service.impl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.znkim.trash.dao.SampleDao;
import org.znkim.trash.domain.Sample;
import org.znkim.trash.service.SampleService;

@Service
public class SampleServiceImpl implements SampleService {
    @Resource
    private SampleDao sampledao;

    @Override
    public ArrayList<Sample> selectUserData() {
        ArrayList<Sample> result = sampledao.selectUserData();
        return result;
    }
}
