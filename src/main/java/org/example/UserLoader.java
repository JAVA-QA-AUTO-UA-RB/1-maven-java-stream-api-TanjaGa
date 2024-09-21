package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.dto.User;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class UserLoader {

    public static List<User> loadUsersFromJson(String filePath) throws IOException {
        Gson gson = new Gson();
        Type userListType = new TypeToken<List<User>>() {
        }.getType();
        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, userListType);

        }
    }
}
// Додайте реалізацію метода, який
        // з JSON файлу який знаходиться за відносним шляхом filepath
        // з допомогою вбудованих засобів бібліотеки https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1
        // десеріалізує контент JSON файлу у список з об*єктів типу User і повертає список
