package nhky.jx.mapper;

import nhky.jx.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @USER: Liuhl
 * @DATE: 2023/3/17 14:24
 */
@Repository
public interface UserDao {
    List<User> findAllUser();
}
