package com.lxg.config.datasource;

/**
 * @Author:jinboxaing
 * @date:2021/1/7 16:38
 */


import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author zhuxinye
 * @create 2020-01-02 9:02
 * @desc drug数据库配置
 **/
@Configuration
@MapperScan(basePackages = "com.lxg.MD_SUPERVISION.mapper", sqlSessionTemplateRef = "drugSqlSessionTemplate")
public class MPDatasourceConfig {

    @Bean(name = "drugDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.hikari.drug")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "drugSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("drugDataSource") DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        MybatisSqlSessionFactoryBean bean=new MybatisSqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/MD_SUPERVISION/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "drugTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("drugDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "drugSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("drugSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

