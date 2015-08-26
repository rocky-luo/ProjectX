package cn.rocky.service.Impl;

import cn.rocky.dao.IMybookDAO;
import cn.rocky.service.IMybookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by luoqi02 on 15/8/25.
 */
@Service
public class MybookServiceImpl implements IMybookService {
    @Resource
    private IMybookDAO mybookDAO;
    @Override
    public int insert(int book_id, String book_name){
        return mybookDAO.insert(book_id,book_name);
    }
}
