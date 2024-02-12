package ru.ustinov.cources.processing.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.ustinov.cources.processing.dto.ExchangeMoneyDTO;
import ru.ustinov.cources.processing.dto.NewAccountDTO;
import ru.ustinov.cources.processing.dto.PutAccountMoneyDTO;
import ru.ustinov.cources.processing.model.AccountEntity;
import ru.ustinov.cources.processing.service.AccountService;
import ru.ustinov.cources.processing.service.ExchangeService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("processing")
@RequiredArgsConstructor
public class ProcessingController {

    private final AccountService accountService;
    private final ExchangeService exchangeService;

    @PostMapping("/account")
    public AccountEntity createAccount(@RequestBody NewAccountDTO accountDTO) {
        return accountService.createNewAccount(accountDTO);
    }

    @PutMapping("/account/{id}")
    public AccountEntity putMoney(@PathVariable("id") Long accountId, @RequestBody PutAccountMoneyDTO date) {
        return accountService.addMoneyToAccount(date.getUid(), accountId, date.getMoney());

    }

    @PutMapping("/exchange/{uid}")
    public BigDecimal exchange(@PathVariable("uid") String uid, @RequestBody ExchangeMoneyDTO data) {
        return exchangeService.exchangeCurrency(uid, data.getFromAccountId(), data.getToAccountId(), data.getMoney());
    }

    @GetMapping("/accounts")
    public List<AccountEntity> getAllAccount() {
        return accountService.getAllAccount();
    }

}
