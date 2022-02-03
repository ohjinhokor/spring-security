package security.basicsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String index(){
        return "home";
    }


    @GetMapping("loginPage")
    public String loginPage(){

        //원래는 로그인 페이지가 출력되어야하지만 임시로 글자만 출력되도록 함.
        return "loginPage";
    }
}
