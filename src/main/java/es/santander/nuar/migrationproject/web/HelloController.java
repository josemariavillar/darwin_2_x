package es.santander.nuar.migrationproject.web;

import es.santander.darwin.core.exceptions.HttpBaseDarwinException;
import es.santander.darwin.security.authorization.error.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	ErrorModel e;

	@GetMapping(value = "/get-httpBase-exc")
	public HttpBaseDarwinException getHttpExcp() {
		return new HttpBaseDarwinException("", HttpStatus.INTERNAL_SERVER_ERROR, "", "");
	}

}