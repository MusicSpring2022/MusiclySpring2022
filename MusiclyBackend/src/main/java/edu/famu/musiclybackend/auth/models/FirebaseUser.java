package edu.famu.musiclybackend.auth.models;


import lombok.Data;

@Data
public class FirebaseUser {
    private String uid;
    private String name;
    private String issuer;
    private String picture;
    private String email;
    private boolean emailVerified;


}
