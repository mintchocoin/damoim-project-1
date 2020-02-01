package gathering;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GatheringController {
	@RequestMapping("/gathering/board.do")
	public String gatheringBoard() {
		return "gathering/board";
	}
	
	@RequestMapping("/gathering/home.do")
	public String gatheringHome() {
		return "gathering/home";
	}
}
