package com.example.demo.domain.Post;

public enum PostType {
    /**
     * Письмо
      */
    LETTER("1"),
    /**
     * Открытка
     */
    POSTCARD("2"),
    /**
     * Посылка
     */
    PARCEL("3"),
    /**
     * Бандероль
     */
    PARCELPOST("4");

    private String value;
    PostType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
