drop Table [dbo].[KhachHang]
go
SET ANSI_PADDING OFF
go

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[CMND] [nchar](10) NOT NULL,
	[HO] [nvarchar](50) NOT NULL,
	[TEN] [nvarchar](10) NOT NULL,
	[DIACHI] [nvarchar](100) NULL,
	[PHAI] [nvarchar](3) NULL,
	[NGAYCAP] [date] NOT NULL,
	[SODT] [nvarchar](15) NOT NULL,
	[MACN] [nchar](10) NULL,
	[rowguid] [uniqueidentifier] ROWGUIDCOL  NOT NULL
)

GO
ALTER TABLE [dbo].[KhachHang] ADD  CONSTRAINT [MSmerge_df_rowguid_A9C5372516FD4AA28D21D35CF5D8B7B7]  DEFAULT (newsequentialid()) FOR [rowguid]
GO
SET ANSI_NULLS ON

go

SET QUOTED_IDENTIFIER ON

go

SET ANSI_PADDING ON

GO
ALTER TABLE [dbo].[KhachHang] ADD  CONSTRAINT [PK_KhachHang] PRIMARY KEY CLUSTERED 
(
	[CMND] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON)
GO
