package api.zmap.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import api.zmap.modules.sys.dao.PointEntityDao;
import api.zmap.modules.sys.entity.PointEntity;
import api.zmap.modules.sys.service.PointEntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pointEntityService")
public class PointEntityServiceImpl extends ServiceImpl<PointEntityDao, PointEntity> implements PointEntityService {

    @Override
    public List<PointEntity> queryPoint() {
        return baseMapper.queryPoint();
    }
}
