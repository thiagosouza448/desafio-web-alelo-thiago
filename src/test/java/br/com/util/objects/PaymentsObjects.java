package br.com.util.objects;

import org.openqa.selenium.By;

public class PaymentsObjects {

    public static By btn_payments= By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/div/nav/div[3]");
    public static By input_bar_code= By.xpath("//input[@class=\"42-MuiInputBase-input 42-MuiInput-input a5ebb719__BarCode_numeroInput__BHEB5 42-MuiInputBase-inputAdornedEnd\"]");
    public static By btn_continue_after_bar_code= By.xpath("//*[contains(text(),'Continuar')]");
    public static By msg_payment_ok= By.xpath("//p[@class=\"a5ebb719__MobileApproveScreen_messageTitle__280Gs\"]");
    public static By btn_confirm_payment= By.xpath("//*[@id=\"mainContentDiv\"]/div/div/div[2]/div[2]/div[1]/div[2]/button");


}
