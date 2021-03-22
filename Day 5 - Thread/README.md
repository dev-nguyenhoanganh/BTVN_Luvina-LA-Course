# Buổi 5 - Thread

> ## Bài 1 
Tạo một lớp NguoiGuiTien (Ma, Hoten, Diachi, Sodienthoai,Ngaysinh), so sánh được theo Ma.
### Yêu cầu
1.1. Tạo dữ liệu (5 người) và lưu vào `TreeMap<NguoiGuiTen, Double>;`

1.2. Nhập vào một người nào đó và tìm kiếm:

- Nếu người đó chưa có trong `TreeMap` thì thêm vào với số tiền gửi là 100;
- Nếu đã có người đó trong `TreeMap` thì tiến hành tăng số tiền trong tài khoản lên 100. 

> ## Bài 2
### 2.a) Xây dựng các lớp sau
a.1. Tạo lớp Order gồm các thuộc tính sau - HOÁ ĐƠN
```java 
    int  IdOrder;      // mã hoá đơn
    Date OrdDate;      // ngày hoá đơn
    String CustomerID; // mã khách hàng
    
    // Ví dụ
    or1 = new Order (1,"06/8/2020", "Cus01");
    or2 = new Order (2,"06/8/2020", "Cus02");
```

a.2. Tạo lớp OrderDetail gồm các thuộc tính sau - CHI TIẾT HOÁ ĐƠN
```java
    int IdOrder;  // mã hoá đơn
    int IdDetail; // mã hoá đơn chi tiết
    int ItemID;   // mã hàng
    int Amount;   // số lượng hàng
    float Price;  // đơn giá

    // Ví dụ
    orDetail1 = new OrderDetail (1, 1, 1, 10, 100);
    orDetail2 = new OrderDetail (1, 2, 5, 7 , 20 );
    orDetail3 = new OrderDetail (2, 3, 3, 10, 100);
    orDetail4 = new OrderDetail (2, 4, 7, 7 , 20 );
```

a.3. Tạo lớp Purchase gồm các thuộc tính sau - NHẬP HÀNG
```java
    int IdPurchase   ; // mã đơn nhập hàng
    Date purDate     ; // ngày nhập hàng
    String SupplierID; // mã nhà cung cấp 
```
a.4. Tạo lớp PurchaseDetail gồm các thuộc tính sau
```java
    int IdPurchase;
    int IdDetail  ;
    int ItemID    ;
    int Amount    ;
    float Price   ;
```
a.5.Tạo lớp Supplier  gồm các thuộc tính sau
```java
    String  IdSup  ; // mã nhà cung cấp
    String  Name   ;
    String  Address;
    String  Tel    ;
```
a.6. Tạo lớp Customer gồm:
```java
    String  IdCus  ; // mã nhà cung cấp
    String  Name   ;
    String  Address;
    String  Tel    ;
```

### 2.b) Yêu cầu:

*b.1. Hãy xây dựng và chèn các hoá đơn vào các cấu trúc dữ liệu sau:*
1. `TreeMap <Order, ArrayList<OrderDetail>>`

2. `TreeMap <Customer, ArrayList<Order>>`
- Thực hành tìm kiếm danh sách hoá đơn theo mã khách hàng
- Thực hành tìm kiếm chi tiết hoá đơn theo mã hoá đơn

*b.2. Hãy xây dựng và chèn đơn nhập hàng vào các cấu trúc dữ liệu sau:*
- `HashMap <Supplier, TreeMap<Purchase, ArrayList<PurchaseDetail>>>`
- Thực hành tìm kiếm các đơn nhập hàng theo mã nhà cung cấp

> ## Bài 3
Thực hành Funtional Interfaces, Lambda Expressions, Method References, Stream Filter

> ## Bài 4 
Thực hành các thao tác với CSDL

> ## Bài 5 
Thực hành JavaBeans: PropertyChangeSupport, PropertyChangeListener

> ### Chú ý
1) Ôn tập thuật toán
2) Ôn tập kỹ các cấu trúc dữ liệu

---

# Bài tập phần Thead

> ## Bài 1
Cho int[] arr = { 11, 6, 7, 8, 9, 10 };
- Dùng `DataOutputStream` ghi các giá trị của mảng A ra file `Bai1-1.txt`;
- Dùng `DataInputStream` đọc dữ liệu từ file `Bai1-1.txt`, sắp xếp các giá trị đọc được theo thứ tự tăng dần sau đó ghi ra file `Bai1-2.txt`;

> ## Bài 2 
Cho int[] arr = { 1, 7, 9, 14 } tăng dần và giá trị `x = 5`
- Dùng `RandomAccessFile` ghi mảng `arr` ra file `Bai2.txt`
- Đọc file `Bai2.txt` và chèn x vào để nội dung của file gồm các giá trị liên tiếp tăng dần.

> ## Bài 3 
- Dùng notepad soạn 1 file text `Bai3-1.txt` gồm các câu.
- Dùng `FileReader` đọc và sửa lỗi soạn thảo 
(sau dấu chấm phải viết hoa, sau dấu chấm, phảy phải có chỉ 1 dấu cách) và dùng `FileWriter` để ghi ra file `Bai3-2.txt`

> ## Bài 4 
- Luyên tập try/catch/finally; 
- Luyện tập các lớp streams khác

> ## Bài 5 
Tính giá trị định thức của một ma trận vuông theo phương pháp biến đổi thành ma trận tam giác. (3 vòng lặp)

> ### Bài 6
Tham khảo `ObjectInputStream` và `ObjectOutputStream` 

[Xem ví dụ](https://www.boraji.com/java-objectinputstream-and-objectoutputstream-example)
