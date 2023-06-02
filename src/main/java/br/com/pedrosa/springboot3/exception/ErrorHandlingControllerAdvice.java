package br.com.pedrosa.springboot3.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
class ErrorHandlingControllerAdvice {

	@ExceptionHandler
    ProblemDetail handle(IllegalStateException ise, HttpServletRequest request) {
		request.getHeaderNames().asIterator().forEachRemaining(System.out::println);
		var pd = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST.value());
		pd.setDetail(ise.getMessage());
		return pd;
	}
}
