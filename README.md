Hệ thống Website bán nước hoa
Trang web được xây dựng bằng công nghê SpringBoot + Thymeleaf và các công nghệ liên quan
Trang web được chia thành các chức năng chính được trang bị cho các vai trò như: Guest, Customer, Vendor, Admin
Guest: Tìm kiếm, xem sản phẩm theo danh mục, nhãn hiệu, chức năng đăng kí tạo tài khoản
Customer: Đăng nhập, đăng xuất, tìm kiếm sản phẩm, thêm sản phẩm vào giỏ hàng, thực hiện thanh toán sản phẩm(online hoặc offline), chỉnh sửa thông tin cá nhân, xem lịch sử đơn hàng
Vendor: Quản lí đơn hàng, quản lí danh mục, quản lí sản phẩm, thông kê doanh thu(ngày, tháng, quý)
Admin: Quản trị trang web, thực hiện quản lí các tài khoản

Trang web được xây dựng dựa trên giao diện được xây dựng bằng bootstrap và thymeleaf giúp tăng tính thân thiện với người dùng, hệ thống backend được xây dựng bằng SpringBoot, giúp tăng độ linh hoạt 
cho trang web, ngoài ra còn áp dụng các công nghệ như Spring Security,JWT, thanh toán bằng ví điện tử, đăng nhập với bên thứ ba(Google),...

IT Project
<div align="center" style="color: #2d89ef; font-size: 24px; font-weight: bold;"> Dự án công nghệ thông tin </div>

🎯 Mục Lục
Yêu Cầu
Hướng Dẫn Cài Đặt
Sử Dụng
Cấu Trúc Dự Án
Đóng Góp
Giấy Phép


Để bổ sung CSS giúp trang README trông đẹp hơn khi hiển thị trên GitHub (hoặc các nền tảng tương tự), bạn cần sử dụng các thẻ Markdown kết hợp với CSS nội tuyến trong trường hợp không thể chỉnh sửa trực tiếp giao diện GitHub. Dưới đây là một số cách trình bày Markdown cho README đẹp mắt:

IT Project
<div align="center" style="color: #2d89ef; font-size: 24px; font-weight: bold;"> Dự án công nghệ thông tin </div>
🎯 Mục Lục
Yêu Cầu
Hướng Dẫn Cài Đặt
Sử Dụng
Cấu Trúc Dự Án
Đóng Góp
Giấy Phép
✅ Yêu Cầu
<div style="background: #f9f9f9; padding: 10px; border-radius: 8px; border: 1px solid #ddd;"> Trước khi cài đặt, đảm bảo bạn đã cài đặt các công cụ sau: </div>
🛠️ Git
🛠️ Java JDK (Phiên bản 11 trở lên)
🛠️ Maven
🛠️ Spring Boot (Đã tích hợp trong Maven)
🛠️ Trình soạn thảo mã như IntelliJ IDEA hoặc VS Code, SpringToolSuite

Để bổ sung CSS giúp trang README trông đẹp hơn khi hiển thị trên GitHub (hoặc các nền tảng tương tự), bạn cần sử dụng các thẻ Markdown kết hợp với CSS nội tuyến trong trường hợp không thể chỉnh sửa trực tiếp giao diện GitHub. Dưới đây là một số cách trình bày Markdown cho README đẹp mắt:

IT Project
<div align="center" style="color: #2d89ef; font-size: 24px; font-weight: bold;"> Dự án công nghệ thông tin </div>
🎯 Mục Lục
Yêu Cầu
Hướng Dẫn Cài Đặt
Sử Dụng
Cấu Trúc Dự Án
Đóng Góp
Giấy Phép
✅ Yêu Cầu
<div style="background: #f9f9f9; padding: 10px; border-radius: 8px; border: 1px solid #ddd;"> Trước khi cài đặt, đảm bảo bạn đã cài đặt các công cụ sau: </div>
🛠️ Git
🛠️ Java JDK (Phiên bản 11 trở lên)
🛠️ Maven
🛠️ Spring Boot (Đã tích hợp trong Maven)
🛠️ Trình soạn thảo mã như IntelliJ IDEA hoặc VS Code
🛠️ Hướng Dẫn Cài Đặt
Thực hiện các bước sau để thiết lập dự án:
Thực hiện các bước sau để thiết lập dự án:

Clone repository:

bash
Sao chép mã
git clone https://github.com/SweetLove1643/ITProject.git  
cd ITProject  
Xây dựng dự án bằng Maven:

bash
Sao chép mã
mvn clean install  
Chạy ứng dụng:

bash
Sao chép mã
mvn spring-boot:run  
Truy cập ứng dụng:

Mở trình duyệt web và truy cập: http://localhost:8080
🚀 Sử Dụng
Sau khi chạy ứng dụng, bạn sẽ thấy giao diện chính hiển thị trên trình duyệt.
Sử dụng thanh điều hướng để khám phá các tính năng của dự án.
📂 Cấu Trúc Dự Án
css
Sao chép mã
ITProject/
├── src/
│   ├── main/
│   │   ├── java/          # Mã nguồn Java
│   │   ├── resources/     # Tệp cấu hình & giao diện
│   └── test/              # Các bài kiểm thử
├── pom.xml                # Tệp cấu hình Maven
🤝 Đóng Góp
Hoan nghênh mọi đóng góp! Vui lòng làm theo các bước sau:

Fork repository.
Tạo một nhánh mới để phát triển tính năng của bạn:
bash
Sao chép mã
git checkout -b ten-tinh-nang  
Commit các thay đổi của bạn và đẩy lên fork:
bash
Sao chép mã
git push origin ten-tinh-nang  
Gửi yêu cầu Pull Request (PR).
📜 Giấy Phép
Dự án này được cấp phép theo giấy phép MIT. Xem thêm trong tệp LICENSE để biết chi tiết.


