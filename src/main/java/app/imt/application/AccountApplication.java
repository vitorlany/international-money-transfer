package app.imt.application;

import app.imt.domain.account.Account;
import app.imt.domain.account.AccountType;
import app.imt.infrastructure.data.account.AccountMapper;
import app.imt.infrastructure.data.account.AccountRepository;
import app.imt.infrastructure.exception.InvalidFieldException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountApplication {

    private final AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        final var account = new Account("123", AccountType.COMPANY);
        final var account1 = new Account("123", AccountType.PERSONAL);
        final var map = AccountMapper.INSTANCE.map(account);
        System.out.println(map);
        return List.of(account, account1);
    }

    public Account createAccount(final String id, final AccountType type) {
        if (accountRepository.existsById(id)) {
            throw new InvalidFieldException("Account already exists");
        }
        final var account = new Account(id, type);
        final var entity = AccountMapper.INSTANCE.map(account);
        accountRepository.save(entity);
        return account;
    }
}
