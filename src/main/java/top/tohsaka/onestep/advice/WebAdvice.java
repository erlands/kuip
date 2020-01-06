package top.tohsaka.onestep.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.tohsaka.onestep.model.ResultModel;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class WebAdvice {

    private static final Logger log = LoggerFactory.getLogger(WebAdvice.class);

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResultModel missingServletRequestParameterException(HttpServletRequest request,MissingServletRequestParameterException e){
        String param = e.getParameterName();
        return ResultModel.failed(param + "不能为空");
    }
}
