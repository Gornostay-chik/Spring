package org.example.springcourse;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{
    @Override
    public String getSong(){
        return "Something Jazz Song";
    }
}
