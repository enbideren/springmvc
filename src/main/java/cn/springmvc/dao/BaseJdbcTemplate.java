package cn.springmvc.dao;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
/**
 * 
 * @author JZR
 * @version 1.0
 * @created 2015-08-12
 */
public class BaseJdbcTemplate extends JdbcTemplate {
	@Resource(name="dataSource")
	public void setDataSource(DataSource dataSource){
		super.setDataSource(dataSource);
	}
}
