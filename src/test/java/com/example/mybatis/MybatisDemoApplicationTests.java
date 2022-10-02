package com.example.mybatis;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.mockito.internal.util.io.IOUtil;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testClassLoader() throws IOException {
        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("mybatis-config.xml");
        System.out.println(IOUtils.toString(stream));
    }

    @Test
    public <T> void test01() {
        List<T> list = new ArrayList<>();
    }

}
