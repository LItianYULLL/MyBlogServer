package com.foreknow.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DbHelper {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
	/**
	 * 使用连接池获取连接对象
	 * @return connection
	 * @throws SQLException
	 */
	@SuppressWarnings("unused")
	private static Connection getConncetion() throws SQLException {
		return dataSource.getConnection();
	}
	/**
	 * 获取DataSource对象
	 * @return dataSource
	 */
	public static DataSource getDataSource() {
		return dataSource;
	}
	public static QueryRunner getQueryRunner() {
		QueryRunner queryRunner = new QueryRunner(dataSource);
		return queryRunner;
	}
}
