package org.example;

import java.util.List;

/**
 * 課題: 図書館管理システムを作る。 1.書籍(Book)を管理する情報(タイトル、著者、番号)を持つオブジェクトを作って、そこに情報を格納して下さい。
 * 2.図書館(Library)を作って、そこにBookをListで持つようなものを保持する。
 * 3.mainメソッドからこのLibraryクラスに対して、検索ができるようにする。Libraryクラスには書籍を検索する機能を持つ。
 * 4.タイトル検索、著者検索、番号検索メソッドをLibraryクラスに持たせる。 5．上記をmainメソッドから実行して、実行結果をコンソールに出力する。
 */
public class Main {

  public static void main(String[] args) {
    // 歴史の本
    Book bookHistory = new Book("三国志", "吉川", 1);

    // 料理の本
    Book bookCooking = new Book("三分クッキング", "メアリー", 2);

    // 植物の本
    Book bookPlant = new Book("お花集", "さわだ", 3);

    List<Book> bookKind = List.of(bookHistory, bookCooking, bookPlant);

    Library library = new Library(bookKind);

    // 本のタイトルを検索する
    System.out.println(library.searchTitle("三国志"));

    // 本の著者を検索する
    System.out.println(library.searchAuthor("さわだ"));

    //　番号を使って、検索したい本を全て表示する。
    List<Integer> bookSearchNumber = List.of(1, 2, 3);

    for (Integer numbook : bookSearchNumber) {
      List<Book> resultNumbers = library.searchNumber(numbook);
      System.out.println(resultNumbers);
    }


  }
}
