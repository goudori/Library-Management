package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 書籍のリスト（Bookオブジェクト）を管理し、それに対してタイトル、著者、番号による検索機能を提供するクラス。
 */
public class Library implements LibrarySearch {

  private List<Book> books;

  public Library(List<Book> books) {
    this.books = books;
  }

  @Override
  public List<Book> searchTitle(String title) {
    List<Book> resultBooks = new ArrayList<>();

    for (Book bookCollect : books) {
      if (bookCollect.getTitle().equalsIgnoreCase(title)) {
        resultBooks.add(bookCollect);
      }

    }

    return resultBooks;
  }

  @Override
  public List<Book> searchAuthor(String author) {
    List<Book> resultAuthor = new ArrayList<>();

    for (Book bookCollect : books) {
      if (bookCollect.getAuthor().equalsIgnoreCase(author)) {
        resultAuthor.add(bookCollect);
      }

    }

    return resultAuthor;
  }

  @Override
  public List<Book> searchNumber(int number) {
    List<Book> resultNumber = new ArrayList<>();
    for (Book bookCollect : books) {
      if (bookCollect.getNumber() == number) {
        resultNumber.add(bookCollect);
      }
    }
    return resultNumber;
  }
}
