package controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController{

    @RequestMapping(method = RequestMethod.GET)
    public String userList(){
        return "all users";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getEntryById(@PathVariable("id") Long id){
        return "Get a value id = "+ id;
    }

    @RequestMapping( method = RequestMethod.POST )
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public String create(@RequestBody String firstName ){
        return "create a user "+firstName;
    }

    @RequestMapping( method = RequestMethod.PUT)
    @ResponseStatus( HttpStatus.OK)
    public String update( @RequestBody Long id){
        return "Update ID: "+id;
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    @ResponseStatus( HttpStatus.OK)
    public String delete( @PathVariable( "id") Long id){
        return "Delete ID "+id;
    }
}