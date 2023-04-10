package com.example.springboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    @Bean(name = "FirstBean")
    @ConditionalOnProperty(prefix = "profile", name = "value", havingValue = "test")
    public BeanDto makeFirstBean() {
        var beanDto = new BeanDto();
        beanDto.setName("firstSituation");
        //System.out.println("Первый бин создан."); для проверки
        return beanDto;
    }

    @Bean(name = "SecondBean")
    @ConditionalOnBean(BeanDto.class)
    public BeanDto makeSecondBean() {
        var beanDto = new BeanDto();
        beanDto.setName("secondSituation");
        //System.out.println("Второй бин создан."); для проверки
        return beanDto;
    }

    @Bean(name = "ThirdBean")
    @ConditionalOnProperty(name = "environment_variable", havingValue = "default")
    public BeanDto makeThirdBean() {
        var beanDto = new BeanDto();
        beanDto.setName("thirdSituation");
        //System.out.println("Третий бин создан."); для проверки
        return beanDto;
    }
}
