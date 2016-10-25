package com.oracle.util.pools;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

import com.oracle.util.ConfigManager;
import javax.persistence.Entity;

@Entity
public class PoolConnection implements Connection{
	private static Connection connection;
	private boolean state = false;
	{
		try {
			//创建驱动
			Class.forName(ConfigManager.DRIVERNAME);
			//创建连接
			connection = DriverManager.getConnection(ConfigManager.URL,ConfigManager.USERNAME,ConfigManager.PASSWORD);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection(){
		return connection;
	}
	public boolean isState(){
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	} 
     
	//-----------------代理模式-----------------------------

	public void clearWarnings() throws SQLException {
		// TODO Auto-generated method stub
		connection.clearWarnings();
	}
	
	public void close() throws SQLException {
		// TODO Auto-generated method stub
		this.state=false;
	}
	
	public void commit() throws SQLException {
		// TODO Auto-generated method stub
		connection.commit();
	}
	
	public Array createArrayOf(String typeName, Object[] elements)
			throws SQLException {
		// TODO Auto-generated method stub
		return connection.createArrayOf(typeName, elements);
	}
	
	public Blob createBlob() throws SQLException {
		// TODO Auto-generated method stub
		return connection.createBlob();
	}
	
	public Clob createClob() throws SQLException {
		// TODO Auto-generated method stub
		return connection.createClob();
	}
	
	public NClob createNClob() throws SQLException {
		// TODO Auto-generated method stub
		return connection.createNClob();
	}
	
	public SQLXML createSQLXML() throws SQLException {
		// TODO Auto-generated method stub
		return connection.createSQLXML();
	}
	
	public Statement createStatement() throws SQLException {
		// TODO Auto-generated method stub
		return connection.createStatement();
	}
	
	public Statement createStatement(int resultSetType, int resultSetConcurrency)
			throws SQLException {
		// TODO Auto-generated method stub
		return connection.createStatement(resultSetType, resultSetConcurrency);
	}
	
	public Statement createStatement(int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		// TODO Auto-generated method stub
		return connection.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
	}
	
	public Struct createStruct(String typeName, Object[] attributes)
			throws SQLException {
		// TODO Auto-generated method stub
		return connection.createStruct(typeName, attributes);
	}
	
	public boolean getAutoCommit() throws SQLException {
		// TODO Auto-generated method stub
		return connection.getAutoCommit();
	}
	
	public String getCatalog() throws SQLException {
		// TODO Auto-generated method stub
		return connection.getCatalog();
	}
	
	public Properties getClientInfo() throws SQLException {
		// TODO Auto-generated method stub
		return connection.getClientInfo();
	}
	
	public String getClientInfo(String name) throws SQLException {
		// TODO Auto-generated method stub
		return connection.getClientInfo(name);
	}
	
	public int getHoldability() throws SQLException {
		// TODO Auto-generated method stub
		return connection.getHoldability();
	}
	
	public DatabaseMetaData getMetaData() throws SQLException {
		// TODO Auto-generated method stub
		return connection.getMetaData();
	}
	
	public int getTransactionIsolation() throws SQLException {
		// TODO Auto-generated method stub
		return connection.getTransactionIsolation();
	}
	
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		// TODO Auto-generated method stub
		return connection.getTypeMap();
	}
	
	public SQLWarning getWarnings() throws SQLException {
		// TODO Auto-generated method stub
		return connection.getWarnings();
	}
	
	public boolean isClosed() throws SQLException {
		// TODO Auto-generated method stub
		return connection.isClosed();
	}
	
	public boolean isReadOnly() throws SQLException {
		// TODO Auto-generated method stub
		return connection.isReadOnly();
	}
	
	public boolean isValid(int timeout) throws SQLException {
		// TODO Auto-generated method stub
		return connection.isValid(timeout);
	}
	
	public String nativeSQL(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return connection.nativeSQL(sql);
	}
	
	public CallableStatement prepareCall(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return connection.prepareCall(sql);
	}
	
	public CallableStatement prepareCall(String sql, int resultSetType,
			int resultSetConcurrency) throws SQLException {
		// TODO Auto-generated method stub
		return connection.prepareCall(sql, resultSetType, resultSetConcurrency);
	}
	
	public CallableStatement prepareCall(String sql, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		// TODO Auto-generated method stub
		return connection.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}
	
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		// TODO Auto-generated method stub
		return connection.prepareStatement(sql);
	}
	
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
			throws SQLException {
		// TODO Auto-generated method stub
		return connection.prepareStatement(sql, autoGeneratedKeys);
	}
	
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
			throws SQLException {
		// TODO Auto-generated method stub
		return connection.prepareStatement(sql, columnIndexes);
	}
	
	public PreparedStatement prepareStatement(String sql, String[] columnNames)
			throws SQLException {
		// TODO Auto-generated method stub
		return connection.prepareStatement(sql, columnNames);
	}
	
	public PreparedStatement prepareStatement(String sql, int resultSetType,
			int resultSetConcurrency) throws SQLException {
		// TODO Auto-generated method stub
		return connection.prepareStatement(sql, resultSetType, resultSetConcurrency);
	}
	
	public PreparedStatement prepareStatement(String sql, int resultSetType,
			int resultSetConcurrency, int resultSetHoldability)
			throws SQLException {
		// TODO Auto-generated method stub
		return connection.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
	}
	
	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		// TODO Auto-generated method stub
		connection.releaseSavepoint(savepoint);
	}
	
	public void rollback() throws SQLException {
		// TODO Auto-generated method stub
		connection.rollback();
	}
	
	public void rollback(Savepoint savepoint) throws SQLException {
		// TODO Auto-generated method stub
		connection.rollback(savepoint);
	}
	
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		// TODO Auto-generated method stub
		connection.setAutoCommit(autoCommit);
	}
	
	public void setCatalog(String catalog) throws SQLException {
		// TODO Auto-generated method stub
		connection.setCatalog(catalog);
	}
	
	public void setClientInfo(Properties properties)
			throws SQLClientInfoException {
		// TODO Auto-generated method stub
		connection.setClientInfo(properties);
	}
	
	public void setClientInfo(String name, String value)
			throws SQLClientInfoException {
		// TODO Auto-generated method stub
		connection.setClientInfo(name, value);
	}
	
	public void setHoldability(int holdability) throws SQLException {
		// TODO Auto-generated method stub
		connection.setHoldability(holdability);
	}
	
	public void setReadOnly(boolean readOnly) throws SQLException {
		// TODO Auto-generated method stub
		connection.setReadOnly(readOnly);
	}
	
	public Savepoint setSavepoint() throws SQLException {
		// TODO Auto-generated method stub
		return connection.setSavepoint();
	}
	
	public Savepoint setSavepoint(String name) throws SQLException {
		// TODO Auto-generated method stub
		return connection.setSavepoint(name);
	}
	
	public void setTransactionIsolation(int level) throws SQLException {
		// TODO Auto-generated method stub
		connection.setTransactionIsolation(level);
	}
	
	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		// TODO Auto-generated method stub
		connection.setTypeMap(map);
	}
	
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		// TODO Auto-generated method stub
		return connection.isWrapperFor(iface);
	}
	
	public <T> T unwrap(Class<T> iface) throws SQLException {
		// TODO Auto-generated method stub
		return connection.unwrap(iface);
	}




}
