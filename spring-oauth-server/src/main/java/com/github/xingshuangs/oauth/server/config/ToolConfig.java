package com.github.xingshuangs.oauth.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;

/**
 * @author ShuangPC
 * @date 2019/8/28
 */
@Configuration
public class ToolConfig {

    /**
     * 对称加密方式
     * JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
     * converter.setSigningKey("123");
     * return converter;
     *
     * @return Jwt许可证转换
     */
    @Bean
    public JwtAccessTokenConverter jwtAccessTokenConverter() {
        // 非对称加密方式
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        KeyStoreKeyFactory keyStoreKeyFactory =
                new KeyStoreKeyFactory(new ClassPathResource("mytest.jks"), "mypass".toCharArray());
        converter.setKeyPair(keyStoreKeyFactory.getKeyPair("mytest"));
        return converter;
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
