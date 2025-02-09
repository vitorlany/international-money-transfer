package app.imt.infrastructure.controller.account;

import app.imt.domain.account.Account;
import app.imt.domain.account.AccountType;
import app.imt.infrastructure.controller.account.request.AccountCreateRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/account")
public interface AccountAPI {

    @GetMapping
    List<Account> getAllAccounts();

    @PostMapping
    Account create(@RequestBody AccountCreateRequest accountCreateRequest);
}
