package com.yao.dozer.config;

import com.github.dozermapper.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * 描述： 配置dozer并注入spring
 *
 * @author pengjie_yao
 * @date 2019/9/3 17:11
 */
@Configuration
public class DozerMapperConfig {


    @Bean
    public DozerBeanMapperFactoryBean dozerMapper(@Value("classpath:*.xml") Resource[] resources) throws IOException {
        DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean = new DozerBeanMapperFactoryBean();
        dozerBeanMapperFactoryBean.setMappingFiles(resources);
        return dozerBeanMapperFactoryBean;
    }
}
