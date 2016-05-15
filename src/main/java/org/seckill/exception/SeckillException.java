package org.seckill.exception;

/**
 * 秒杀相关异常
 * Created by 59215_000 on 2016/5/15.
 */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
