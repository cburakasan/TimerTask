ANALİZ:

Soru : Sizden javadakine benzer bir Timer sınıfı yazmanızı istiyoruz. Bu Timer sınıfı "setTimer" metoduna sahip olacaktır. Bu metod "çağırılacak metodun sınıf instance'ını" (instance tipinde), "çağırılacak metodun ismini" (String tipinde), milisaniye cinsinden çağırım sıklığını (int tipinde) ve tek sefer mi yoksa tekrarlı mı çağırması gerektiği bilgisini (bolean değer) içeren 4 parametre alacaktır.
Ardından ilgili "Timer" sınıfının "start" metodu çağırılarak "Timer" başlatılacaktır. "Timer" sınıfının "stop" metodu çağırılana kadar çalışması beklenmektedir.

Çağırılan metodun içerisinde anlık zaman değeri konsola yazdırılacak böylece "Timer" in belirtilen sıklıkta çağırıp çağıramadığı sergilenecektir.


PROJENIN TANIMI:
Bir spring boot projesi üzerinde "START" ve "STOP" butonlarını çalıştıran servis yapısı kuruldu.
START butonuna basıldığında parametre olarak method instance, method name, çağrılma sıklığı ve tekrar durumunu içeren "setTimer" ve
"StartTimer" methodları çalışarak veriilen milisaniye aralığında ekrana anlık zamanı milisaniye cinsinden yazdırıldı.
STOP butonuna basıldığında START butonu ile çalıştırılan servis durduruldu.
Aynı anda AdminController ve UserController'larında bu servisler eş zamanlı çalıştırılabilir.


NOT: Analizde verilen setTimer methodunun son parametresi olan boolen değer olan methodun tekrarlı çalışığ çalışmadığını belirten alanın
anlamını tam kavrayamadım. yani true olduğu vakit ne yapılması gerekiyor?



