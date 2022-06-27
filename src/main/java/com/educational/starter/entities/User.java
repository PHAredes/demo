package com.educational.starter.entities;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1;
    private Long id;
    private String name;
    private String email;
    private String number;
    private String password;

}
