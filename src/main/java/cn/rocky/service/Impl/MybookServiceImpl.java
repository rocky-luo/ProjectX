package cn.rocky.service.Impl;

import cn.rocky.dao.mybookDAO;
import cn.rocky.service.IMybookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by luoqi02 on 15/8/25.
 */
@Service
public class MybookServiceImpl implements IMybookService {
    @Autowired
    private mybookDAO mybook;
    @Override
    public int insert(int book_id, String book_name){
        return mybook.insert(book_id,book_name);
    }
}
