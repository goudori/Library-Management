package org.example;

/**
 * 書籍の型クラス
 */
public class Book {

  String title;
  String author;
  int number;

  public Book(String title, String author, int number) {
    this.title = title;
    this.author = author;
    this.number = number;
  }


  public String getTitle() {
    return title;
  }



  public String getAuthor() {
    return author;
  }



  public int getNumber() {
    return number;
  }



  /**
   *  Bookの内容をユーザーが読めるようにするコード
   *
   * @return　本のタイトル名、茶者、番号を文字列として表示する
   */
  @Override
  public String toString() {
    return "検索した本は、{" +
        "タイトル名='" + title + '\'' +
        ", 著者='" + author + '\'' +
        ", 番号=" + number +
        '}';
  }
}
