package cn.pzhu.staff.config.seceurity;

import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


  @Override
  public void configure(WebSecurity web) throws Exception {
    System.out.println("============================================");
    web.ignoring()
        .antMatchers( "/**");
  }


}
