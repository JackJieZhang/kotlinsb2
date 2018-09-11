/*
 * The Hefei JingTong RDC(Research and Development Centre) Group.
 * __________________
 *
 *    Copyright 2015-2018
 *    All Rights Reserved.
 *
 *    NOTICE:  All information contained herein is, and remains
 *    the property of JingTong Company and its suppliers,
 *    if any.
 */

package com.bogon.config

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
import org.mybatis.spring.annotation.MapperScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * <p> </p>
 *
 * @author BOGON
 * @version 1.0
 * @since JDK 1.7
 */
@Configuration
@MapperScan("com.bogon.**.dao*")
open class MybatisPlusConfig {
    /**
     * mybatis-plus分页插件<br></br>
     *
     * @return 分页拦截
     */
    @Bean
    open fun paginationInterceptor(): PaginationInterceptor {
        return PaginationInterceptor()
    }
}