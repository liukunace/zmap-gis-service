package api.zmap.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import api.zmap.modules.sys.entity.PolygonMsEntity;

import java.util.List;

public interface PolygonMsEntityService extends IService<PolygonMsEntity> {

    List<PolygonMsEntity> queryPolygon();

}
