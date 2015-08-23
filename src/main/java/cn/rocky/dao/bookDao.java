package cn.rocky.dao;

import org.springframework.stereotype.Component;
import cn.rocky.model.book;

/**
 *
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
