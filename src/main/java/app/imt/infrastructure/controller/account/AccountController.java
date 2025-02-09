package app.imt.infrastructure.controller.account;

import app.imt.application.AccountApplication;
import app.imt.domain.account.Account;
import app.imt.domain.account.AccountType;
import app.imt.infrastructure.controller.account.request.AccountCreateRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController implements AccountAPI {

    private final AccountApplication accountApplication;

    @Override
    public List<Account> getAllAccounts() {
        return accountApplication.getAllAccounts();
    }

    @Override
    public Account create(final AccountCreateRequest accountCreateRequest) {
        final var accountType = AccountType.valueOf(accountCreateRequest.type());
        return accountApplication.createAccount(accountCreateRequest.id(), accountType);
    }
}
