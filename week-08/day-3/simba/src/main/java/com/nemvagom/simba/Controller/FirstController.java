package com.nemvagom.simba.Controller;

import com.nemvagom.simba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FirstController {

  @GetMapping("/show")
  public String showBankAccount(Model model) {
    BankAccount one = new BankAccount("1", 2000, "Kacsacsőrű emlős", "szúnyog");
    model.addAttribute("bankAccount", one);
    return "default";
  }

  @GetMapping("/ception")
  public String ception(Model model) {
    model.addAttribute("cept", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "ception";
  }

  @GetMapping("/ListAccounts")
  public String listAccounts(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("2", 4000, "csirke", "féreg"));
    bankAccountList.add(new BankAccount("3", 6233, "ló", "féreg"));
    bankAccountList.add(new BankAccount("4", 3546, "gyík", "zebra"));
    bankAccountList.add(new BankAccount("5", 4653, "lepke", "zebra"));
    model.addAttribute("accounts", bankAccountList);
    return "accounts";
  }
}
