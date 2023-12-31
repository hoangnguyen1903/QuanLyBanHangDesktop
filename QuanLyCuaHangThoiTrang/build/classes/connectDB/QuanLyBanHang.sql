USE [master]
GO
/****** Object:  Database [QuanLyBanHang]    Script Date: 11/6/2023 11:40:36 PM ******/
CREATE DATABASE [QuanLyBanHang]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QuanLyBanHang', FILENAME = N'D:\HK1-NAM3\PTUD\SQLServer\QuanLyBanHang.mdf' , SIZE = 73728KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QuanLyBanHang_log', FILENAME = N'D:\HK1-NAM3\PTUD\SQLServer\QuanLyBanHang_log.ldf' , SIZE = 73728KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [QuanLyBanHang] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QuanLyBanHang].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ARITHABORT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QuanLyBanHang] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QuanLyBanHang] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QuanLyBanHang] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QuanLyBanHang] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET RECOVERY FULL 
GO
ALTER DATABASE [QuanLyBanHang] SET  MULTI_USER 
GO
ALTER DATABASE [QuanLyBanHang] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QuanLyBanHang] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QuanLyBanHang] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QuanLyBanHang] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QuanLyBanHang] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QuanLyBanHang] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [QuanLyBanHang] SET QUERY_STORE = OFF
GO
USE [QuanLyBanHang]
GO
/****** Object:  Table [dbo].[ChatLieu]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChatLieu](
	[maChatLieu] [nvarchar](50) NOT NULL,
	[tenChatLieu] [nvarchar](255) NULL,
	[xuatXu] [nvarchar](255) NULL,
 CONSTRAINT [PK_ChatLieu] PRIMARY KEY CLUSTERED 
(
	[maChatLieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[maCTHD] [nvarchar](50) NOT NULL,
	[maSP] [nvarchar](50) NOT NULL,
	[maHD] [nvarchar](50) NOT NULL,
	[soLuong] [int] NOT NULL,
	[giaBan] [money] NOT NULL,
	[thanhTien] [money] NOT NULL,
 CONSTRAINT [PK_ChiTietHoaDon_1] PRIMARY KEY CLUSTERED 
(
	[maCTHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChuongTrinhKhuyenMai]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChuongTrinhKhuyenMai](
	[maCTKM] [nvarchar](50) NOT NULL,
	[tenCTKM] [nvarchar](255) NULL,
	[soTienToiThieu] [money] NOT NULL,
	[giamGia] [int] NOT NULL,
	[ngayBatDau] [datetime] NOT NULL,
	[ngayKetThuc] [datetime] NOT NULL,
 CONSTRAINT [PK_ChuongTrinhKhuyenMai] PRIMARY KEY CLUSTERED 
(
	[maCTKM] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DanhMucSanPham]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DanhMucSanPham](
	[maDanhMuc] [nvarchar](50) NOT NULL,
	[tenDanhMuc] [nvarchar](255) NULL,
 CONSTRAINT [PK_DanhMucSanPham] PRIMARY KEY CLUSTERED 
(
	[maDanhMuc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DonYeuCauDoiTra]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DonYeuCauDoiTra](
	[maDYCDT] [nvarchar](50) NOT NULL,
	[maCTHD] [nvarchar](50) NOT NULL,
	[maNV] [nvarchar](50) NOT NULL,
	[thoiGianDoiTra] [datetime] NOT NULL,
	[hinhThucDoiTra] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_DonYeuCauDoiTra] PRIMARY KEY CLUSTERED 
(
	[maDYCDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHD] [nvarchar](50) NOT NULL,
	[maKH] [nvarchar](50) NOT NULL,
	[maNV] [nvarchar](50) NOT NULL,
	[maCTKM] [nvarchar](50) NULL,
	[ngayLapHD] [datetime] NOT NULL,
	[thueVAT] [int] NOT NULL,
	[tongTien] [money] NOT NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[maHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[maKH] [nvarchar](50) NOT NULL,
	[hoTen] [nvarchar](255) NULL,
	[gioiTinh] [nvarchar](255) NULL,
	[soDienThoai] [nchar](10) NOT NULL,
	[diaChi] [nvarchar](255) NULL,
 CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[maKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MatHangNhap]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MatHangNhap](
	[maNCC] [nvarchar](50) NOT NULL,
	[maSP] [nvarchar](50) NOT NULL,
	[soLuongNhap] [int] NOT NULL,
	[ngayNhap] [date] NULL,
 CONSTRAINT [PK_MatHangNhap] PRIMARY KEY CLUSTERED 
(
	[maNCC] ASC,
	[maSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[maNCC] [nvarchar](50) NOT NULL,
	[tenNCC] [nvarchar](255) NULL,
	[soDienThoai] [nchar](10) NULL,
	[diaChi] [nvarchar](255) NULL,
	[tinhTrang] [nvarchar](255) NULL,
 CONSTRAINT [PK_NhaCungCap] PRIMARY KEY CLUSTERED 
(
	[maNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNV] [nvarchar](50) NOT NULL,
	[hoTen] [nvarchar](255) NULL,
	[gioiTinh] [nvarchar](255) NULL,
	[ngaySinh] [date] NULL,
	[email] [nvarchar](50) NOT NULL,
	[soDienThoai] [nchar](10) NOT NULL,
	[caLamViec] [nchar](10) NOT NULL,
	[diaChi] [nvarchar](255) NULL,
	[chucVu] [nvarchar](255) NULL,
	[tinhTrang] [nvarchar](255) NULL,
 CONSTRAINT [PK_NhanVien] PRIMARY KEY CLUSTERED 
(
	[maNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[maSP] [nvarchar](50) NOT NULL,
	[tenSP] [nvarchar](255) NULL,
	[kichThuoc] [varchar](255) NULL,
	[mauSac] [nvarchar](255) NULL,
	[donGia] [money] NOT NULL,
	[tinhTrang] [nvarchar](255) NULL,
	[soLuongTonKho] [int] NULL,
	[maChatLieu] [nvarchar](50) NOT NULL,
	[maThuongHieu] [nvarchar](50) NOT NULL,
	[maDanhMuc] [nvarchar](50) NOT NULL,
	[imgUrl] [nvarchar](max) NULL,
 CONSTRAINT [PK_SanPham] PRIMARY KEY CLUSTERED 
(
	[maSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[tenTaiKhoan] [nchar](10) NOT NULL,
	[matKhau] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[tenTaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThuongHieu]    Script Date: 11/6/2023 11:40:36 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThuongHieu](
	[maThuongHieu] [nvarchar](50) NOT NULL,
	[tenThuongHieu] [nvarchar](255) NULL,
 CONSTRAINT [PK_ThuongHieu] PRIMARY KEY CLUSTERED 
(
	[maThuongHieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChatLieu] ([maChatLieu], [tenChatLieu], [xuatXu]) VALUES (N'CL27102301', N'Cotton', N'Việt Nam')
INSERT [dbo].[ChatLieu] ([maChatLieu], [tenChatLieu], [xuatXu]) VALUES (N'CL27102302', N'Polyester', N'Thái Lan')
INSERT [dbo].[ChatLieu] ([maChatLieu], [tenChatLieu], [xuatXu]) VALUES (N'CL27102303', N'Da bò', N'Việt Nam')
INSERT [dbo].[ChatLieu] ([maChatLieu], [tenChatLieu], [xuatXu]) VALUES (N'CL27102304', N'
Flannel', N'Việt Nam')
GO
INSERT [dbo].[ChuongTrinhKhuyenMai] ([maCTKM], [tenCTKM], [soTienToiThieu], [giamGia], [ngayBatDau], [ngayKetThuc]) VALUES (N'CTKM2710231', N'Chương trình khuyến mãi giảm giá 10% cho hoá đơn trên 500K bắt đầu từ ngày 27-10-2023 đến ngày 30-11-2023', 500000.0000, 10, CAST(N'2023-10-27T00:00:00.000' AS DateTime), CAST(N'2023-11-30T00:00:00.000' AS DateTime))
INSERT [dbo].[ChuongTrinhKhuyenMai] ([maCTKM], [tenCTKM], [soTienToiThieu], [giamGia], [ngayBatDau], [ngayKetThuc]) VALUES (N'CTKM2710232', N'Chương trình khuyến mãi giảm giá 10% cho hoá đơn trên 500K bắt đầu từ ngày 27-10-2023 đến ngày 30-11-2023', 800000.0000, 20, CAST(N'2023-11-30T00:00:00.000' AS DateTime), CAST(N'2023-12-30T00:00:00.000' AS DateTime))
INSERT [dbo].[ChuongTrinhKhuyenMai] ([maCTKM], [tenCTKM], [soTienToiThieu], [giamGia], [ngayBatDau], [ngayKetThuc]) VALUES (N'CTKM2710233', N'Chương trình khuyến mãi giảm giá 10% cho hoá đơn trên 500K bắt đầu từ ngày 27-10-2023 đến ngày 30-11-2023', 1000000.0000, 25, CAST(N'2023-11-27T00:00:00.000' AS DateTime), CAST(N'2023-12-30T00:00:00.000' AS DateTime))
GO
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102301', N'Áo thun nam')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102302', N'Áo sơ mi nam')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102303', N'Áo vest nam')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102304', N'Áo khoác nam')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102305', N'Áo hoodie nam')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102306', N'Áo thun nữ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102307', N'Áo sơ mi nữ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102308', N'Áo vest nữ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102309', N'Áo khoác nữ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102310', N'Áo hoodie nữ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102311', N'Vớ')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102312', N'Giày')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102313', N'Nón')
INSERT [dbo].[DanhMucSanPham] ([maDanhMuc], [tenDanhMuc]) VALUES (N'DM27102314', N'Thắt lưng')
GO
INSERT [dbo].[KhachHang] ([maKH], [hoTen], [gioiTinh], [soDienThoai], [diaChi]) VALUES (N'KH271023001', N'Trần Văn Bình', N'Nam', N'0908070605', N'Gò Công, Tiền Giang')
INSERT [dbo].[KhachHang] ([maKH], [hoTen], [gioiTinh], [soDienThoai], [diaChi]) VALUES (N'KH27102302', N'Nguyễn Thị Thuỳ Trang', N'Nữ', N'0301020405', N'Gò Công, Tiền Giang')
GO
INSERT [dbo].[MatHangNhap] ([maNCC], [maSP], [soLuongNhap], [ngayNhap]) VALUES (N'NCC021123002829', N'SP031123003914', 5, CAST(N'2023-11-06' AS Date))
INSERT [dbo].[MatHangNhap] ([maNCC], [maSP], [soLuongNhap], [ngayNhap]) VALUES (N'NCC021123002829', N'SP041123110847', 50, CAST(N'2023-04-04' AS Date))
INSERT [dbo].[MatHangNhap] ([maNCC], [maSP], [soLuongNhap], [ngayNhap]) VALUES (N'NCC021123002829', N'SP2710230002', 150, CAST(N'2022-01-30' AS Date))
INSERT [dbo].[MatHangNhap] ([maNCC], [maSP], [soLuongNhap], [ngayNhap]) VALUES (N'NCC021123173012', N'SP031123003914', 20, CAST(N'2023-11-06' AS Date))
INSERT [dbo].[MatHangNhap] ([maNCC], [maSP], [soLuongNhap], [ngayNhap]) VALUES (N'NCC021123173012', N'SP041123112044', 10, CAST(N'2022-05-09' AS Date))
INSERT [dbo].[MatHangNhap] ([maNCC], [maSP], [soLuongNhap], [ngayNhap]) VALUES (N'NCC27102301', N'SP041123111053', 20, CAST(N'2023-02-03' AS Date))
INSERT [dbo].[MatHangNhap] ([maNCC], [maSP], [soLuongNhap], [ngayNhap]) VALUES (N'NCC27102305', N'SP041123112044', 10, CAST(N'2022-05-09' AS Date))
INSERT [dbo].[MatHangNhap] ([maNCC], [maSP], [soLuongNhap], [ngayNhap]) VALUES (N'NCC27102305', N'SP041123113244', 200, CAST(N'2023-11-10' AS Date))
GO
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC021123002829', N'Cty TNHH Minh Thanh', N'0345254852', N'Quận Bình Thạnh, TPHCM', N'Đang nhập')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC021123173012', N'Cty TNHH Kinh Đô', N'0345682887', N'Quận Bình Thạnh, TPHCM', N'Đang nhập')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC27102301', N'Cty TNHH Việt Tiến', N'1234567890', N'Quận Gò Vấp, TPHCM', N'Ngừng nhập')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC27102302', N'Cty TNHH Việt Tiến', N'1234567890', N'Quận Gò Vấp, TPHCM', N'Đang nhập')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC27102303', N'Cty TNHH Việt Tiến', N'1234567890', N'Quận Gò Vấp, TPHCM', N'Đang nhập')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC27102304', N'Cty TNHH Việt Tiến', N'1234567890', N'Quận Gò Vấp, TPHCM', N'Đang nhập')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC27102305', N'Cty TNHH Việt Tiến', N'1234567890', N'Quận Gò Vấp, TPHCM', N'Đang nhập')
INSERT [dbo].[NhaCungCap] ([maNCC], [tenNCC], [soDienThoai], [diaChi], [tinhTrang]) VALUES (N'NCC27102306', N'Cty TNHH Anh Thành', N'1234567890', N'Quận Gò Vấp, TPHCM', N'Ngừng nhập')
GO
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [gioiTinh], [ngaySinh], [email], [soDienThoai], [caLamViec], [diaChi], [chucVu], [tinhTrang]) VALUES (N'NV27102301', N'Nguyễn Huy Hoàng', N'Nam', CAST(N'2003-12-01' AS Date), N'hoang12@gmail.com', N'0123456789', N'Ca 1      ', N'Quận Tân Bình, TPHCM', N'Nhân viên', N'Đang làm việc')
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [gioiTinh], [ngaySinh], [email], [soDienThoai], [caLamViec], [diaChi], [chucVu], [tinhTrang]) VALUES (N'NV27102302', N'Trần Gia Huy', N'Nam', CAST(N'2003-10-28' AS Date), N'huy10@gmail.com', N'0312456789', N'Ca 2      ', N'Quận Tân Bình, TPHCM', N'Nhân viên', N'Đang làm việc')
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [gioiTinh], [ngaySinh], [email], [soDienThoai], [caLamViec], [diaChi], [chucVu], [tinhTrang]) VALUES (N'NV27102303', N'Đinh Nguyên Chung', N'Nam', CAST(N'2003-12-30' AS Date), N'chung18@gmail.com', N'0912345678', N'Ca 1      ', N'Quận Tân Bình, TPHCM', N'Nhân viên', N'Đang làm việc')
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [gioiTinh], [ngaySinh], [email], [soDienThoai], [caLamViec], [diaChi], [chucVu], [tinhTrang]) VALUES (N'NV27102304', N'Trần Hiển Vinh', N'Nam', CAST(N'2003-12-02' AS Date), N'vinh02@gmail.com', N'071235689 ', N'Ca 2      ', N'Quận Tân Bình, TPHCM', N'Nhân viên', N'Đang làm việc')
INSERT [dbo].[NhanVien] ([maNV], [hoTen], [gioiTinh], [ngaySinh], [email], [soDienThoai], [caLamViec], [diaChi], [chucVu], [tinhTrang]) VALUES (N'NV27102305', N'Đỗ Chí Tường', N'Nữ', CAST(N'2003-10-27' AS Date), N'tuong27@gmail.com', N'1234567890', N'          ', N'Quận Tân Bình, TPHCM', N'Quản lý', N'Đang làm việc')
GO
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP031123003914', N'SP021123202616', N'M', N'Đen', 100000.0000, N'Đang bán', 100000, N'CL27102301', N'TH27102301', N'DM27102305', N'C:\Users\MY PC\OneDrive\Hình ảnh\Hình nền\anh2.jpg')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP041123103154', N'Áo thun nam tay ngắn', N'XL', N'Trắng', 1000.0000, N'Đang bán', 100, N'CL27102301', N'TH27102301', N'DM27102304', N'D:\HK1-NAM3\PTUD\AppDev_Project\QuanLyCuaHangThoiTrang\src\pic\labelAnh.png')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP041123110521', N'Quần jean nam', N'L', N'Trắng', 100.0000, N'Đang bán', 10, N'CL27102301', N'TH27102301', N'DM27102305', N'C:\Users\MY PC\OneDrive\Hình ảnh\Hình nền\logo.jpg')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP041123110847', N'Áo nam phong cách', N'L', N'Xám', 20000.0000, N'Đang bán', 20000, N'CL27102303', N'TH27102303', N'DM27102304', N'C:\Users\MY PC\OneDrive\Hình ảnh\Hình nền\Hình nền 26.jpg')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP041123111053', N'Áo nam tay dài', N'L', N'Trắng', 1000.0000, N'Đang bán', 5, N'CL27102301', N'TH27102301', N'DM27102306', N'C:\Users\MY PC\OneDrive\Hình ảnh\Hình nền\Hình nền 25.jpg')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP041123111720', N'Áo nữ', N'L', N'Trắng', 10000.0000, N'Ngừng bán', 10, N'CL27102301', N'Th27102301', N'DM27102303', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP041123112044', N'Quần jean nữ', N'L', N'Đen', 40000.0000, N'Ngừng bán', 35000, N'CL27102301', N'TH27102301', N'DM27102302', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP041123112633', N'Áo nam họa tiết', N'L', N'Đen', 10000.0000, N'Đang bán', 10000, N'CL27102302', N'TH27102301', N'DM27102306', N'C:\Users\MY PC\OneDrive\Hình ảnh\Hình nền\horse-1804425_1280.jpg')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP041123113000', N'Quần nam thêu', N'XL', N'Trắng', 900000.0000, N'Ngừng bán', 50, N'CL27102301', N'TH27102301', N'DM27102301', N'C:\Users\MY PC\OneDrive\Hình ảnh\Hình nền\Hình nền 28.jpg')
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP041123113244', N'Áo polo', N'XL', N'Đen', 25000.0000, N'Ngừng bán', 20000, N'CL27102301', N'TH27102305', N'DM27102306', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP2710230002', N'Áo thun nam tay ngắn hoạ tiết thêu', N'XS', N'Đen', 589000.0000, N'Đang bán', 10, N'CL27102301', N'TH27102301', N'DM27102301', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP2710230003', N'Áo thun nam tay ngắn hoạ tiết thêu', N'XS', N'Xám', 589000.0000, N'Đang bán', 10, N'CL27102301', N'TH27102301', N'DM27102301', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP2710230004', N'Áo thun nam tay ngắn hoạ tiết thêu', N'S', N'Trắng', 589000.0000, N'Đang bán', 10, N'CL27102301', N'TH27102301', N'DM27102301', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP2710230005', N'Áo thun nam tay ngắn hoạ tiết thêu', N'S', N'Đen', 589000.0000, N'Đang bán', 10, N'CL27102301', N'TH27102301', N'DM27102301', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP2710230006', N'Áo thun nam tay ngắn hoạ tiết thêu', N'S', N'Xám', 589000.0000, N'Đang bán', 10, N'CL27102301', N'TH27102301', N'DM27102301', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP2710230007', N'Áo thun nam tay ngắn hoạ tiết thêu', N'M', N'Trắng', 5889000.0000, N'Đang bán', 10, N'CL27102301', N'TH27102301', N'DM27102301', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP2710230008', N'Áo thun nam tay ngắn hoạ tiết thêu', N'M', N'Đen', 5890000.0000, N'Đang bán', 10, N'CL27102301', N'TH27102301', N'DM27102301', NULL)
INSERT [dbo].[SanPham] ([maSP], [tenSP], [kichThuoc], [mauSac], [donGia], [tinhTrang], [soLuongTonKho], [maChatLieu], [maThuongHieu], [maDanhMuc], [imgUrl]) VALUES (N'SP2710230009', N'Áo thun nam tay ngắn hoạ tiết thêu', N'M', N'Xám', 5890000.0000, N'Đang bán', 10, N'CL27102301', N'TH27102301', N'DM27102301', NULL)
GO
INSERT [dbo].[TaiKhoan] ([tenTaiKhoan], [matKhau]) VALUES (N'0123456789', N'hoang01122003')
INSERT [dbo].[TaiKhoan] ([tenTaiKhoan], [matKhau]) VALUES (N'0312456789', N'huy28102003')
INSERT [dbo].[TaiKhoan] ([tenTaiKhoan], [matKhau]) VALUES (N'071235689 ', N'vinh02122003')
INSERT [dbo].[TaiKhoan] ([tenTaiKhoan], [matKhau]) VALUES (N'0912345678', N'chung30122003')
INSERT [dbo].[TaiKhoan] ([tenTaiKhoan], [matKhau]) VALUES (N'1234567890', N'tuong27102003')
GO
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102301', N'Elise')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102302', N'Vascara')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102303', N'Juno')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102304', N'IVY Moda')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102305', N'HNOSS')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102306', N'FM Style')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102307', N'Adam Store')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102308', N'SSStutter')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102309', N'Routine')
INSERT [dbo].[ThuongHieu] ([maThuongHieu], [tenThuongHieu]) VALUES (N'TH27102310', N'NEM Fashion')
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_HoaDon] FOREIGN KEY([maHD])
REFERENCES [dbo].[HoaDon] ([maHD])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_HoaDon]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD  CONSTRAINT [FK_ChiTietHoaDon_SanPham] FOREIGN KEY([maSP])
REFERENCES [dbo].[SanPham] ([maSP])
GO
ALTER TABLE [dbo].[ChiTietHoaDon] CHECK CONSTRAINT [FK_ChiTietHoaDon_SanPham]
GO
ALTER TABLE [dbo].[DonYeuCauDoiTra]  WITH CHECK ADD  CONSTRAINT [FK_DonYeuCauDoiTra_ChiTietHoaDon] FOREIGN KEY([maCTHD])
REFERENCES [dbo].[ChiTietHoaDon] ([maCTHD])
GO
ALTER TABLE [dbo].[DonYeuCauDoiTra] CHECK CONSTRAINT [FK_DonYeuCauDoiTra_ChiTietHoaDon]
GO
ALTER TABLE [dbo].[DonYeuCauDoiTra]  WITH CHECK ADD  CONSTRAINT [FK_DonYeuCauDoiTra_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[DonYeuCauDoiTra] CHECK CONSTRAINT [FK_DonYeuCauDoiTra_NhanVien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_ChuongTrinhKhuyenMai] FOREIGN KEY([maCTKM])
REFERENCES [dbo].[ChuongTrinhKhuyenMai] ([maCTKM])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_ChuongTrinhKhuyenMai]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_KhachHang] FOREIGN KEY([maKH])
REFERENCES [dbo].[KhachHang] ([maKH])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_KhachHang]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([maNV])
REFERENCES [dbo].[NhanVien] ([maNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[MatHangNhap]  WITH CHECK ADD  CONSTRAINT [FK_MatHangNhap_NhaCungCap] FOREIGN KEY([maNCC])
REFERENCES [dbo].[NhaCungCap] ([maNCC])
GO
ALTER TABLE [dbo].[MatHangNhap] CHECK CONSTRAINT [FK_MatHangNhap_NhaCungCap]
GO
ALTER TABLE [dbo].[MatHangNhap]  WITH CHECK ADD  CONSTRAINT [FK_MatHangNhap_SanPham] FOREIGN KEY([maSP])
REFERENCES [dbo].[SanPham] ([maSP])
GO
ALTER TABLE [dbo].[MatHangNhap] CHECK CONSTRAINT [FK_MatHangNhap_SanPham]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_TaiKhoan] FOREIGN KEY([soDienThoai])
REFERENCES [dbo].[TaiKhoan] ([tenTaiKhoan])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_TaiKhoan]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_ChatLieu] FOREIGN KEY([maChatLieu])
REFERENCES [dbo].[ChatLieu] ([maChatLieu])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_ChatLieu]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_DanhMucSanPham] FOREIGN KEY([maDanhMuc])
REFERENCES [dbo].[DanhMucSanPham] ([maDanhMuc])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_DanhMucSanPham]
GO
ALTER TABLE [dbo].[SanPham]  WITH CHECK ADD  CONSTRAINT [FK_SanPham_ThuongHieu] FOREIGN KEY([maThuongHieu])
REFERENCES [dbo].[ThuongHieu] ([maThuongHieu])
GO
ALTER TABLE [dbo].[SanPham] CHECK CONSTRAINT [FK_SanPham_ThuongHieu]
GO
USE [master]
GO
ALTER DATABASE [QuanLyBanHang] SET  READ_WRITE 
GO
