package org.example;

import java.util.List;

/**
 * 図書館で守るべきルール 本の検索
 */
public interface LibrarySearch {

  // タイトル検索
  List<Book> searchTitle(String title);

  // 著者検索
  List<Book> searchAuthor(String author);

  // 番号検索
  List<Book> searchNumber(int number);

}
