package top.tohsaka.onestep.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import top.tohsaka.onestep.interceptor.AdminInterceptor;

@Configuration
public class AdminConfig extends WebMvcConfigurationSupport {
    @Autowired
    private AdminInterceptor interceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor).addPathPatterns("/admin/**").excludePathPatterns("/admin/login","/admin/logout");
        super.addInterceptors(registry);
    }
}
