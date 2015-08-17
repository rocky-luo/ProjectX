package cn.rocky.controller;

import cn.rocky.model.book;
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
    private bookService bookService;
    @RequestMapping("/")
    public String indexPage() {
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
