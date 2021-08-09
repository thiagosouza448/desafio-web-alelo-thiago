package br.com.util.objects;

import org.openqa.selenium.By;

public class HomeObjects {

    public static By section_balance = By.xpath("//div[@class=\"a5ebb719__BalanceCard_balanceCard__3U2m4\"]");
    public static By btn_visualizar_saldo = By.xpath("//*[@class=\"icon icon-eye-closed \"]");
    public static By validade_section_balance = By.xpath("//*[@id=\"mainContentDiv\"]/div/div/div[1]/div[1]/div/div/div[4]/div/span");
    public static By movimento = By.className("a5ebb719__Transactions_menuHeader__16dGd");
    public static By data_moviment = By.xpath("//div[@class=\"a5ebb719__TransactionModal_dataContainer__2ft4l\"]");
    public static By movement_list = By.xpath("//div[@class='a5ebb719__Transactions_menuHeader__16dGd']");

}
