package cn.rocky.dao;

import org.springframework.stereotype.Component;
import cn.rocky.model.book;

/**
 * Created by Administrator on 2015/8/8.
 */
@Component
public class bookDao {
    public void add(book book){
        System.out.print("Add");
    }
    public void update(book book){
        System.out.print("Update");
    }
}
