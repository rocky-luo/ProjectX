package cn.rocky.dao;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Param;

/**
 * Created by luoqi02 on 15/8/24.
 */
@Repository
public interface IMybookDAO {
    public int insert(@Param("book_id") int book_id,@Param("book_name") String book_name);

}
