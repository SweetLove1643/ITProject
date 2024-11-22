INSERT INTO Categories (category_name) VALUES
	('Nam'),
	('Nữ'),
	('Unisex');

INSERT INTO Suppliers (supplier_name, Address, phone_number) VALUES
	('Bvlgari Fragrance Supply Co.', '93 Đinh Tiên Hoàng, Quận 1, TP. Hồ Chí Minh', '0901234567'),
	('Yves Saint Laurent Distributors', '45 Lý Tự Trọng, Quận 1, TP. Hồ Chí Minh', '0912345678'),
	('Chanel Perfume Partners', '88 Đồng Khởi, Quận 1, TP. Hồ Chí Minh', '0923456789'),
	('Dior Fragrance Distributors', '26 Lê Lợi, Quận 1, TP. Hồ Chí Minh', '0934567890'),
	('Kilian Haute Parfum', '6 Thái Văn Lung, Quận 1, TP. Hồ Chí Minh', '0945678901'),
	('Versace Fragrance Enterprises', '45 Lý Tự Trọng, Quận 1, TP. Hồ Chí Minh', '0956789012'),
	('Jean Paul Gaultier Fragrance Solutions', '92 Hai Bà Trưng, Quận 1, TP. Hồ Chí Minh', '0967890123'),
	('Tom Ford Premium Fragrance', '31 Lê Duẩn, Quận 1, TP. Hồ Chí Minh', '0978901234');

INSERT INTO Brands (brand_name) VALUES
	('BVLGARI'),
	('Yves Saint Laurent'),
	('Chanel'),
	('Dior'),
	('Kilian'),
	('Versace'),
	('Jean Paul Gaultier'),
	('Tom Ford');

