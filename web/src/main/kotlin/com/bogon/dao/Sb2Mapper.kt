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

package com.bogon.dao

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.bogon.entity.Sb2

/**
 * <p> </p>
 *
 * @author BOGON
 * @version 1.0
 * @since JDK 1.7
 */
interface Sb2Mapper : BaseMapper<Sb2> {
    fun selectDataById(id: Long): Sb2
}
