package app.imt.application;

import app.imt.domain.account.Account;
import app.imt.domain.account.AccountType;
import app.imt.infrastructure.data.entity.AccountEntity;
import app.imt.infrastructure.data.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountApplication {

    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return List.of(new Account("123", AccountType.COMPANY));
    }

    public Account createAccount(final AccountType type) {
        return null;
    }
}
