package br.com.util.objects;

import org.openqa.selenium.By;

public class RechargeObjects {

    public static By btn_go_to_recharge= By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div/div[1]/div/div/nav/div[5]");
    public static By input_company = By.xpath("//*[@class=\'f533a608__autoCompleter_inputSearch__1MGIa']");
    public static By input_phone= By.xpath("//input[@type='text']");
    public static By btn_continue_after_send_phone= By.xpath("//span[contains(@class,'42-MuiButton-label')]");
    public static By input_value_recharge = By.xpath("//input[@data-testid=\"responsive_currency_input_significant\"]");
    public static By btn_continue_after_value = By.xpath("//button[@data-testid=\"value_continue_btn\"]");
    public static By btn_confirm_recharge= By.xpath("//button[@data-testid=\"confirm_recharge_btn\"]");
    public static By btn_valid_phone_invalid = By.xpath("//button[@class=\"42-MuiButtonBase-root 42-MuiButton-root a5ebb719__SuperButton_root__3vFm9   42-MuiButton-text a5ebb719__PhoneInput_button__32NJg\"]");

}
