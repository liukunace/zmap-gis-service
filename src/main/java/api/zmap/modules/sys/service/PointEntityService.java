package api.zmap.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import api.zmap.modules.sys.entity.PointEntity;

import java.util.List;

public interface PointEntityService extends IService<PointEntity> {

    List<PointEntity> queryPoint();

}
