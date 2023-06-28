package com.example.SlmExam.StringModifyController;

import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/api")
    public class StringModifyController {
        @GetMapping("/modify")
        public String modifyString(String string){
            StringBuilder modifiedString = new StringBuilder();

            for (int i = 0; i < string.length(); i++) {
                char currentChar = string.charAt(i);

                if (i % 2 == 1) {
                    // Convert every second character to uppercase
                    currentChar = Character.toUpperCase(currentChar);
                }

                modifiedString.append(currentChar);
            }

            return modifiedString.toString();
        }
    }
