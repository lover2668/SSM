package com.kylin.electricassistsys.service.impl.tsys;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.kylin.electricassistsys.dao.tsys.TSysGdgsDao;
import com.kylin.electricassistsys.pojo.tsys.TSysGdgs;
import com.kylin.electricassistsys.service.tsys.TSysGdgsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 陈文旭
 * @since 2018-04-24
 */
@Service
@Transactional
public class TSysGdgsServiceImap extends ServiceImpl<TSysGdgsDao, TSysGdgs> implements TSysGdgsService {

}