INSERT INTO Products (product_name, categoryid, SupplierID, BrandID, Price, Description, ImageURL, stock_quantity) VALUES
    ('Bvlgari Aqva Pour Homme', 1, 1, 1, 2450000, 'Hương thơm biển cả tươi mát với cam bergamot và rong biển', 'https://product.hstatic.net/1000340570/product/bvlgari-aqva-pour-homme-100ml_a809dabd88c246088c256ff0f18658cb_master.jpg', 5),

    ('Yves Saint Laurent Mon Paris', 2, 2, 2, 2950000, 'Hương trái cây ngọt ngào kết hợp với hoa nhài và xạ hương', 'https://product.hstatic.net/1000340570/product/yves-saint-laurent-mon-paris-90ml-edp_b942bd34a30e4d029b6218e811cc57ed_master.jpg', 30),

    ('Chanel Chance Eau Tendre', 2, 3, 3, 3800000, 'Mùi hương thanh mát với quả bưởi, hoa hồng và xạ hương trắng', 'https://product.hstatic.net/1000340570/product/chanel-chance-eau-tendre-eau-de-toilette-50ml_e108c312d4854ff88fe537f4360993c3_master.jpg', 50),

    ('Dior Miss Dior Blooming Bouquet', 2, 4, 4, 2500000, 'Hương hoa mẫu đơn và hoa hồng thanh thoát, dịu dàng', 'https://product.hstatic.net/1000340570/product/dior-miss-dior-blooming-bouquet_5859c56197694d518431954615a3d6f4_master.jpg', 40),

    ('Kilian Black Phantom', 3, 5, 5, 7350000, 'Hương cà phê, rượu rum và caramel tạo nên sự huyền bí và quyền rũ', 'https://product.hstatic.net/1000340570/product/kilian-black-phantom-memento-mori_45baadc56dd147599df3860c9b80e852_master.jpg', 13),

    ('Versace Dylan Blue', 1, 6, 6, 2420000, 'Hương thơm hiện đại với quả bưởi, gỗ và gia vị', 'https://product.hstatic.net/1000340570/product/dylan-blue_919771324a4b46998825d6dfbdc5764f_master.jpg', 50),

    ('Jean Paul Gaultier Classique Pin-up', 2, 7, 7, 2600000, 'Hương hoa cam, gừng và vani mang đến sự gợi cảm', 'https://product.hstatic.net/1000340570/product/jean_paul_gaultier_classique_pin_up_c02dcc3fa3e14b3e9b381be1a0b53625_master.jpg', 35),

    ('Versace Crystal Noir', 2, 6, 6, 2442000, 'Hương cay nồng và ấm áp với tiêu đen và hồ phách', 'https://product.hstatic.net/1000340570/product/versace-crystal-noir-edt_2a522575d57449a883defc16e0d116ac_master.jpg', 25),

    ('Chanel Allure Homme Sport Eau Extreme', 1, 3, 3, 3650000, 'Hương tươi mát và năng động với quả quýt, vani và hồ phách', 'https://product.hstatic.net/1000340570/product/chanel-allure-homme-sport-eau-de-toilette-100ml_b346b3a4de84438bb866718bb8711d2c_master.jpg', 60),

    ('Dior Hypnotic Poison', 2, 4, 4, 3100000, 'Hương vani ngọt ngào kết hợp với hạnh nhân và hoa nhài', 'https://down-vn.img.susercontent.com/file/vn-11134207-7r98o-ltdcvvpj6404d1.webp', 30),

    ('Bvlgari Goldea Eau de Parfum', 2, 1, 1, 3600000, 'Hương xạ hương và hổ phách tạo nên sự quý phái', 'https://product.hstatic.net/1000340570/product/bvlgari-goldea-eau-de-parfum-90ml_fc6cdf1799544a66a96caf2b9f79a762_master.jpg', 20),

    ('Yves Saint Laurent Kouros', 1, 2, 2, 2990000, 'Hương thơm cổ điển từ hương liệu thảo mộc và gỗ đàn hương', 'https://nuochoapicpic.com/upload/san-pham/nuoc-hoa-ysl-kouros-edt-1.jpg', 40),

    ('Tom Ford Noir Extreme', 1, 8, 8, 3800000, 'Hương gỗ và bổ phách đậm chất phương Đông, đầy quyền rũ và sang trọng', 'https://orchard.vn/wp-content/uploads/2024/07/tom-ford-noir-extreme-edp_3.jpg', 30),

    ('Chanel Coco Eau de Toilette', 2, 3, 3, 3050000, 'Nước hoa sang trọng và quyến rũ với hương hoa hồng, hoa nhài và đinh hương. Hương cuối ấm áp của hổ phách và vani', 'https://product.hstatic.net/1000340570/product/chanel-coco-eau-de-toilette_a621a91cdae54dd4837cec6677a67730_master.jpg', 10),

    ('Dior Sauvage Eau de Parfum', 1, 4, 4, 3800000, 'Hương thơm tươi mới và táo bạo với các nốt hương cam bergamot, tiêu Tứ Xuyên và ambroxan', 'https://product.hstatic.net/1000340570/product/dior-sauvage-eau-de-parfum-100ml_e1c611f46daa451f8a159c1652c8d6c1_master.jpg', 25),

    ('Chanel Bleu de Chanel Eau de Parfum', 1, 3, 3, 3500000, 'Mùi hương gỗ thơm với nốt hương cam chanh và gỗ tuyết tùng, phù hợp cho buổi tối', 'https://product.hstatic.net/1000340570/product/chanel-bleu-de-chanel-eau-de-parfum-100ml_d94a8cd0feb743b59a4e612a651b7390_master.jpg', 30),

    ('Versace Eros', 1, 6, 6, 2590000, 'Mùi hương mạnh mẽ với bạc hà, chanh, táo xanh và đậu tonka, lý tưởng cho phái mạnh tự tin', 'https://product.hstatic.net/1000340570/product/versace-eros-for-men_e21f596ba1f6467eb39ace8813943882_master.jpg', 22),

    ('Tom Ford Black Orchid', 2, 8, 8, 4000000, 'Hương thơm phong phú với hoa lan đen, ylang-ylang và cam bergamot, đầy quyến rũ', 'https://product.hstatic.net/1000340570/product/tom-ford-black-orchid_4af20be652c44080819ea9e7115f7852_master.jpg', 15),

	('Tom Ford Lost Cherry', 3, 8, 8, 7200000, 'Mùi hương ngọt ngào từ trái cherry, hạnh nhân, hoa nhài và gỗ tuyết tùng, đầy quyến rũ và gợi cảm', 'https://product.hstatic.net/1000340570/product/tom-ford-lost-cherry-edp-100ml_0fa8a03b56ce4cbc88a4cb60aa8ef509_master.jpg', 18);

