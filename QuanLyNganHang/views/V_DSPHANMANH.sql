CREATE VIEW V_DSPHANMANH
AS
SELECT p.description AS 'Ten Co So', s.subscriber AS 'Server'
FROM distribution.dbo.MSpublications AS p, distribution.dbo.MSmerge_subscriptions AS s
WHERE p.publication_id = s.publication_id

select * from V_DSPHANMANH

