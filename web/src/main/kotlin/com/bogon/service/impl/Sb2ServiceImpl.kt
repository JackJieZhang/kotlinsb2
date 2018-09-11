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

package com.bogon.service.impl

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl
import com.bogon.dao.Sb2Mapper
import com.bogon.entity.Sb2
import com.bogon.service.ISb2Service
import org.springframework.stereotype.Service

/**
 * <p> </p>
 *
 * @author BOGON
 * @version 1.0
 * @since JDK 1.7
 */
@Service
open class Sb2ServiceImpl : ServiceImpl<Sb2Mapper, Sb2>(), ISb2Service {
    override fun findById(id: Long): Sb2 {
        return baseMapper.selectDataById(id)
    }
}
