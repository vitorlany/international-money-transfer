package app.imt.infrastructure.data.account;

import app.imt.domain.account.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    default AccountEntity map(Account account) {
        if (account == null) {
            return null;
        }
        return new AccountEntity(
                account.getId(),
                account.getType().name()
        );
    }

    Account map(AccountEntity account);
}
