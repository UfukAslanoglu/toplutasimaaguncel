# 🚌 Akıllı Toplu Taşıma Hattı Planlayıcı (Softmax Optimization)

Bu proje, şehir içi toplu taşıma güzergahlarını belirlemek için veri odaklı bir yaklaşım sunan Java tabanlı bir karar destek sistemidir. Algoritma, farklı mahallelerin kriterlerini analiz ederek en uygun hattı **Softmax Algoritması** kullanarak belirler.

## 🚀 Proje Hakkında
Şehir planlamasında en uygun güzergahı seçmek; nüfus yoğunluğu, maliyet ve çevresel etki gibi birçok değişkenin dengelenmesini gerektirir. Bu yazılım:
- 📊 **Veri Analizi:** Her bölge için nüfus, altyapı, maliyet ve sosyal fayda verilerini işler.
- 🧠 **Softmax Algoritması:** Ham puanları olasılıksal ağırlıklara (0-1 aralığına) dönüştürerek bilimsel bir karar verme süreci sunar.
- 🎯 **Optimizasyon:** En yüksek olasılığa sahip bölgeyi "En Uygun Güzergah" olarak seçer.

### 🔍 Kriterler ve Parametreler
Simülasyonda kullanılan temel kriterler şunlardır:
1. Nüfus Yoğunluğu
2. Ulaşım Altyapısı Mevcudiyeti
3. İnşaat/İşletme Maliyeti
4. Çevresel Etki Analizi
5. Sosyal Fayda Oranı

## 🛠️ Teknik Detaylar
- **Dil:** Java (Modern Stream API kullanımı mevcuttur).
- **Matematiksel Model:** Softmax Fonksiyonu (E-üssü normalizasyonu).
- **Yazılım Mimarisi:** Fonksiyonel programlama prensipleri ile yazılmıştır.

## 💻 Nasıl Çalıştırılır?
1. `TransportPlanner.java` dosyasını bilgisayarınıza indirin.
2. Terminal üzerinden derleyin:
   ```bash
   javac TransportPlanner.java
