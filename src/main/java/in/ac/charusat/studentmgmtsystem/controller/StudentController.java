package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Student;
import in.ac.charusat.studentmgmtsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="https://app-dummy123.herokuapp.com")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping
    public String displayWelcomeMessage(){
        return "<h1> Welcome user </h1>";
    }
    @GetMapping("/hello")
    public String displayHelloMessage()
    {
        return "<h1> hello chintan </h1>";
    }

    @GetMapping("/Welcome")
    public String displayWMessage()
    {
        return "<h1> Welcome jd </h1>";
    }
}
