package study.jsprendering;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.commons.logging.Log;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Controller
//@RequestMapping("/report")
//@EnableWebMvc 
//@EnableAutoConfiguration
public class WelcomeController {

	@RequestMapping("/")
	  public String welcome(){
          return "welcome"; 
   }

	@RequestMapping(value = "/report" , method=RequestMethod.GET)
    public ModelAndView getExcel(){
           List<Student> studentList = new ArrayList<Student>(); 
           studentList.add(new Student("S01", "Natalia", "12344"));
           studentList.add(new Student("S02", "David", "658"));
           studentList.add(new Student("S01", "Dima", "12344"));
           studentList.add(new Student("S02", "Igor", "658"));
           studentList.add(new Student("S01", "Andrey", "12344"));
           studentList.add(new Student("S02", "Elena", "658"));
           return new ModelAndView(new ExcelReportView(), "studentList", studentList);
    }


}