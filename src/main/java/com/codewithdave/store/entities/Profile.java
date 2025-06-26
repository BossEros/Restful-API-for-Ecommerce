package com.codewithdave.store.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "profiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "bio")
    private String bio;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "loyaltyPoints")
    private Integer loyaltyPoints;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @MapsId
    private User user;
}
