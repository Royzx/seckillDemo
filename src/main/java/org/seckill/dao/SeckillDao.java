package org.seckill.dao;

import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by 59215_000 on 2016/5/11.
 */
public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(long seckillId, Date killTime);

    /**
     * 根据id查询秒杀商品
     * @param seckillId
     * @return 如果影响行数为>1，表示更新记录行数
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offet,int limit);
}
