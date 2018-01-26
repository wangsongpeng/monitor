package com.jd.home.framework.monitor.db.jdbc.deprecated.statement;
import com.jd.home.framework.monitor.db.jdbc.deprecated.proxy.ProxyPreparedStatement;

import java.sql.PreparedStatement;

/**
 * 抽象的PreparedStatement
 * @author <a href=mailto:wangsongpeng@jd.com>王宋鹏</a>
 * @since 2018/01/25
 */
public abstract class AbstractPreparedStatement extends ProxyPreparedStatement {

    protected PreparedStatement targetPreparedStatement;

    public PreparedStatement getTargetPreparedStatement() {
        return targetPreparedStatement;
    }

    public void setTargetPreparedStatement(PreparedStatement targetPreparedStatement) {
        this.targetPreparedStatement = targetPreparedStatement;
    }
}