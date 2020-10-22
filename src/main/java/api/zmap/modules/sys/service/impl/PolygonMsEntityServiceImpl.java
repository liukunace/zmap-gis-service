package api.zmap.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import api.zmap.modules.sys.dao.PolygonMsEntityDao;
import api.zmap.modules.sys.entity.PolygonMsEntity;
import api.zmap.modules.sys.service.PolygonMsEntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("polygonMsEntityService")
public class PolygonMsEntityServiceImpl extends ServiceImpl<PolygonMsEntityDao, PolygonMsEntity> implements PolygonMsEntityService {

    @Override
    public List<PolygonMsEntity> queryPolygon() {
        return baseMapper.queryPolygon();
    }

}
