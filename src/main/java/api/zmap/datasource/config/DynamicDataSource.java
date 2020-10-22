/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.zmap.io
 *
 * 版权所有，侵权必究！
 */

package api.zmap.datasource.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 多数据源
 *
 * @author lewkace@gmail.com
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicContextHolder.peek();
    }

}
