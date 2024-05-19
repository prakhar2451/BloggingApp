package com.bloggingapp.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private String userId;
    private String name;
    private String email;

}
