package com.ws.demo.service;

import com.ws.demo.model.*;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RestService {

  public RestService() {

  }

  public Object getNumberDoubler(Integer input) {
    if (input == null) {
      return new ErrorHandler("Please provide an input !");
    } else {
      return new NumberDoubler(input);
    }
  }

  public Object getGreeting(String name, String title) {
    if (name.equals("")) {
      return new ErrorHandler("Please provide a name !");
    } else if (title.equals("")) {
      return new ErrorHandler("Please provide a title !");
    } else {
      return new Greeter(name,title);
    }
  }
  public Object getAppended(String appendable) {
    if (appendable == null) {
      throw new ResourceNotFoundException();
    } else {
      return new Appender(appendable + "a");
    }
  }

  public Object getArrayOperationResult(ArrayHandler arrayHandler) {
    if (arrayHandler.what.equals("sum")) {
      return new Result(arrayHandler.sum());
    } else if (arrayHandler.what.equals("multiply")) {
      return new Result(arrayHandler.multiply());
    } else if (arrayHandler.what.equals("double")) {
      return  new Result(arrayHandler.doubleElements());
    } else
      return new ErrorHandler("Please provide what to do with the numbers!");
  }
}
