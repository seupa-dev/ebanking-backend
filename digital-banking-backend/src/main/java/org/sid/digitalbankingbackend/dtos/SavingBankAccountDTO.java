package org.sid.digitalbankingbackend.dtos;
import lombok.Getter;
import lombok.Setter;
import org.sid.digitalbankingbackend.enums.AccountStatus;

import java.util.Date;
@Getter @Setter
public class SavingBankAccountDTO extends BankAccountDTO {
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
