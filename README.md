# Üç Kenarı Bilinen Üçgenin Alanını Hesaplayan Program

* Kullanıcıdan `int a,b,c` degişkenleri için Scanner sınıfı kullanılarak sayılar alınır.
* Sayıların negatif girilmesine müteakip oluşacak sorunu gidermek için if - else koşulu ile negatif ise program sonlandırılmaktadır.
* Öncelikle `double u` değişkenin hesaplanması gerekir. 
    `double u = (a+b+c) / 2;`
* Üçgenin çevresi hesaplanır. `double cevre = 2 * u;`
* Alan hesabı yapılır. Kök işlemi olması nedeniyle Math.sqrt kullanılmıştır. `double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c)); `
