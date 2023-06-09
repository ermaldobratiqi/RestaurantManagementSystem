USE [master]
GO

/****** Object:  Database [CRUD1] ******/
CREATE DATABASE [CRUDRSMng]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CRUDRSMng', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\CRUDRSMng.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'CRUDRSMng_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\CRUDRSMng_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [CRUDRSMng] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CRUDRSMng].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CRUDRSMng] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CRUDRSMng] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CRUDRSMng] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CRUDRSMng] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CRUDRSMng] SET ARITHABORT OFF 
GO
ALTER DATABASE [CRUDRSMng] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CRUDRSMng] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CRUDRSMng] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CRUDRSMng] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CRUDRSMng] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CRUDRSMng] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CRUDRSMng] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CRUDRSMng] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CRUDRSMng] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CRUDRSMng] SET  DISABLE_BROKER 
GO
ALTER DATABASE [CRUDRSMng] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CRUDRSMng] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CRUDRSMng] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CRUDRSMng] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CRUDRSMng] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CRUDRSMng] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CRUDRSMng] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CRUDRSMng] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [CRUDRSMng] SET  MULTI_USER 
GO
ALTER DATABASE [CRUDRSMng] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CRUDRSMng] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CRUDRSMng] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CRUDRSMng] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [CRUDRSMng] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [CRUDRSMng] SET QUERY_STORE = OFF
GO
USE [CRUDRSMng]
GO

/* Tabelat */

USE CRUDRSMng
CREATE TABLE [dbo].[Ushqimet](
[UshqimiId] [INT] PRIMARY KEY IDENTITY (1,1),
[EmriUshqimit] [VARCHAR](255) NOT NULL,
[Cmimi] [DECIMAL](10,2) NOT NULL,
[LlojiushqimitId] INT FOREIGN KEY REFERENCES [LlojiUshqimit]([LlojiUshqimitId]) NOT NULL
);


CREATE TABLE [dbo].[LlojiUshqimit](
[LlojiUshqimitId] [INT] PRIMARY KEY,
[LlojiUshqimit] [VARCHAR](255) NOT NULL
);



CREATE TABLE [dbo].[OrderMenu] (
[OrderId] [INT] PRIMARY KEY IDENTITY (1,1),
[EmriUshqimitId] INT FOREIGN KEY REFERENCES [Ushqimet]([UshqimiId]) NOT NULL,
[PerdoruesiId] INT FOREIGN KEY REFERENCES [Perdoruesi]([ID]) NOT NULL,
[DataEPorosis] DATE
)



SELECT * FROM OrderMenu;

SELECT OrderId,u.EmriUshqimit,p.Username,u.Cmimi FROM OrderMenu o inner join Ushqimet u on
o.EmriUshqimitId = u.UshqimiId inner join Perdoruesi p on 
o.PerdoruesiId = p.ID;




INSERT [dbo].[LlojiUshqimit] ([LlojiUshqimitId], [LlojiUshqimit]) VALUES (1, N'Main');
INSERT [dbo].[LlojiUshqimit] ([LlojiUshqimitId], [LlojiUshqimit]) VALUES (2, N'Drinks');
INSERT [dbo].[LlojiUshqimit] ([LlojiUshqimitId], [LlojiUshqimit]) VALUES (3, N'Alcohol');
INSERT [dbo].[LlojiUshqimit] ([LlojiUshqimitId], [LlojiUshqimit]) VALUES (4, N'Dessert');



INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Pizza', 5.00 , 1);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Hamburger', 2.00 , 1);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Pasta', 1.50 , 1);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Lasagne', 4.50 , 1);

INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Ice Tea', 1.00 , 2);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Water', 1.00 , 2);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Coca Cola', 2.00 , 2);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Pepsi', 3.00 , 2);

INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Vodka', 20.00 , 3);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Wine', 50.00 , 3);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Beer', 2.00 , 3);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Wiskey', 30.00 , 3);

INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Ice Cream', 1.00 , 4);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Tiramisu', 3.00 , 4);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Cheese Cake', 2.00 , 4);
INSERT [dbo].[Ushqimet] ([EmriUshqimit], [Cmimi],[LlojiushqimitId]) VALUES (N'Lava Cake', 2.00 , 4);



INSERT [dbo].[OrderMenu] ([EmriUshqimitId],[PerdoruesiId],[DataEPorosis] ) VALUES ( 1 , 1 ,'08-25-2020');


/*Login*/
USE CRUDRSMng

CREATE TABLE [dbo].[Perdoruesi](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](550) NOT NULL,
	[RoliID] [int] NOT NULL,
 CONSTRAINT [PK_Perdoruesi] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[Roli](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Emertimi] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Roli] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'edit.azizi', N'123456', 1)
INSERT [dbo].[Perdoruesi] ([Username], [Password], [RoliID]) VALUES (N'user', N'user', 2)

INSERT [dbo].[Roli] ([Emertimi]) VALUES (N'Manager')
INSERT [dbo].[Roli] ([Emertimi]) VALUES (N'Employee')
ALTER TABLE [dbo].[Perdoruesi]  WITH CHECK ADD  CONSTRAINT [FK_Perdoruesi_Roli] FOREIGN KEY([RoliID])
REFERENCES [dbo].[Roli] ([ID])
GO
ALTER TABLE [dbo].[Perdoruesi] CHECK CONSTRAINT [FK_Perdoruesi_Roli]
GO

SELECT * FROM Perdoruesi;


