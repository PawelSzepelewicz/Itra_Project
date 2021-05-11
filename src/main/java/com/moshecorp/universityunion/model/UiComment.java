package com.moshecorp.universityunion.model;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class UiComment {

    Long id; //(comment id из базы данных)
    String content; //(содержимое комментария, тоже из бд)
    String authorName; // (получить из бд из таблицы Usr, по значению userId из записи комментария)
    int likesCount; // (из бд посчитать колличество лайков для данного комментария)
    boolean isLiked; // (проверить, что в списке всех лайков есть или нет userId соответствующий прилетевшему с фронта userId)
    Timestamp creationDatetime; // из таблицы комментов получить время создания)

}
