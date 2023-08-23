package com.aditya.wallet.service;

import com.aditya.wallet.domain.Wallet;

import java.util.Optional;
import java.util.List;

public interface WalletService {

        Optional<Wallet> createWallet(Wallet wallet);
        Optional<Wallet> getWallet(String mobile);
        List<Wallet> getAllWallets();
        Optional<Wallet> loadAmount(String mobile, double amount);
        boolean transferAmount(String fromMobile, String toMobile,double amount);

}
