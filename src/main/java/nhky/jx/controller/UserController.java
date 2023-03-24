package nhky.jx.controller;

import nhky.jx.domain.User;
import nhky.jx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @USER: Liuhl
 * @DATE: 2023/3/17 14:24
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/findAllUser")
    public String manageUser(Model model){
        System.out.println("11111111111111111111111");
        List<User> list= userService.findAllUser();
        model.addAttribute("list", list);
        return "admin/manageUser";
    }
}
