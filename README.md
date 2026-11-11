# Bài 3: CI/CD Automation

## 1. Ý tưởng chính & Tiếp cận
- Dự án sử dụng Maven để quản lý phụ thuộc, biên dịch và chạy các quy trình kiểm thử (Unit Tests).
- Tích hợp **SLF4J/Logback** giúp ghi vết log rõ ràng trong quá trình chạy ứng dụng và debug.
- Sử dụng **GitHub Actions** để tự động hóa quy trình CI: tự động chạy `mvn test` và `mvn package` mỗi khi có sự kiện `push` hoặc `pull_request`, sau đó lưu trữ kết quả đầu ra `.jar` bằng `actions/upload-artifact`.

## 2. Thử nghiệm Debug lỗi Build (Theo yêu cầu đề bài)
- **Kịch bản gây lỗi:** Thay đổi assertion trong `CalculatorTest.java` thành `assertEquals(10, calc.add(2, 3));` rồi đẩy code lên GitHub.
- **Xác minh qua Execution Logs:** 
  1. Quy trình CI trên GitHub Actions sẽ báo thất bại ở bước `Run Maven Test Phase`.
  2. Mở tab **Actions** trên GitHub repository, chọn workflow bị lỗi.
  3. Kiểm tra chi tiết **Execution Logs** tại bước `mvn test`, log sẽ chỉ rõ test case `testAdd()` bị lỗi với thông báo `Expected: 10, Actual: 5`.

## 3. Cách chạy dự án
Chạy lệnh sau tại thư mục gốc của bài tập:
```bash
./run.sh