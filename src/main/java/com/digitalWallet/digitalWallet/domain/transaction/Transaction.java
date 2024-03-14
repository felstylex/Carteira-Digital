package com.digitalWallet.digitalWallet.domain.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.digitalWallet.digitalWallet.domain.user.User;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transaction {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private BigDecimal amount; 
  
  @ManyToOne
  @JoinColumn(name = "sender_id")
  private User sender;

  @ManyToOne
  @JoinColumn(name = "receive_id")
  private User receiver;

  private LocalDateTime timestamp;
}
