package refactoring.menu;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.List;

public class MenuBank implements Menu{
    @Override
    public SendMessage printMenu(Long chatId) {
        SendMessage message = new SendMessage(chatId.toString(), "Please choose option:");
        List<String> buttons = List.of("Privat", "Monobank", "NBU", "BACK_TO_START", "BACK_TO_SETTINGS");
        createMenu(buttons, 3, message);
        return message;
    }
}
