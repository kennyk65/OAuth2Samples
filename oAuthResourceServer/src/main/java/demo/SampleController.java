package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/protected")
	public String protectd() {
		return "this is a protected OAuth2 resource";
	}

	@RequestMapping("/unprotected")
	public String unprotectd() {
		return "this is not protected";
	}
}
