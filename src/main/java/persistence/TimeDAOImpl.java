package persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TimeDAOImpl implements TimeDAO {
    @Inject
    private SqlSession sqlSession;
    private static final String NAMESPACE = "com.lsy0318.mapper.TimeMapper.";
    @Override
    public String getTime() {
        return sqlSession.selectOne(NAMESPACE + "getTime");
    }
}
