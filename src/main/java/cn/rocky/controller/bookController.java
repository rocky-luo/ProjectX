package cn.rocky.controller;

import cn.rocky.dao.mybookDAO;
import cn.rocky.model.book;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.rocky.service.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2015/8/8.
 */
@Controller
@RequestMapping("/")
public class bookController {
    @Autowired
    private mybookDAO mybook;
    private bookService bookService;
    @RequestMapping("/")
    public String indexPage() {
        Logger logger = Logger.getLogger(bookController.class);
        //mybook.insert(1,"rocky run");

        logger.error(System.getProperty("ProjectRoot"));
        return "index";
    }
    /*@RequestMapping("/")
    public ModelAndView indexPage() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }*/
    @RequestMapping("/add")
    public String add(book book){
        System.out.println("bookname:"+book.getName());
        System.out.println("author:"+book.getAuthor());
        bookService.add(book);
        return "success";
    }
    @RequestMapping("/update")
    public String update(book book) {
        bookService.update(book);
        return "success";
    }
    @RequestMapping("/hellorocky")
    public ModelAndView hellorocky(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView mv = new ModelAndView("hello");
        mv.addObject("title", "Spring MVC And Freemarker");
        mv.addObject("content", " Hello world ， test my first spring mvc ! ");
        return mv;

    }
    public bookService getBookService() {
        return bookService;
    }
    @Resource
    public void setBookService(bookService bookService) {
        this.bookService = bookService;
    }
}
