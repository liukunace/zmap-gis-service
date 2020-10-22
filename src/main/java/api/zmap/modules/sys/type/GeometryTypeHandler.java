package api.zmap.modules.sys.type;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.postgresql.geometric.PGpoint;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(value = {PGpoint.class})
public class GeometryTypeHandler extends BaseTypeHandler<PGpoint> {

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, PGpoint pGpoint, JdbcType jdbcType) throws SQLException {
        pGpoint.setType("point");
        preparedStatement.setObject(i,pGpoint);

    }

    @Override
    public PGpoint getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return (PGpoint) resultSet.getObject(s);
    }

    @Override
    public PGpoint getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return (PGpoint) resultSet.getObject(i);
    }

    @Override
    public PGpoint getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return (PGpoint) callableStatement.getObject(i);
    }
}
