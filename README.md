
<!-- PROJE HAKKINDA -->
## Proje Hakkında

Proje temel kahve sipariş otomasyonu amacıyla geliştirilmiştir. Kullanıcı konsol uygulaması ile listelenen ürünlerden seçim yapabilmektedir.

### Geliştirmede Kullanılan Teknoloji

* [Java 11]
* [Junit, Mockito]
* [Maven]


<!-- BAŞLANGIÇ -->
## Başlangıç

1. Sınıflar arasındaki bağımlılığı düşük tutmak için tarifeler ve içecekler interface class'ından türetilmiştir. Yeni ürün veya tarif eklenmesi durumunda operasyon
sınıflarının modifiye edilmesine ihtiyaç duyulmayacaktır.

2. Tüm kahvelerin içeriğinde espresso bulunduğu için diğer kahve sınıfları espresso'dan kalıtılmıştır. Mevcutta kalıtım class'ından sadece sipariş bilgilendirme 
mesajında faydalanılmıştır.


### Kurulum

1. Repo'nun klonlanması
   ```
   sh git clone https://github.com/evrenbayrak/coffee-shop.git
   ```
2. Zip formatında indirilmesi durumunda da "Existing maven project" seçeneği ile import edilebilir.


<!-- Örnekler -->
## Kullanım

1. Ürün ekranı:
```
1. Espresso (7₺)
2. Double Espresso (12₺)
3. Cappuccino (12₺)
4. Caffe Latte (12₺)
5. Mocha (13₺)
6. Americano (10₺)
7. Hot Water (3₺)
Lütfen sipariş vermek istediğiniz içecek numarasını giriniz :
   ```
  Hatalı giriş:
```
Lütfen sipariş vermek istediğiniz içecek numarasını giriniz : g
Sipariş verebilmek için sayısal ürün değeri girilmelidir :
   ```
  Doğru giriş:
```
Lütfen sipariş vermek istediğiniz içecek numarasını giriniz : 5
Teşekkürler kahveniz hazırlanıyor.
   ```
  Sipariş Sonucu:
```
Mocha seçtiniz.Bu içeceğimiz 1 doz espresso ve 1 doz ısıtılmış süt ve 1 doz süt köpüğü ve 2 doz sıcak çikolata içermektedir. Afiyet olsun. 
```
 

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew
[product-screenshot]: images/screenshot.png
