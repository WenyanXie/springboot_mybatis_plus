package com.springstudy;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @Description:
 * @Author: XieWenyan
 * @Date: 2022/8/3 10:40
 * @Version：1.0
 */
public class Generator {
    public static void main(String[] args) {
        AutoGenerator autoGenerator = new AutoGenerator();
        // 数据源相关配置
        DataSourceConfig dataSource = new DataSourceConfig();
        dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db1");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        autoGenerator.setDataSource(dataSource);
        // 设置全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir("E:\\idea_java_project\\springboot_mybatis_plus\\src\\main\\java");
        globalConfig.setOpen(false);
        globalConfig.setAuthor("xiewenyan");
        globalConfig.setFileOverride(true);
        globalConfig.setEntityName("%sDO");
        globalConfig.setServiceName("I%sRepository");
        globalConfig.setServiceImplName("%sRepositoryImpl");
        // globalConfig.setMapperName("%sDao");
        globalConfig.setIdType(IdType.ASSIGN_ID);
        globalConfig.setDateType(DateType.ONLY_DATE);// 定义生成的实体类中日期类型
        autoGenerator.setGlobalConfig(globalConfig);
        //包相关配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.springstudy");
        packageConfig.setEntity("domain");
        //packageConfig.setMapper("dao");
        autoGenerator.setPackageInfo(packageConfig);
        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("sys_department", "sys_department_user");

        strategyConfig.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略

        // strategyConfig.setTablePrefix("tb_");
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setEntityLombokModel(true);
        // strategyConfig.setLogicDeleteFieldName("deleted");
        // strategyConfig.setVersionFieldName("version");
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();
        System.out.println("hello");
    }
}
