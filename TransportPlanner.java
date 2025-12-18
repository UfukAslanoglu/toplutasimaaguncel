import java.util.*;



// Toplu taşıma hattı planlama uygulaması

// Softmax algoritmasını kullanarak en uygun mahalleyi belirler

 class TransportPlanner {

    public static void main(String[] args) {

        // 3 mahalle için sentetik veri (nüfus yoğunluğu, ulaşım altyapısı, maliyet, çevresel etki, sosyal fayda)

        // Burada her mahalle için kriterler belirlenmiştir. Her satır bir mahalleyi temsil eder.

        double[][] criteria = {

                {800, 6, 3, 5, 7},  // Mahalle 1 (nüfus yoğunluğu, ulaşım altyapısı, maliyet, çevresel etki, sosyal fayda)

                {600, 7, 4, 6, 8},  // Mahalle 2

                {900, 5, 2, 4, 6}   // Mahalle 3

        };



        // Mahalle isimlerini belirleme

        String[] mahalleIsimleri = {"Mahalle 1", "Mahalle 2", "Mahalle 3"};



        // Softmax algoritmasını uygulayarak kriterlerin ağırlıklarını hesapla

        double[] weights = applySoftmax(criteria);



        // Ağırlıklar üzerinden en iyi güzergahı belirleme

        int bestIndex = selectBestRoute(weights);



        // Sonuçları konsola yazdırma

        System.out.println("Mahalle Ağırlıkları: " + Arrays.toString(weights));

        System.out.println("En uygun güzergah: " + mahalleIsimleri[bestIndex]);

    }



    // Softmax algoritmasını uygulayan fonksiyon

    public static double[] applySoftmax(double[][] criteria) {

        double[] scores = new double[criteria.length];



        // Her mahalle için kriterleri toplayarak bir temel puan oluşturuyoruz

        for (int i = 0; i < criteria.length; i++) {

            scores[i] = Arrays.stream(criteria[i]).sum(); // Kriterlerin toplamı alınır

        }



        // Softmax işlemi için maksimum puanı buluyoruz

        double max = Arrays.stream(scores).max().orElse(0);



        // Exponential (üssü alma) işlemi ile toplamı hesaplıyoruz

        double sumExp = Arrays.stream(scores).map(x -> Math.exp(x - max)).sum();



        // Softmax ağırlıklarını hesapla

        double[] softmaxValues = new double[scores.length];

        for (int i = 0; i < scores.length; i++) {

            softmaxValues[i] = Math.exp(scores[i] - max) / sumExp;

        }



        return softmaxValues;

    }



    // En iyi güzergahı belirleyen fonksiyon
