package com.mjz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springbooot1ApplicationTests {

    private Logger logger = LoggerFactory.getLogger(Springbooot1ApplicationTests.class);

    @Autowired
    private DataSource dataSource;
    /**
     * 通过logging.level.com.mjz=trace 调整日志级别
     * logging.file=springboot.log 当前项目根目录下生成sprongboot.log
     * logging.pattern.console 在控制台输出的日志格式
     * logging.pattern.file 在文件中输出的日志格式
     * %d{yyyy‐MM‐dd} [%thread] %‐5level %logger{50} ‐ %msg%n
     * %d 日期格式
     * %thread 当前线程
     * %msg 消息
     * %n  换行
     */
    @Test
    public void testLogs() {
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

    @Test
    public void testDataSource() throws SQLException {
        logger.info(dataSource.getClass().toString());
        Connection connection = dataSource.getConnection();
        logger.info(connection.toString());
    }

}
