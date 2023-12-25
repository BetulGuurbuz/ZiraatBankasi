@TasitKredisiHesaplama
  Feature: Ziraat Bankası web sitesinden tasit kredisi, mevduat hesaplama araclari ve Sube arama ekrani testi

    @TasitKredisi-400000TL-48Ay-4Faiz
    Scenario: Kredi tutari 500000 TL, Vade 48 ay, faiz %4
      Given Kullanici anasayfadadir
      Given Cookie kabul eder
      Given Hesaplama araclari linkine tiklar
      Given Tasit kredisi linkine tiklar
      When Kredi turunu tasit kredisi secer
      When Tutar 400000 yazar
      When Vade 48 yazar
      When Faiz 4 yazar
      Then Hesapla butonuna tiklar
      Then Hesaplama sonucunu konsola yazdirilir

      @Mevduat-100000-32Gun
      Scenario: Mevduat ana para 100000 TL, Vade 32 gün
        Given Kullanici anasayfadadir
        Given Cookie kabul eder
        Given Hesaplama araclari linkine tiklar
        Given Mevduat getirisi linkine tiklar
        When Doviz cinsi TL secer
        When Vade süresi 32 yazar
        When Vade Tutar 100000 yazar
        Then Vade hesaplama butonuna tiklar
        Then Vade hesaplama sonucunu konsola yazdirilir

        @SubeArama
        Scenario: Il ve ilçe kriterlerine gore sube aramasi
          Given Kullanici anasayfadadir
          Given Cookie kabul eder
          Given Sayfa asagiya kaydirilir
          When En Yakin Ziraat alanindan Sube checkbox secilir
          When Sehir seciniz alanina Ankara yazilir
          When Ilce seciniz alanina Golbasi yazılır
          Then Ara butonuna tiklanir

