package com.bit.board.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.bit.board.model.ReboardDto;
import com.bit.board.service.ReboardService;
import com.bit.common.service.CommonService;
import com.bit.member.model.MemberDto;
import com.bit.util.PageNavigation;

@Controller
@RequestMapping("/reboard")
public class ReboardController {
  
  @Autowired
  private ReboardService reboardService;
  
  @Autowired
  private CommonService commonService;
  
  @RequestMapping("list.bit")
  public ModelAndView list(@RequestParam Map<String, String> param) {
    ModelAndView mav = new ModelAndView();
    List<ReboardDto> list = reboardService.listArticle(param);
    
    PageNavigation navigation = commonService.makePageNavigation(param);
    navigation.setRoot("/board");
    navigation.makeNavigator();
    
    mav.addObject("articlelist", list);
    mav.addObject("navigator", navigation);
    mav.setViewName("reboard/list");
    return mav;
  }
  
  @RequestMapping(value="write.bit", method=RequestMethod.GET)
  public String write(@RequestParam Map<String, String> param) {
    return "reboard/write";
  }
  
  @RequestMapping(value="write.bit", method=RequestMethod.POST)
  public String write(ReboardDto reboardDto, HttpSession httpSession, @RequestParam Map<String, String> param, Model model) {
    MemberDto memberDto =(MemberDto) httpSession.getAttribute("userInfo");
    if(memberDto != null) {
      reboardDto.setId(memberDto.getId());
      reboardDto.setName(memberDto.getName());
      reboardDto.setEmail(memberDto.getEmail());
      
      int seq = reboardService.writeArticle(reboardDto);
      if (seq != 0) {
        model.addAttribute("wseq", seq);
      } else {
        model.addAttribute("errorMsg", "서버 문제로 글작성이 실패 했습니다.!!!");
      }
    } else {
      model.addAttribute("errorMsg", "회원전용 게시판입니다!!!");
    }
    return "reboard/writeOk";
  }
  
  @RequestMapping("view.bit")
  public String view(@RequestParam int seq, HttpSession httpSession, Model model) {
    MemberDto memberDto = (MemberDto) httpSession.getAttribute("userInfo");
    if (memberDto != null) {
      ReboardDto reboardDto = reboardService.viewArticle(seq);
      model.addAttribute("article", reboardDto);
    }
    return "reboard/view";
  }
  
}
