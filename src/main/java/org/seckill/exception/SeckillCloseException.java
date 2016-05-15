package org.seckill.exception;

/**
 * 秒杀关闭异常
 * Created by 59215_000 on 2016/5/15.
 */
public class SeckillCloseException extends SeckillException{

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
