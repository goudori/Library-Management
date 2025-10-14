# 📚課題
## 図書館管理システムを実装する。
---


## 📌目次
- [はじめに](#はじめに)
- [開発環境](#開発環境)
- [実行方法](#実行方法)
- [プログラムの内容](#プログラムの内容)
- [実行結果](#実行結果)
- [学んだ事](#学んだ事)
- [終わりに](#終わりに)
---



## 📖はじめに
### このプロジェクトは、Java を用いて図書管理システムで、「探したい本を検索する」プログラムです。
---



## 🛠開発環境
- 使用OS:Windows11
- 使用言語:![Java](https://img.shields.io/badge/Java-v21-007396?logo=openjdk&logoColor=white)
- JDK: Windows版のOracle JDK 21.0.8 (LTS)　⚠️LTSサポート有効期間:2026年9月まで
- 使用IDE:IntelliJ IDEA Commnunity Edition(無料版)

---



## 🚀実行方法
・Windowsの場合
「Shift + F10」のキーボードを同時に押して実行して下さい。



・Macの場合
「Control + R 」のキーボードを同時に押して実行して下さい。


---


## 💻プログラムの内容

1.Book.javaクラスで、本の「タイトル、著者、番号」の型を作ります。



・文字列型→タイトル、著者





・整数型→番号










<img width="583" height="772" alt="スクリーンショット 2025-10-14 214156" src="https://github.com/user-attachments/assets/17c6fb8b-7335-4372-abda-2915c8dafae6" />













2.LibrarySearch.javaのインターフェースで、「タイトル、著者、番号の本検索のルール作り」を書きます。








<img width="610" height="411" alt="スクリーンショット 2025-10-15 072335" src="https://github.com/user-attachments/assets/adae7613-7e7f-495e-888f-0313ab0eb1b5" />















3.Library.javaクラスで、本の「タイトル、著者、番号」でそれぞれの検索で、一致した本を探す事ができる判定処理を書きます。




・タイトルの判定処理







<img width="638" height="374" alt="スクリーンショット 2025-10-15 074548" src="https://github.com/user-attachments/assets/5996319f-46e3-472e-8d17-9f7ead76c7d1" />










・著者の判定処理










<img width="638" height="373" alt="スクリーンショット 2025-10-15 074715" src="https://github.com/user-attachments/assets/6ca44101-b212-4ecc-b3d2-94625d1bf8ed" />














・番号の判定処理







<img width="493" height="282" alt="スクリーンショット 2025-10-15 074736" src="https://github.com/user-attachments/assets/860a68d1-3686-4ffb-bc78-af846928a486" />









4.Book.javaクラスで、@Overrideしたメソッドをコンソール結果で、ユーザーが読めれるように「toString」メソッドを実装する事を書く。








<img width="577" height="359" alt="スクリーンショット 2025-10-15 074835" src="https://github.com/user-attachments/assets/d47637c2-be87-434d-9235-eed41e404267" />


---
## ✅実行結果






























---
## ✍学んだ事
・@Overrideしたコードを実行結果でユーザーが読めれるにするには、toStringメソッドが必要だと分かりました。これをしないとコンソール結果が暗号みたいになる。




・値が正しいかどうかを確認判定するのは、文字列型では、「文字列メソッド((例)equalsIgnoreCase)」を使うのに対して、数値型では、「==」を使う事が、分かりました。










---
## 🔚終わりに
これは、Javaを使って、今まで学習してきた基本文法で図書管理システムを作る事を目的としています。
