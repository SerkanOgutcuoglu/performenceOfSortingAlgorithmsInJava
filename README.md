# Thread ile Sıralama Algoritmalarının Performansı

Bu repo, sıralama algoritmalarının ana thread ile çalıştırıldığındaki performanslarını ve thread'lerle beraber çalışırkenki performansını hesaplayan kodları içerir. **sortRunner.java** içerisinde 4 farklı algoritma için 4 tane thread tanımlanmıştır ve burada çalıştırılmaktadır.

- **com.sortAlgortihm** klasörü içinde sıralama algoritmalarının thread ile beraber yazılmış kodları bulunur.  
- **printArray.java** her sıralama algoritmasının sonucunu "lock" yöntemi kullanarak konsola yazdırır.  
- **com.sortRunnerMain** klasörü içerisinde her algoritmanın ana thread'te çalıştırıldığı kodlar mevcuttur.

---

## **Genel Gözlemler**

### **1. Veri Sıralamasının Önemi**
- Algoritmaların performansı, verilerin başlangıçtaki sıralanma durumuna (rastgele, küçükten büyüğe, büyükten küçüğe) büyük ölçüde bağlıdır.
- Önceden sıralanmış (küçükten büyüğe) verilerde, özellikle **Insertion Sort** ve **Bubble Sort** gibi algoritmalar hızlanır.
- **Büyükten küçüğe sıralanmış** veriler bazı algoritmaların performansını düşürür.

### **2. İş Parçacığı (Thread) Etkisi**
- Algoritmaların tek iş parçacığında veya çoklu iş parçacığında çalıştırılması performansı etkileyebilir.
- "Hepsi Çalışınca" bölümlerindeki veriler, algoritmaların aynı anda çalıştırılmasının performans üzerindeki etkisini gösterir.

### **3. Algoritma Karmaşıklığı**
- Algoritmaların "**Büyük O Notasyonu**" ile ifade edilen karmaşıklıkları, hızlarını etkileyen temel faktörlerden biridir.

---

## **Algoritma Bazında Açıklamalar**

### **Insertion Sort**
- **Hız:**  
  - Küçükten büyüğe sıralı verilerde **en hızlı** algoritmalardan biridir.
  - Ana thread üzerinde çalıştırıldığında, küçükten büyüğe sıralı verilerde en iyi sonuçları verir.
- **Yavaşlık:**  
  - Rastgele ve büyükten küçüğe sıralı verilerde daha yavaştır.
  - Algoritma, sıralı verilerde çok az işlem yaparken, sıralanmamış verilerde daha fazla karşılaştırma ve kaydırma gerektirir.

### **Bubble Sort**
- **Hız:**  
  - Küçükten büyüğe sıralı verilerde oldukça hızlıdır.
- **Yavaşlık:**  
  - Rastgele ve büyükten küçüğe sıralı verilerde **en yavaş algoritmalardan biridir**.
  - Bubble Sort, sıralı dizilerde sadece bir kez tarama yaparak hızlı olabilir. Ancak, sıralanmamış dizilerde komşu elemanları sürekli karşılaştırıp değiştirdiği için yavaşlar.

### **Quick Sort**
- **Hız:**  
  - Rastgele sıralı verilerde genellikle hızlıdır.
- **Yavaşlık:**  
  - Büyükten küçüğe sıralı verilerde ve bazı rastgele veri senaryolarında yavaşlayabilir.
  - Quick Sort'un performansı, **pivot elemanının seçimine bağlıdır**. Kötü pivot seçimleri, algoritmanın O(n^2) karmaşıklığına ulaşmasına neden olabilir.

### **Shell Sort**
- **Hız:**  
  - Farklı veri sıralamalarında **tutarlı bir şekilde iyi performans** gösterir.
  - Shell Sort, elemanları alt dizilere ayırarak ve bu alt dizileri sıralayarak çalışır. Bu, elemanların daha hızlı doğru konumlarına yerleşmesini sağlar.

