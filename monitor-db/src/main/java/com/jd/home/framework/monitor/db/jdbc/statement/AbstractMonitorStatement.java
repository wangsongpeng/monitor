package com.jd.home.framework.monitor.db.jdbc.statement;
import com.jd.home.framework.monitor.db.core.DBMonitor;
import com.jd.home.framework.monitor.db.core.SqlRecord;
import com.jd.home.framework.monitor.db.jdbc.MonitorStatement;
import com.jd.home.framework.monitor.db.jdbc.wrapper.MonitorWrapperImpl;

import java.lang.reflect.Method;
import java.sql.*;

/**
 * Title : 抽象的监控Statement实现
 * Description: 通过目标Statement实现 {@link Statement}方法  </br>
 * @author <a href=mailto:wangsongpeng@jd.com>王宋鹏</a>
 * @since 2018/1/26
 */
public abstract class AbstractMonitorStatement extends MonitorWrapperImpl implements MonitorStatement {

    protected Statement targetStatement;

    protected DBMonitor dbMonitor;


    /**
     * 用来执行 DQL {@link com.jd.home.framework.monitor.db.enums.SQLType#DQL}
     * @param sql
     * @return
     * @throws SQLException
     */
    @Override
    public ResultSet executeQuery(String sql) throws SQLException {
        SqlRecord sqlRecord = null;
        ResultSet resultSet = null;
        try {
            sqlRecord = dbMonitor.SlowSqlMonitorStart(sql);
            resultSet =  targetStatement.executeQuery(sql);
        }catch (Throwable t){
            dbMonitor.SqlErrorMonitor(sqlRecord,t);
            throw t;
        }finally {
            dbMonitor.SlowSqlMonitorEnd(sqlRecord);
        }
        return  resultSet;
    }


    /**
     * 用来执行 DML {@link com.jd.home.framework.monitor.db.enums.SQLType#DML}
     * @param sql
     * @return
     * @throws SQLException
     */
    @Override
    public int executeUpdate(String sql) throws SQLException {
        SqlRecord sqlRecord = null;
        int flag = 0;
        try {
            sqlRecord = dbMonitor.SlowSqlMonitorStart(sql);
            flag =  targetStatement.executeUpdate(sql);
        }catch (Throwable t){
            dbMonitor.SqlErrorMonitor(sqlRecord,t);
            throw t;
        }finally {
            dbMonitor.SlowSqlMonitorEnd(sqlRecord);
        }
        return  flag;
    }

