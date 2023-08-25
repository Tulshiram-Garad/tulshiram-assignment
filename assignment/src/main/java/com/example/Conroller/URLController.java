package com.example.Conroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Entity.URLData;
import com.example.Service.URLService;

@RestController
@RequestMapping("/urls")
public class URLController {

 private final URLService urlService;

 public URLController(URLService urlService) {
     this.urlService = urlService;
 }

 @PostMapping
 public URLData addURL(@RequestBody URLData urlData) {
     return urlService.saveURL(urlData);
 }

 @GetMapping
 public List<URLData> getAllURLs() {
     return urlService.getAllURLs();
 }
}
