package com.jd.home.framework.monitor.db.jdbc.ds;
import org.apache.commons.dbcp.BasicDataSource;

/**
 * Title : 监控DBCP数据源实现
 * Description: 实现真正的监控功能 </br>
 * @author <a href=mailto:wangsongpeng@jd.com>王宋鹏</a>
 * @since 2018/1/26
 */
public class MonitorDbcpDataSource extends AbstractMonitorDataSource {


    private BasicDataSource basicDataSource;

    /**
     * 获取连接数
     * @return
     */
    @Override
    public int getActiveConnections() {
        return basicDataSource.getMaxActive();
    }


    @Override
    protected void refRealDataSource() {
        if(!(this.targetDataSource instanceof BasicDataSource)){
            throw new IllegalArgumentException("Only Support BasicDataSource");
        }
        basicDataSource = (BasicDataSource)this.targetDataSource;
    }
}
