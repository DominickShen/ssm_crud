package com.project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Books {

    private  int bookId;
    private String bookName;
    private int bookCounts;
    private String detail;

    public int getBookId() {
        return bookId;
    }


//    public int getBookId() {
//        return bookId;
//    }
}