    /**
     * 用来执行 DML {@link com.jd.home.framework.monitor.db.enums.SQLType#DML}
     * @param sql
     * @return
     * @throws SQLException
     */
    @Override
    public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
        SqlRecord sqlRecord = null;
        int flag = 0;
        try {
            sqlRecord = dbMonitor.SlowSqlMonitorStart(sql);
            flag =  targetStatement.executeUpdate(sql,autoGeneratedKeys);
        }catch (Throwable t){
            dbMonitor.SqlErrorMonitor(sqlRecord,t);
            throw t;
        }finally {
            dbMonitor.SlowSqlMonitorEnd(sqlRecord);
        }
        return  flag;
    }


    @Override
    public boolean execute(String sql) throws SQLException {
        SqlRecord sqlRecord = null;
        boolean flag;
        try {
            sqlRecord = dbMonitor.SlowSqlMonitorStart(sql);
            flag =  targetStatement.execute(sql);
        }catch (Throwable t){
            dbMonitor.SqlErrorMonitor(sqlRecord,t);
            throw t;
        }finally {
            dbMonitor.SlowSqlMonitorEnd(sqlRecord);
        }
        return  flag;
    }

    /**
     * 用来执行 DML {@link com.jd.home.framework.monitor.db.enums.SQLType#DML}
     * @param sql
     * @return
     * @throws SQLException
     */
    @Override
    public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
        SqlRecord sqlRecord = null;
        int flag = 0;
        try {
            sqlRecord = dbMonitor.SlowSqlMonitorStart(sql);
            flag =  targetStatement.executeUpdate(sql,columnIndexes);
        }catch (Throwable t){
            dbMonitor.SqlErrorMonitor(sqlRecord,t);
            throw t;
        }finally {
            dbMonitor.SlowSqlMonitorEnd(sqlRecord);
        }
        return  flag;
    }

    /**
     * 用来执行 DML {@link com.jd.home.framework.monitor.db.enums.SQLType#DML}
     * @param sql
     * @return
     * @throws SQLException
     */
    @Override
    public int executeUpdate(String sql, String[] columnNames) throws SQLException {
        SqlRecord sqlRecord = null;
        int flag = 0;
        try {
            sqlRecord = dbMonitor.SlowSqlMonitorStart(sql);
            flag =  targetStatement.executeUpdate(sql,columnNames);
        }catch (Throwable t){
            dbMonitor.SqlErrorMonitor(sqlRecord,t);
            throw t;
        }finally {
            dbMonitor.SlowSqlMonitorEnd(sqlRecord);
        }
        return  flag;
    }


    @Override
    public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
        SqlRecord sqlRecord = null;
        boolean flag;
        try {
            sqlRecord = dbMonitor.SlowSqlMonitorStart(sql);
            flag =  targetStatement.execute(sql,autoGeneratedKeys);
        }catch (Throwable t){
            dbMonitor.SqlErrorMonitor(sqlRecord,t);
            throw t;
        }finally {
            dbMonitor.SlowSqlMonitorEnd(sqlRecord);
        }
        return  flag;
    }

    @Override
    public boolean execute(String sql, int[] columnIndexes) throws SQLException {
        SqlRecord sqlRecord = null;
        boolean flag;
        try {
            sqlRecord = dbMonitor.SlowSqlMonitorStart(sql);
            flag =  targetStatement.execute(sql,columnIndexes);
        }catch (Throwable t){
            dbMonitor.SqlErrorMonitor(sqlRecord,t);
            throw t;
        }finally {
            dbMonitor.SlowSqlMonitorEnd(sqlRecord);
        }
        return  flag;
    }

    @Override
    public boolean execute(String sql, String[] columnNames) throws SQLException {
        SqlRecord sqlRecord = null;
        boolean flag;
        try {
            sqlRecord = dbMonitor.SlowSqlMonitorStart(sql);
            flag =  targetStatement.execute(sql,columnNames);
        }catch (Throwable t){
            dbMonitor.SqlErrorMonitor(sqlRecord,t);
            throw t;
        }finally {
            dbMonitor.SlowSqlMonitorEnd(sqlRecord);
        }
        return  flag;
    }

    @Override
    public void close() throws SQLException {
        targetStatement.close();
    }

    @Override
    public int getMaxFieldSize() throws SQLException {
        return targetStatement.getMaxFieldSize();
    }

    @Override
    public void setMaxFieldSize(int max) throws SQLException {
        targetStatement.setMaxFieldSize(max);
    }

    @Override
    public int getMaxRows() throws SQLException {
        return targetStatement.getMaxRows();
    }

    @Override
    public void setMaxRows(int max) throws SQLException {
        targetStatement.setMaxRows(max);
    }

    @Override
    public void setEscapeProcessing(boolean enable) throws SQLException {
        targetStatement.setEscapeProcessing(enable);
    }

    @Override
    public int getQueryTimeout() throws SQLException {
        return targetStatement.getQueryTimeout();
    }

    @Override
    public void setQueryTimeout(int seconds) throws SQLException {
        targetStatement.setQueryTimeout(seconds);
    }

    @Override
    public void cancel() throws SQLException {
        targetStatement.cancel();
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return targetStatement.getWarnings();
    }

    @Override
    public void clearWarnings() throws SQLException {
        targetStatement.clearWarnings();
    }

    @Override
    public void setCursorName(String name) throws SQLException {
        targetStatement.setCursorName(name);
    }


    @Override
    public ResultSet getResultSet() throws SQLException {
        return targetStatement.getResultSet();
    }

    @Override
    public int getUpdateCount() throws SQLException {
        return targetStatement.getUpdateCount();
    }

    @Override
    public boolean getMoreResults() throws SQLException {
        return targetStatement.getMoreResults();
    }

    @Override
    public void setFetchDirection(int direction) throws SQLException {
        targetStatement.setFetchDirection(direction);
    }

    @Override
    public int getFetchDirection() throws SQLException {
        return targetStatement.getFetchDirection();
    }

    @Override
    public void setFetchSize(int rows) throws SQLException {
        targetStatement.setFetchSize(rows);
    }

    @Override
    public int getFetchSize() throws SQLException {
        return targetStatement.getFetchSize();
    }

    @Override
    public int getResultSetConcurrency() throws SQLException {
        return targetStatement.getResultSetConcurrency();
    }

    @Override
    public int getResultSetType() throws SQLException {
        return targetStatement.getResultSetType();
    }

    @Override
    public void addBatch(String sql) throws SQLException {
        targetStatement.addBatch(sql);
    }

    @Override
    public void clearBatch() throws SQLException {
        targetStatement.clearBatch();
    }

    @Override
    public int[] executeBatch() throws SQLException {
        return targetStatement.executeBatch();
    }

    @Override
    public Connection getConnection() throws SQLException {
        return targetStatement.getConnection();
    }

    @Override
    public boolean getMoreResults(int current) throws SQLException {
        return targetStatement.getMoreResults();
    }

    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        return targetStatement.getGeneratedKeys();
    }


    @Override
    public int getResultSetHoldability() throws SQLException {
        return targetStatement.getResultSetHoldability();
    }

    @Override
    public boolean isClosed() throws SQLException {
        return targetStatement.isClosed();
    }

    @Override
    public void setPoolable(boolean poolable) throws SQLException {
        targetStatement.setPoolable(poolable);
    }

    @Override
    public boolean isPoolable() throws SQLException {
        return targetStatement.isPoolable();
    }

    @Override
    public void closeOnCompletion() throws SQLException {
        targetStatement.closeOnCompletion();
    }

    @Override
    public boolean isCloseOnCompletion() throws SQLException {
        return targetStatement.isCloseOnCompletion();
    }



}