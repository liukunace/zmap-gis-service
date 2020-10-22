package api.zmap.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import api.zmap.modules.sys.entity.PolygonEntity;

import java.util.List;

public interface PolygonEntityService extends IService<PolygonEntity> {

    List<PolygonEntity> queryPolygon();

    void insertPolygon(String id,String polygon);

    List<PolygonEntity> queryPolygonByPolygon(String polygon);

}
