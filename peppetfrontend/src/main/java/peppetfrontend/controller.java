package peppetfrontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 

public class controller
{
		@RequestMapping(value="/login")
		public String loginPage()
		{
		 return "login";
			
		}
		@RequestMapping(value="/Register")
		public String register()
		{
			return "register";
			
		}
}
