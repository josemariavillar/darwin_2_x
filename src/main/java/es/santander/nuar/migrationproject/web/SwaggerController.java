package es.santander.nuar.migrationproject.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@Api
@ApiIgnore
@ApiModel
@RestController
@RequestMapping("/swagger")
public class SwaggerController {

	@GetMapping("/{name}")
	@ApiModelProperty(hidden = true)
	public String sayHelloName(@RequestParam String name) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ").append(name);
		return sb.toString();
	}

	@GetMapping("/{surname}")
	@ApiOperation(value = "foo", notes = "bar")
	@ApiParam
	@ApiResponse(code = 404, message = "foo")
	public String saySurName(@RequestParam String surname) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ").append(surname);
		return sb.toString();
	}

	@GetMapping("/test")
	@ApiImplicitParams({ @ApiImplicitParam(name = "name", example = "Tom") })
	public String test(String name) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello ").append(name);
		return sb.toString();
	}

}
