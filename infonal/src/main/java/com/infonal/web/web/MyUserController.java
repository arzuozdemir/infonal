package com.infonal.web.web;
import com.infonal.web.domain.MyUser;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/myusers")
@Controller
@RooWebScaffold(path = "myusers", formBackingObject = MyUser.class)
public class MyUserController {
}