INSERT INTO Roles (role_name) VALUES
	('ADMIN'),
	('USER');



INSERT INTO Discounts (discount_code, discount_percentage, max_discount_amount, start_date, end_date) VALUES
	('SALE10', 10, 500000, '2024-10-01', '2024-10-31'),
	('SALE30', 30, 700000, '2024-10-01', '2024-10-31'),
	('SALE5', 5, 100000, '2024-11-01', '2024-11-30'),
	('SALE40', 40, 1000000, '2024-11-01', '2024-11-30'),
	('SALE30', 30, 1000000, '2024-12-01', '2024-12-31');



INSERT INTO Orders (UserID, order_date, total_amount, payment_status, payment_method, DiscountID, delivery_status) VALUES
	(1, '2024-10-21 10:30:00', 2600000, 'Đã thanh toán', 'Chuyển khoản', 1, 'Đã giao hàng'),
	(2, '2024-11-01 14:15:00', 6700000, 'Đã thanh toán', 'Chuyển khoản', NULL, 'Đã giao hàng'),
	(3, '2024-11-10 14:00:00', 2590000, 'Đã thanh toán', 'Tiền mặt', NULL, 'Đã giao hàng'),
	(4, '2024-11-17 09:45:00', 4000000, 'Chưa thanh toán', 'Tiền mặt', NULL, 'Đã hủy'),
	(4, '2024-11-17 09:50:00', 4000000, 'Chưa thanh toán', 'Tiền mặt', 3, 'Đang giao hàng'),
	(5, '2024-11-21 16:20:00', 1120000, 'Đã thanh toán', 'Chuyển khoản', 3, 'Chờ xác nhận'),
	(7, '2024-11-21 03:10:00', 2990000, 'Chưa thanh toán', 'Tiền mặt', NULL, 'Chờ xác nhận');

INSERT INTO dbo.order_product
(OrderID, ProductID, Quantity) VALUES
	(1, 7, 1),
	(2, 10, 1),
	(2, 11, 1),
	(3, 17, 1),
	(4, 18, 1),
	(5, 18, 1),
	(6, 18, 1),
	(6, 19, 1),
	(7, 12, 1);

INSERT INTO Cart (UserID, ProductID, Quantity) VALUES
	(1, 7, 1),
	(6, 10, 1),
	(1, 5, 1),
	(2, 10, 1),
	(6, 8, 2),
	(7, 16, 1),
	(5, 16, 1),
	(3, 18, 2);

CREATE TRIGGER AddInvoiceAfterOrderInsert
ON Orders
AFTER INSERT
AS
BEGIN
    -- Thêm dữ liệu vào bảng Invoices cho tất cả các dòng được chèn trong câu lệnh INSERT
    INSERT INTO Invoices (OrderID, invoice_date, total_amount, payment_method)
    SELECT 
        i.OrderID,  -- Lấy OrderID từ bảng Orders
        GETDATE(),  -- Ngày giờ hiện tại khi tạo hóa đơn (thay vì OrderDate, vì InvoiceDate có thể là thời gian tạo hóa đơn)
        i.total_amount - 
            COALESCE(
                LEAST(
                    i.total_amount * d.discount_percentage / 100, 
                    d.max_discount_amount
                ), 
                0
            ) AS FinalAmount,  -- Tính số tiền sau khi giảm giá
        i.payment_method  -- Lấy PaymentMethod từ bảng Orders
    FROM INSERTED i
    LEFT JOIN Discounts d ON i.DiscountID = d.DiscountID;  -- Kết nối với bảng Discounts để lấy thông tin giảm giá
END;

