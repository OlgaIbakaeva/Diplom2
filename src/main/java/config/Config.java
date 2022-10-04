package config;

public class Config {
    // URL приложения Stellar Burgers
    public static String BASE_URL = "https://stellarburgers.nomoreparties.site/";
    // ручка для создания пользователя
    public static String HANDLE_CREATING_USER = "/api/auth/register";
    // ручка для логина пользователя
    public static String HANDLE_LOGIN_USER = "/api/auth/login ";
    // ручка для изменения данных пользователя - методом PATCH, удаления - методом DELETE
    public static String HANDLE_CHANGING_USER_DATA = "/api/auth/user";
    // ручка заказа (создание - методом POST, получения заказов конкретного пользователя - методом GET)
    public static String HANDLE_ORDER = "/api/orders";
}