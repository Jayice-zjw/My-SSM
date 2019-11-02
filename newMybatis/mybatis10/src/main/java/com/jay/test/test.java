package com.jay.test;

import com.jay.bean.Team;
import com.jay.dao.TeamDao;
import com.jay.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class test {
    public static void main(String[] args){
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        TeamDao teamDao=sqlSession.getMapper(TeamDao.class);
        Team ans=teamDao.selectTeamById(1);
        System.out.println(ans);
    }
}
