package com.jiu.config.datasource.annotation;
import com.jiu.config.datasource.DataSourceEnum;

import java.lang.annotation.*;

/**
 * Package com.jiu.config.datasource.annotation
 * ClassName DataSource.java
 * Description
 *
 * @author Liaoyj
 * @version V1.0
 * @date 2020-10-23 10:05
 **/
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {

    DataSourceEnum value() default DataSourceEnum.DB1;

}
