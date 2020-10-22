/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.zmap.io
 *
 * 版权所有，侵权必究！
 */

package api.zmap.modules.app.annotation;

import java.lang.annotation.*;

/**
 * app登录效验
 *
 * @author lewkace@gmail.com
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
}
