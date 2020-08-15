 

PLANEJAMENTO POC Cloudera e Pentaho 

 

Este documento registra o que deve ser feito para se ter provas de conceito nas tecnologias Cloudera e Pentaho. Além disso, ele documenta os resultados esperados e os alcançados. 

 

Objetivos 

Demonstrar viabilidade de utilizar a plataforma do cloudera para armazenamento e ingestão de dados. Além disso, gerar subsídios para o processo de contratação de uma plataforma (com suporte) de Big Data. 

 

Envolvidos 

Banpará 

GEARQ 

GECONF 

GERAD 

GECRE/Vibe Crédito 

GEINS – Adriano e Thiago Marum / Renata 

Cloudera 

Compwire 

 

Atividades 

As atividades a serem realizadas devem ser as seguintes: 

Disponibilizar ambientes aos envolvidos; 

Criação de Máquinas Virtuais (VM’s) para reinstalação pronta para Ativo Ativo (GEINS) 

Instalação do ... 

Envio de eventos por API/CDC para o Kafka e ingestão de dados no lago 

 

BIs (Pentaho/Apache Nifi) 

2.1. Carga dos dados do PowerBI e conexão dele no lago 

 

Realizar processamento de uma procedure via Pentaho / ApacheNifi / Spark 

- Criação de carga existente no SQL Analysis Services para o Pentahoo armazenando no Cloudera 

 Implementar uma procedure de processamento no Pentahoo 

 Publicar relatório no gerenciador de relatório 

- Criar webservice para consulta de dados 

Escrever a Documentação (Documento de Análise Técnica) para mostrar a necessidade de renovação das tecnologias envolvidas a partir das POC’s; 

 

 

Arquitetura 

 

 

Arquitetura da POC Kafka/Cloudera 

 

 

Figura 1. Diagrama de componentes da POC Kafka/Coudera 

 

Resultados Esperados 

 

API com envio de pelo menos 1000 eventos por segundo para o Kafka 

Carga de dados de streaming para o HDFS via Pentaho 

Carga de dados de streaming para o HDFS via Apache Nifi 

Carga dados de base relacional para HDFS via Pentaho 

Carga dados de base relacional para HDFS via ApacheNifi 

Conexão do PowerBI no HDFS via Impala 

Realizar processamento distribuído de dados via Spark e validar o resultado com o processamento executado atualmente 

 

Dificuldades Encontradas 

 

<TO DO> 

 

Resultados Alcançados 

 

<TO DO> 

 

 