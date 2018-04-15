--QUAL G�NERO DE FILME TEM MAIS CR�TICAS?
SELECT t2.NOME as GENERO, COUNT(TEXTO) as CRITICAS
FROM imdb.FILME t1
INNER JOIN imdb.GENERO t2 ON t1.ID_GENERO = t2.ID
LEFT JOIN imdb.CRITICA t3 ON t1.ID_ASSUNTO = t3.ID_FILME
GROUP BY t2.NOME;

--O filme que tem mais cr�ticas � o que tem mais coment�rios?
SELECT t1.NOME as FILME, COUNT(t3.TEXTO) as CRITICAS, COUNT(t2.TEXTO) as COMENTARIOS
FROM imdb.FILME t1
LEFT JOIN imdb.COMENTARIO t2 ON t1.ID_ASSUNTO = t2.ID_FILME
LEFT JOIN imdb.CRITICA t3 ON t1.ID_ASSUNTO = t3.ID_FILME
GROUP BY t1.NOME;

--O filme que tem mais cr�ticas � o que tem mais not�cias?
SELECT t1.NOME as FILME, COUNT(t5.TEXTO) as CRITICAS, COUNT(t4.ID) as NOTICIAS
FROM imdb.FILME t1
INNER JOIN imdb.ASSUNTO t2 ON t1.ID_ASSUNTO = t2.ID
LEFT JOIN imdb.SOBRE t3 ON t2.ID = t3.ID_ASSUNTO
LEFT JOIN imdb.NOTICIA t4 ON t3.ID_NOTICIA = t4.ID
LEFT JOIN imdb.CRITICA t5 ON t1.ID_ASSUNTO = t5.ID_FILME
GROUP BY t1.NOME;