package com.medialog.angularjs.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private long id;

    private String username;

    private String address;

    private String email;

}
