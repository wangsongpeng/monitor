package com.jd.home.framework.monitor.db.config;


/**
 * Title : 系统常量
 * Description: 各项监控指标默认值  </br>
 * @author <a href=mailto:wangsongpeng@jd.com>王宋鹏</a>
 * @since 2018/1/26
 */
public class SystemConstans {

    /**
     * 最小的慢SQL超时时间，不能小于这个值，以免报警过于频繁。
     */
    public static final long MIN_SLOW_SQL_TIMEOUT = 100;


    /**
     * 最低允许的活跃连接占比。不能过低，以免导致报警过于频繁。
     */
    public static final float MIN_MAX_ACTIVE_CONNECTION_RATIO = 0.5f;


    /**
     * 最高活跃连接比例
     */
    public static final float MAX_ACTIVE_CONNECTION_RATIO = 1.0f;


    /**
     * 半小时的毫秒数
     */
    public static final long HALF_HOUR_SECOND = 1800000l;


    /**
     * 10分钟的毫秒数
     */
    public static final long FIVE_TEN_SECOND = 300000l;

    /**
     * DB监控线程名称
     */
    public static final String DB_MONITOR_CONNECTION_THREAD_NAME = "DB-Monitor-Conn";

    /**
     * 发送UMP信息线程
     */
    public static final String SEND_UMP_THREAD_NAME = "UMP-Send";

    /**
     * 开关打开值
     */
    public static final String SWITCH_OPEN_VALUE = "true";
    /**
     * 开关关闭值
     */
    public static final String SWITCH_CLOSE_VALUE = "false";

    /**
     * ump消息的最高次数
     */
    public static final int MAX_STORE_UMP_MSG = 20000;
}
