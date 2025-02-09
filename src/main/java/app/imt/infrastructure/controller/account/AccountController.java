package app.imt.infrastructure.controller.account;

import app.imt.application.AccountApplication;
import app.imt.domain.account.Account;
import app.imt.domain.account.AccountType;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountController implements AccountAPI {

    private final AccountApplication accountApplication;

    @Override
    public List<Account> getAllAccounts() {
        return accountApplication.getAllAccounts();
    }

    @Override
    public Account createAccount(final AccountType type) {
        return accountApplication.createAccount(type);
    }
}
