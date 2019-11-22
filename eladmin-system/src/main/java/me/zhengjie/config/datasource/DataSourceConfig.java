package me.zhengjie.config.datasource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/***
 ** 配置多数据源
 * @author DK_Li
 *
 */
@Configuration
public class DataSourceConfig {
	    
	    @Bean(name = "primaryDataSource")
	    @Qualifier("primaryDataSource")
	    @Primary
	    @ConfigurationProperties(prefix = "spring.datasource.primary")
	    public DataSource masterDataSource() {
	        return DataSourceBuilder.create().build();
	    }

	    @Bean(name = "secondaryDataSource")
	    @Qualifier("secondaryDataSource")
	    @ConfigurationProperties(prefix="spring.datasource.secondary")
	    public DataSource secondaryDataSource() {
	        return DataSourceBuilder.create().build();
	    }
}