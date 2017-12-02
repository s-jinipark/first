CREATE TABLE DB_LOG   (  
   LOG_NUM VARCHAR(100),
   THREAD_NAME VARCHAR(100),
   LOG_TIMESTAMP VARCHAR(14),
   MESSAGE VARCHAR(4000),
   LOGGER_NAME VARCHAR(100),
   LOG_LEVEL VARCHAR(10),
   NDC VARCHAR(100),
   START_TIME VARCHAR(14),
   CALLER_FILENAME VARCHAR(100),
   CALLER_CLASS VARCHAR(100),
   CALLER_METHOD VARCHAR(100),
   CALLER_LINE VARCHAR(10)
);

CREATE SEQUENCE logSequence START WITH 1 INCREMENT BY 1;

CREATE TABLE dual (
    dummy        VARCHAR(1) PRIMARY KEY
);

INSERT INTO dual VALUES ('X');
