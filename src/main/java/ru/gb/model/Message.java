package ru.gb.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Message {

    private Integer id;
    private String body;
    private String to;
    private String from;
}
