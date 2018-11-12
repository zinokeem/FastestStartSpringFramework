package org.znkim.trash.dao;

import java.util.ArrayList;

import org.znkim.trash.domain.Sample;

public interface SampleDao {
    public ArrayList<Sample> selectUserData();
}
