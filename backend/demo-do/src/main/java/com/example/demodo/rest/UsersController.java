package com.example.demodo.rest;

import com.example.demodo.entity.Users;
import com.example.demodo.service.UsersService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/login")
    public ResponseEntity<Users> login(@RequestBody Map<String, String> body, HttpServletResponse response) {
        String userName = body.get("user_name");
        String pwd = body.get("pass_word");
        Users user = usersService.login(userName, pwd);
        if (user == null) {
            return ResponseEntity.ok().body(null);
        }
        Cookie cookie = new Cookie("user_id", user.getId() + "");
        cookie.setMaxAge(30 * 60);
        cookie.setPath("/");
        System.out.println(user);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.SET_COOKIE, "user_id=" + user.getId() + "");
        System.out.println(cookie.toString());

        return ResponseEntity.ok().headers(headers).body(user);

    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                // xóa cookie có tên là "myCookie"
                if ("user_id".equals(cookie.getName())) {
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                }
            }
        }
    }

    @PostMapping("/users")
    public Users save(@RequestBody Users users) {
        return usersService.save(users);
    }

    @GetMapping("/users/{id}")
    public Optional<Users> getById(@PathVariable(value = "id") Integer id) {
        return usersService.find(id);
    }

    @DeleteMapping("/users/{id}")
    public void deleteById(@PathVariable(value = "id") Integer id) {
        usersService.delete(id);
    }

}
