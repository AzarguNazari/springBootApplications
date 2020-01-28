//package com.example.sba;
//
//import de.codecentric.boot.admin.server.config.AdminServerProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SpringAdminSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private final String adminContextPath;
//
//    public SpringAdminSecurityConfig(AdminServerProperties adminServerProperties) {
//        this.adminContextPath = adminServerProperties.getContextPath();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // @formatter:off
//        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
//        successHandler.setTargetUrlParameter("redirectTo");
//        successHandler.setDefaultTargetUrl(adminContextPath + "/");
//
//        http.authorizeRequests()
//            .antMatchers(adminContextPath + "/assets/**").permitAll()
//            .antMatchers(adminContextPath + "/login").permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .formLogin().loginPage(adminContextPath + "/login").successHandler(successHandler).and()
//            .logout().logoutUrl(adminContextPath + "/logout").and()
//            .httpBasic().and()
//            .csrf()
//            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//            .ignoringAntMatchers(
//                    adminContextPath + "/instances",
//                    adminContextPath + "/actuator/**"
//            );
//        // @formatter:on
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService(){
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("user").password("password").roles("USER").build());
//        return manager;
//    }
//}
//package com.example.sba;
//
//import de.codecentric.boot.admin.server.config.AdminServerProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.stereotype.Component;
//
//@Component
//public class SpringAdminSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private final String adminContextPath;
//
//    public SpringAdminSecurityConfig(AdminServerProperties adminServerProperties) {
//        this.adminContextPath = adminServerProperties.getContextPath();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // @formatter:off
//        SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
//        successHandler.setTargetUrlParameter("redirectTo");
//        successHandler.setDefaultTargetUrl(adminContextPath + "/");
//
//        http.authorizeRequests()
//            .antMatchers(adminContextPath + "/assets/**").permitAll()
//            .antMatchers(adminContextPath + "/login").permitAll()
//            .anyRequest().authenticated()
//            .and()
//            .formLogin().loginPage(adminContextPath + "/login").successHandler(successHandler).and()
//            .logout().logoutUrl(adminContextPath + "/logout").and()
//            .httpBasic().and()
//            .csrf()
//            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
//            .ignoringAntMatchers(
//                    adminContextPath + "/instances",
//                    adminContextPath + "/actuator/**"
//            );
//        // @formatter:on
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService(){
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("user").password("password").roles("USER").build());
//        return manager;
//    }
//}
