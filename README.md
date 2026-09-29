# Tugas-PBO_Array-dan-ArrayList

Implementasi program Java menggunakan konsep OOP dengan class:

1. Class `bank` menggunakan `Customer[]` untuk menyimpan beberapa customer.
2. Class `customer` menggunakan `account[]` untuk menyimpan beberapa account
  yang dimiliki oleh customer.
3. Setiap `account` menyimpan informasi saldo dan memiliki method `deposit()`
  dan `withdraw()`.

Struktur hubungan array:

Bank
└── Customer[]
    ├── Customer 1
    │   └── Account[]
    ├── Customer 2
    │   └── Account[]
    └── Customer 3
        └── Account[]