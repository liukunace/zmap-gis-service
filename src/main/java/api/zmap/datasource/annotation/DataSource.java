/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.zmap.io
 *
 * 版权所有，侵权必究！
 */

package api.zmap.datasource.annotation;

import java.lang.annotation.*;

/**
 * 多数据源注解
 *
 * @author lewkace@gmail.com
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface DataSource {
    String value() default "";
}
