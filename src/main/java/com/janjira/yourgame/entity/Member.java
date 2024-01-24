package com.janjira.yourgame.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "member")
public class Member {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
