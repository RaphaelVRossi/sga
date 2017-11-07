package br.com.rrossi.sga.documents;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document @NoArgsConstructor @AllArgsConstructor @ToString
public class User {

    @Id @Getter @Setter
    private String id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String login;

    @Getter @Setter
    private String password;
}
