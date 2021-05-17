USE [master]
GO
CREATE LOGIN [debezium] WITH PASSWORD='whatever', DEFAULT_DATABASE=[master], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO
USE [DB]
GO
CREATE USER [debezium] FOR LOGIN [debezium]
GO
USE [CIMS]
GO
ALTER ROLE [db_owner] ADD MEMBER [debezium]
GO

-- Enable CDC on DB --
USE DB
GO
EXEC sys.sp_cdc_enable_db
GO

EXEC sys.sp_cdc_enable_table
    @source_schema = N'Person',
    @source_name   = N'Address',
    @role_name     = NULL,
    @supports_net_changes = 1
GO


