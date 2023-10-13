package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService; // new로 넣어주면 컨트롤러 마다 서비스가 생기는데, 서비스는 하나만 만들고 돌려써도 충분

    @Autowired // memberService를 연결해줌
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
