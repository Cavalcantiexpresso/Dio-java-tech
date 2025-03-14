package br.model;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class UserModel {

    private int code;

    private  String UserName;

    private LocalDate birthday;
}
