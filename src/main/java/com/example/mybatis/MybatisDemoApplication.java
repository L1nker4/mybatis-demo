package com.example.mybatis;

import com.example.mybatis.entity.User;
import com.example.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.InputStream;
import java.util.List;

@SpringBootApplication
@Slf4j
@ComponentScan("com.example")
public class MybatisDemoApplication {

    public static void main(String[] args) {
        try (InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml")){
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            try (SqlSession sqlSession = factory.openSession()){
                UserMapper mapper = sqlSession.getMapper(UserMapper.class);
                List<User> all = mapper.getAll();
                System.out.println(all);
            }catch (Exception e){
                log.error("执行失败", e);
            }
        }catch (Exception e){
            log.error("读取失败", e);
        }
    }

}