---

## **Ek Faktörler**
- **Veri Boyutu:** Büyük veri kümelerinde, **karmaşıklığı düşük** olan algoritmalar daha iyi performans gösterir.
- **Donanım:** Testlerin yapıldığı **işlemci, bellek vb. donanım** sonuçları etkileyebilir.
- **İş Parçacığı Kullanımı:** Algoritmaların **çoklu iş parçacığında çalıştırılması**, paralelleştirme yoluyla performansı artırabilir. Ancak, **iş parçacığı yönetimi ek yük getirebilir**.

---

Bu repo, farklı veri sıralamalarında **sıralama algoritmalarının performanslarını analiz etmek** ve **thread kullanımının etkilerini görmek** için oluşturulmuştur. Eğer daha fazla test veya optimizasyon eklemek isterseniz, kodu geliştirerek farklı senaryoları test edebilirsiniz. 😊

*****************************************************


# Performance of Sorting Algorithms with Threads

This repository contains code to calculate the performance of sorting algorithms when executed on the main thread and when executed using multiple threads. **sortRunner.java** defines four threads for four different algorithms and executes them.

- The **com.sortAlgorithm** folder contains the implementations of sorting algorithms that utilize threads.
- **printArray.java** prints the result of each sorting algorithm to the console using a "lock" mechanism.
- The **com.sortRunnerMain** folder contains the code for executing each algorithm in the main thread.

---

## **General Observations**

### **1. Importance of Data Order**
- The performance of algorithms largely depends on how the data is initially sorted (random, ascending, or descending).
- Pre-sorted (ascending) data significantly speeds up some algorithms, especially **Insertion Sort** and **Bubble Sort**.
- **Descending order** data can slow down some algorithms.

### **2. Impact of Threading**
- Running algorithms on a single thread versus multiple threads can affect performance.
- The "All Running" sections in the results indicate how simultaneous execution influences performance.

### **3. Algorithm Complexity**
- The "**Big O Notation**" complexity of algorithms is a key factor affecting their speed.

---

## **Algorithm-Specific Analysis**

### **Insertion Sort**
- **Speed:**  
  - One of the fastest algorithms for **ascending** sorted data.
  - When executed on the main thread, it is the fastest algorithm for **ascending** sorted data.
- **Slowness:**  
  - Slower on **random** and **descending** sorted data.
  - Due to its nature, it requires fewer operations for pre-sorted data but performs more comparisons and shifts for unsorted data.

### **Bubble Sort**
- **Speed:**  
  - Quite fast for **ascending** sorted data.
- **Slowness:**  
  - One of the **slowest** algorithms for **random** and **descending** sorted data.
  - Bubble Sort quickly processes sorted arrays with a single pass but slows down significantly in unsorted arrays due to repeated comparisons and swaps.

### **Quick Sort**
- **Speed:**  
  - Generally fast for **random** data.
- **Slowness:**  
  - Slower for **descending** sorted data and in some random data scenarios.
  - The performance of Quick Sort heavily depends on **pivot selection**. Poor pivot choices can lead to O(n²) complexity.

### **Shell Sort**
- **Speed:**  
  - Shows consistently **good performance** across different data orders.
  - Shell Sort divides the array into smaller subarrays and sorts them, which helps elements reach their correct positions faster, ensuring a stable performance across varying data arrangements.

---

## **Additional Factors**
- **Data Size:** Larger datasets significantly impact the execution time. Algorithms with **lower complexity** perform better on big data.
- **Hardware:** The processor, memory, and other hardware components used for testing influence the results.
- **Thread Usage:** Running algorithms in **multiple threads** can improve performance through parallelization, but thread management can introduce additional overhead.

---

This repository was created to **analyze the performance of sorting algorithms across different data orders** and to **examine the impact of threading**. If you would like to add more tests or optimize the implementation, feel free to modify the code and experiment with different scenarios! 😊

