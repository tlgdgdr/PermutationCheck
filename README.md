# PermutationCheck
Permutation Check for 2 String Parameters

----------------------------------------------------------------

İlk etapta gönderilen parametrelerin "null" olup olmadıklarını kontrol ettim. Eğer öyleyse "false" döndürdüm.
Daha sonrasında iki tane "char" tipinde array tanımlayıp, içlerine de parametrelerdeki değerleri "toCharArray" metodu ile atadım.
Karşılaştırma yapabilmeyi kolaylaştırmak için arrayleri "sort" metodu ile sıraladım.
Eğer boyutları farklı ise "false" değer döndürdüm.
Dizilerin boyutlarının aynı olması durumunda da "for" döngüsünde karakterlerin eşitliğini kontrol ettim. Eğer eşitliğin bozulduğu durum varsa "false",
  eşitlik bozulmuyorsa "true" değer döndürdüm.
  
  --------------------------------------------------------------
