package com.mjz.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.UserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 〈一句话功能简述〉<br>
 * 〈${DESCRIPTION}〉
 *
 * @author zhaob
 * @create 2018/6/30
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //配置http请求
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/emp/**").hasRole("USER")
                .and()
                .formLogin()
                .successForwardUrl("/emp/queryEmps");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        InMemoryUserDetailsManagerConfigurer configurer = auth.inMemoryAuthentication();
        UserDetailsManagerConfigurer.UserDetailsBuilder userDetailsBuilder = configurer.withUser("admin");
        userDetailsBuilder = userDetailsBuilder.password("admin");
        userDetailsBuilder.roles("USER");
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new PlaintextPasswordEncoder();
    }

    private static class PlaintextPasswordEncoder implements PasswordEncoder{

        @Override
        public String encode(CharSequence rawPassword) {
            return String.valueOf(rawPassword);
        }

        @Override
        public boolean matches(CharSequence rawPassword, String encodedPassword) {
            return String.valueOf(rawPassword).equals(encodedPassword);
        }
    }

}
