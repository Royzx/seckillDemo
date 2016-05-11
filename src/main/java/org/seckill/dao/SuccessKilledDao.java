package org.seckill.dao;

import org.seckill.entity.Seckill;
import org.seckill.entity.SuccessKilled;

/**
 * Created by 59215_000 on 2016/5/11.
 */
public interface SuccessKilledDao {

    /**
     * 插入购买明细，过滤重复记录
     * @param seckillId
     * @param userPhone
     * @return 表示插入行数
     */
    int insertSuccessKilled(long seckillId,long userPhone);

    /**
     * 根据id查询SuccessSeckilled并携带秒杀产品实体
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
