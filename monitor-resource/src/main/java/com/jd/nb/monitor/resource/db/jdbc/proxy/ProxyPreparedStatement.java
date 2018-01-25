

package com.jd.nb.monitor.resource.db.jdbc.proxy;


import java.io.Reader;
import java.sql.*;

/**
 * 代理数据源PreparedStatement抽象类,负责代理jdbc PreparedStatement接口的缺省方法
 * @author <a href=mailto:wangsongpeng@jd.com>王宋鹏</a>
 * @since 2018/1/25
 */
public abstract class ProxyPreparedStatement extends ProxyWrapper implements PreparedStatement {


    
    @Override
    public final ResultSetMetaData getMetaData() throws SQLException {
        throw new SQLFeatureNotSupportedException("getMetaData");
    }
    
    @Override
    public final ParameterMetaData getParameterMetaData() throws SQLException {
        throw new SQLFeatureNotSupportedException("ParameterMetaData");
    }
    
    @Override
    public final void setNString(final int parameterIndex, final String x) throws SQLException {
        throw new SQLFeatureNotSupportedException("setNString");
    }
    
    @Override
    public final void setNClob(final int parameterIndex, final NClob x) throws SQLException {
        throw new SQLFeatureNotSupportedException("setNClob");
    }
    
    @Override
    public final void setNClob(final int parameterIndex, final Reader x) throws SQLException {
        throw new SQLFeatureNotSupportedException("setNClob");
    }
    
    @Override
    public final void setNClob(final int parameterIndex, final Reader x, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("setNClob");
    }
    
    @Override
    public final void setNCharacterStream(final int parameterIndex, final Reader x) throws SQLException {
        throw new SQLFeatureNotSupportedException("setNCharacterStream");
    }
    
    @Override
    public final void setNCharacterStream(final int parameterIndex, final Reader x, final long length) throws SQLException {
        throw new SQLFeatureNotSupportedException("setNCharacterStream");
    }
    
    @Override
    public final void setArray(final int parameterIndex, final Array x) throws SQLException {
        throw new SQLFeatureNotSupportedException("setArray");
    }
    
    @Override
    public final void setRowId(final int parameterIndex, final RowId x) throws SQLException {
        throw new SQLFeatureNotSupportedException("setRowId");
    }
    
    @Override
    public final void setRef(final int parameterIndex, final Ref x) throws SQLException {
        throw new SQLFeatureNotSupportedException("setRef");
    }
    
    @Override
    public final ResultSet executeQuery(final String sql) throws SQLException {
        throw new SQLFeatureNotSupportedException("executeQuery with SQL for PreparedStatement");
    }
    
    @Override
    public final int executeUpdate(final String sql) throws SQLException {
        throw new SQLFeatureNotSupportedException("executeUpdate with SQL for PreparedStatement");
    }
    
    @Override
    public final int executeUpdate(final String sql, final int autoGeneratedKeys) throws SQLException {
        throw new SQLFeatureNotSupportedException("executeUpdate with SQL for PreparedStatement");
    }
    
    @Override
    public final int executeUpdate(final String sql, final int[] columnIndexes) throws SQLException {
        throw new SQLFeatureNotSupportedException("executeUpdate with SQL for PreparedStatement");
    }
    
    @Override
    public final int executeUpdate(final String sql, final String[] columnNames) throws SQLException {
        throw new SQLFeatureNotSupportedException("executeUpdate with SQL for PreparedStatement");
    }
    
    @Override
    public final boolean execute(final String sql) throws SQLException {
        throw new SQLFeatureNotSupportedException("execute with SQL for PreparedStatement");
    }
    
    @Override
    public final boolean execute(final String sql, final int autoGeneratedKeys) throws SQLException {
        throw new SQLFeatureNotSupportedException("execute with SQL for PreparedStatement");
    }
    
    @Override
    public final boolean execute(final String sql, final int[] columnIndexes) throws SQLException {
        throw new SQLFeatureNotSupportedException("execute with SQL for PreparedStatement");
    }
    
    @Override
    public final boolean execute(final String sql, final String[] columnNames) throws SQLException {
        throw new SQLFeatureNotSupportedException("execute with SQL for PreparedStatement");
    }
}
