CREATE PROCEDURE [dbo].[sp_TimNV]
@x nchar(10)
AS
	DECLARE @MACN nvarchar(10), @HO nvarchar(40), @TEN nvarchar(10)
	IF exists(select 1 from dbo.NhanVien where NhanVien.MANV = @x)
		BEGIN
			SELECT TENCN = (SELECT TENCN FROM dbo.ChiNhanh), HO, TEN
			FROM dbo.NhanVien
		END
	ELSE
		IF exists(select 1 from LINK1.NGANHANG.DBO.NhanVien
		where MANV = @x)
			BEGIN
				SELECT @MACN = MACN, @HO = HO, @TEN =TEN 
				FROM LINK1.NGANHANG.DBO.NhanVien where MANV = @x
				SELECT TENCN, HO=@HO, TEN=@TEN
				FROM LINK1.NGANHANG.DBO.ChiNhanh where MACN = @MACN
			END
	ELSE --- khong co nv
		Raiserror('Ma nhan vien ban tim khong co', 16, 1)