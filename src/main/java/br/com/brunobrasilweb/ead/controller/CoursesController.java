package br.com.brunobrasilweb.ead.controller;

import br.com.brunobrasilweb.ead.model.Courses;
import br.com.brunobrasilweb.ead.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/")
public class CoursesController {

    @Autowired
    private CoursesRepository coursesRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String list(Model model) {

        List<Courses> list = coursesRepository.findAll();

        model.addAttribute("list", list);

        return "courses/list";

    }

}
