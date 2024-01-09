package org.mromichov;

public enum ARGS_ERRORS {
    NONE (""),
    NO_FILE ("Укажите файл для компиляции"),
    BAD_FILE_EXTENSION ("Файл должен иметь расширение .sal");

    private final String message;

    ARGS_ERRORS(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
