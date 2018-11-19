package org.znkim.persistent;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.znkim.domain.First;

@Repository
public interface FirstMapper {
    public List<First> selectUserData();
}
