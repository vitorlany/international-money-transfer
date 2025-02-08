package app.imt.domain.transfer;

import app.imt.domain.wallet.Wallet;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@AllArgsConstructor
public class Transfer {
    private String id;
    private Wallet fromWallet;
    private BigDecimal amount;
    private Wallet toWallet;
    private BigDecimal exchangeRate;
    private OffsetDateTime dateTime;
}
