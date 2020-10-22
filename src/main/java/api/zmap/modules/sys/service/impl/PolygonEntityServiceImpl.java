package api.zmap.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import api.zmap.modules.sys.dao.PolygonEntityDao;
import api.zmap.modules.sys.entity.PolygonEntity;
import api.zmap.modules.sys.service.PolygonEntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("polygonEntityService")
public class PolygonEntityServiceImpl extends ServiceImpl<PolygonEntityDao, PolygonEntity> implements PolygonEntityService {

    @Override
    public List<PolygonEntity> queryPolygon() {
        return baseMapper.queryPolygon();
    }

    @Override
    public void insertPolygon(String id, String polygon) {
        baseMapper.insertPolygon(id,polygon);
    }

    @Override
    public List<PolygonEntity> queryPolygonByPolygon(String polygon) {
        return baseMapper.queryPolygonByPolygon(polygon);
    }
}
