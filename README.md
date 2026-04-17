# 📌 MVVM with Kotlin Flow & Jetpack Compose (Part 1)

Android application demonstrating **MVVM architecture** using **Kotlin Flow, Coroutines, Retrofit, and Jetpack Compose** with real-time API integration.

---

## 🏗️ Architecture

```
com
├── data
│   ├── model
│   │   ├── Product.kt
│   │   └── ProductResponse.kt
│   │
│   ├── remote
│   │   ├── api
│   │   │   └── ProductApiService.kt
│   │   │
│   │   └── retrofit
│   │       └── RetrofitInstance.kt
│   │
│   └── repository
│       └── ProductRepository.kt
│
├── ui
│   ├── components
│   │   └── ProductItem.kt
│   │
│   ├── screen
│   │   └── product
│   │       └── ProductScreen.kt
│   │
│   ├── viewmodel
│   │   └── ProductViewModel.kt
│   │
│   └── main
│       └── MainActivity.kt
│
└── domain (optional)
```

---

## 🔁 Data Flow

```
UI (Jetpack Compose)
        ↓
ViewModel (StateFlow)
        ↓
Repository (Flow)
        ↓
Retrofit API
        ↓
Remote Server (REST API)
        ↓
JSON Response → Model Mapping
        ↓
UI Recomposition
```

---

## ⚙️ Tech Stack

* **Kotlin**
* **Coroutines**
* **Kotlin Flow**
* **Retrofit**
* **Jetpack Compose**
* **MVVM Architecture**

---

## 📡 API Used

```
https://www.looqua.com/app/products.php
```

---

## 🎯 Features

* Clean and scalable **MVVM architecture**
* **Real-time API integration**
* Reactive UI updates using **Kotlin Flow**
* Separation of concerns (UI / ViewModel / Data)
* Modern Android development practices

---

## 🚀 Future Improvements (Part 2)

* UI State handling (Loading / Error / Success)
* Dependency Injection using **Hilt**
* Pagination support
* Offline caching using **Room Database**
* Image loading with **Coil**

---

## 🧠 Learnings

* How to structure Android apps using MVVM
* How Flow works in real-time data updates
* How Retrofit integrates with Coroutines
* How Compose reacts to StateFlow changes

---

## 👨‍💻 Author

**Sunil S A**

---

## ⭐ If you found this helpful

Give this repo a ⭐ and follow for more Android architecture examples!
