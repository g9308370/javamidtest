
AUTHORS:黃清秀
USER INSTRUCTIONS:


1.預設的測試資料可以在TEST CLASS裡面做調整，並有注解
2.將所有動作分離，請先產生一個TEST物件，並利用BlueJ內的右鍵執行動作
3.所有動作都能夠自由穿插，獨立運作並同時保持程式正確性
4.所有動作都有Error Exception處理，並因應不同的語言，輸出不同語言的Error
5.運用簡單int變數，讓所有動作產生的訂單、銀行帳戶都能夠擁有正確的編號  001..002  ...003  依序自動下去
6.所有交易訊息會在執行動作後自動輸出，並不用額外執行動作
7.同第6點，我就沒有另外在寫display();了，畢竟所有的動作我都有詳細輸出。


P.S 要切換語言  請執行chooseLanguage的動作  


寫三份語言檔真的很像在做苦工...可是沒有寫Exception總覺得程式會Crash...而我又只能在星期三晚上Code
因為時間關係，所以在匯出匯入的時候，並不會去考慮到對方帳戶餘額等等，
只確保自己帳戶的資金流動正確，當然能夠正確扣除手續費(能在Transfer底下的Class做個別匯率修正)，