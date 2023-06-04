package com.realestate.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client_reg")
public class ClientReg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    @Column(nullable = false)
    private String clientName;

    @Column(nullable = false)
    private String clientAddress;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;
@OneToOne(mappedBy = "clientReg",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
private Sale sale;
}

