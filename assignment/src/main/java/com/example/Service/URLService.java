package com.example.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.Entity.URLData;
import com.example.Repository.URLRepository;

@Service
public class URLService {

 private final URLRepository urlRepository;

 public URLService(URLRepository urlRepository) {
     this.urlRepository = urlRepository;
 }

 public URLData saveURL(URLData urlData) {
     return urlRepository.save(urlData);
 }

 public List<URLData> getAllURLs() {
     return (List<URLData>) urlRepository.findAll();
 }
}

