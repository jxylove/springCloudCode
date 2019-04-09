package com.timo.zuul.config;

import com.netflix.zuul.FilterFileManager;
import com.netflix.zuul.FilterLoader;
import com.netflix.zuul.groovy.GroovyCompiler;
import com.netflix.zuul.groovy.GroovyFileFilter;
import com.netflix.zuul.monitoring.MonitoringHelper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: Timo
 * @Date: 2019/4/8 10:54
 * @Description: 类用途：
 */
@Component
public  class GroovyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        MonitoringHelper.initMocks();
        FilterLoader.getInstance().setCompiler(new GroovyCompiler());
        try {
            FilterFileManager.setFilenameFilter(new GroovyFileFilter());
//            FilterFileManager.init(10, "D:\\idea_gitee_word_code\\springCloudCode\\zuul-groovy-filter-server\\src\\main\\java\\com\\timo\\zuul\\groovy");

            FilterFileManager.init(10, "D:\\idea_gitee_word_code\\springCloudCode\\zuul-groovy-filter-server\\src\\main\\resources\\groovy");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
