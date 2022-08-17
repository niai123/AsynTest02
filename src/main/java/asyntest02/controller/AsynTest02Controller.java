package asyntest02.controller;

import asyntest02.dto.RequestDto;
import asyntest02.dto.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ymx
 * @Name AsynTest02Controller
 * @CreateTime 2022/8/17
 * @ProjectName AsynTest02
 * @Description:
 */

@RestController
@RequestMapping("/asyntest02")
public class AsynTest02Controller {

    @RequestMapping(value ="/test", method = RequestMethod.POST)
    public Response TestAsyn(@RequestBody RequestDto requestDto) {
        try {
            Thread.sleep(1000);
            return Response.success(requestDto.getSerialNum());
        } catch(Exception e) {
            return Response.fail(e.getMessage());
        }
    }
}
