package br.com.util.objects;

import org.openqa.selenium.By;

public class LoginObjects {

    public static By select_language = By.className("main-MuiSelect-root main-main61 main-MuiSelect-select main-main60 main-main63 main-MuiSelect-selectMenu main-MuiInputBase-input main-MuiInput-input");
    public static By icon_idioma = By.xpath("//*[contains(@class, 'main-MuiListItemIcon-root')]");
    public static By combo_languages = By.xpath("//*[@id=\"menu-country\"]/div[3]/ul");
    public static By nav_menu_profile = By.xpath("//*[@id=\"user-navbar\"]");
    public static By btn_ready_have_account = By.xpath("//*[@id=\"root\"]/article/section/section/div[1]/article/button[2]");
    public static By Input_login = By.xpath("//div[@class=\"main-MuiInputBase-root main-MuiInput-root main-MuiInput-underline main-MuiInputBase-formControl main-MuiInput-formControl\"]/input");
    public static By btn_remember_data = By.xpath("//*[@id=\"root\"]/article/section/section/div[1]/form/div[2]/label/span[1]/span[1]/span[1]");
    public static By loggin_button = By.id("footer-button-next");
    public static By combo_password = By.xpath("//div[@class=\"PasswordScreen_passwordInput__3gf3C\"]");
    public static By btn_go_to_recharge = By.xpath("//div[@data-class=\"holos-main-menu-item\"][5]");
    public static By confirm_logout = By.id("btn-dialog-modal-0");
    public static By my_data_account = By.xpath("//*[@id=\"root\"]/article/section/section/div[1]/div/div[2]/p");


}
