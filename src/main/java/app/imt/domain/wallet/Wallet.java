package app.imt.domain.wallet;

import app.imt.domain.account.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Wallet {
    private String id;
    private Account account;
    private CurrencyType currency;
    private BigDecimal balance;
}
