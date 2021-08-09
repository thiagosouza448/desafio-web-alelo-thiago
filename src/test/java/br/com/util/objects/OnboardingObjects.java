package br.com.util.objects;

import org.openqa.selenium.By;

public class OnboardingObjects {

    public static By input_document = By.xpath("//input[@id='show-login-idnumber-input']");
    public static By btn_create_account = By.xpath("//*[@id=\"footer-button-next\"]");
    public static By name = By.xpath("//*[@id=\"root\"]/div/section/article/section/div/div[1]/div/div/input");
    public static By lastname = By.xpath("//*[@id=\"root\"]/div/section/article/section/div/div[2]/div/div/input");
    public static By email = By.xpath("//*[@id=\"root\"]/div/section/article/section/div/div[3]/div/div/input");
    public static By email_arg = By.xpath("//*[@id=\"email-input\"]");
    public static By birth = By.xpath("//*[@id=\"root\"]/div/section/article/section/div/div[4]/div/div/input");
    public static By btn_continue = By.xpath("//*[@id=\"footer-button-next\"]");
    public static By plan_combo = By.xpath("//*[@id=\"root\"]/div/section/article/section/div/div/div[2]");
    public static By accept_terms_check = By.xpath("//*[@id=\"root\"]/div/section/article/div[2]/div/div[1]/label/span[2]");
    public static By accept_terms_check_arg = By.xpath("//*[@id=\"formGroup1\"]/label/span[1]/span[1]");
    public static By language_default = By.xpath("//*[@id=\"phone-prefix-list-select\"]/div[2]/span");
    public static By prefixo_select = By.id("phone-prefix-list-select");
    public static By open_prefix_combo = By.xpath("//*[@id=\"menu-phone-prefix-list-select\"]/div[3]");
    public static By phone_number_input = By.xpath("//*[@id=\"phone-number-input\"]");
    public static By sms_option = By.xpath("//*[@id=\"root\"]/div/section/article/section/div[2]/div/label[1]");
    public static By cep_input = By.xpath("//*[@id=\"root\"]/div/section/article/section/div/div/div[1]/div/input");
    public static By numero_input = By.xpath("//input[@type=\"number\"]");
    public static By person_not_exposed = By.xpath("//*[@id=\"root\"]/div/section/article/section/div/div/div/div/div/div[2]/button[2]/span[1]");
    public static By carga_manual_arg = By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/button");
    public static By apelido_arg = By.xpath("//*[@id=\"lastName\"]");
    public static By nombre_arg = By.xpath("//*[@id=\"firstName\"]");
    public static By birth_arg = By.xpath("//*[@id=\"birthDate\"]");
    public static By male_gender = By.id("switch-button-second-gender");
    public static By female_gender = By.id("switch-button-first-gender");
    public static By number_tramite = By.xpath("/html/body/div/div/section/article/section/div/div[4]/div/div/input");


    public static By h1_age = By.tagName("h1");
    public static By label_error = By.xpath("//ul[@class='fb_eba8acee__PhoneCountryInput_containerErrorMsg__GIFBh']");
    public static By news_check = By.xpath("//*[@id=\"formGroup2\"]/label/span[1]/span[1]");
    public static By state_input = By.xpath("//*[@id=\"root\"]/div/section/article/section/div/div/div[2]/div/div[1]");
    public static By drop_down = By.xpath("//li[@class='42-MuiButtonBase-root 42-MuiListItem-root 42-MuiMenuItem-root 42-MuiMenuItem-gutters 42-MuiListItem-gutters 42-MuiListItem-button']");
    public static By city_input = By.xpath("//*[@id=\"root\"]/div/section/article/section/div/div/div[3]/div/div[1]");
    public static By district_input = By.xpath("//*[@id=\"root\"]/div/section/article/section/div/div/div[4]/div/div[1]");


}
