package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 59215_000 on 2016/5/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        long id = 1000L;
        long userPhone = 18720971072L;
        int insertCount = successKilledDao.insertSuccessKilled(1000L,userPhone);
        System.out.println("insertCount="+insertCount);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long id = 1000L;
        long userPhone = 18720971072L;
        SuccessKilled successKilled =  successKilledDao.queryByIdWithSeckill(id,userPhone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
        /**
         * SuccessKilled{
         * seckillId=1000,
         * userPhone=18720971072,
         * state=0,
         * createTime=Fri May 13 01:12:37 CST 2016,
         * seckill=Seckill{
         * seckillid=1000,
         * name='100元秒杀ipad',
         * number=0,
         * startTime=Sun Nov 01 00:00:00 CST 2015,
         * endTime=Mon Nov 02 00:00:00 CST 2015,
         * createTime=Wed May 11 22:29:06 CST 2016
         * }}
         Seckill{
         seckillid=1000,
         name='100元秒杀ipad',
         number=0,
         startTime=Sun Nov 01 00:00:00 CST 2015,
         endTime=Mon Nov 02 00:00:00 CST 2015,
         createTime=Wed May 11 22:29:06 CST 2016}

         */
    }

}