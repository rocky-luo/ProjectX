package cn.rocky.service;

import cn.rocky.model.book;
import org.springframework.stereotype.Component;
import cn.rocky.dao.*;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/8/8.
 */
@Component
public class bookService {
    private bookDao bookDao;

    public bookDao getBookDao() {
        return bookDao;
    }

    @Resource
    public void setBookDao(bookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void add(book book){
        bookDao.add(book);
    }
    public void update(book book){
        bookDao.update(book);
    }
}
