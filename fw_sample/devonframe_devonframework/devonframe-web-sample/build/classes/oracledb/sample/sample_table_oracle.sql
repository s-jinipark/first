CREATE TABLE SAM_EMPLOYEE(
		NUM VARCHAR2(20) NOT NULL,
		NAME VARCHAR2(20),
		BIRTHDATE VARCHAR2(20),
		SSN VARCHAR2(20),
		SEX VARCHAR2(20),
		TELEPHONE VARCHAR2(20),
		ADDRESS VARCHAR2(80),
		POSTAL VARCHAR2(20),
		JOBLEVEL_CODE VARCHAR2(20),
		DIVISION_CODE VARCHAR2(20),
		DEPARTMENT_CODE VARCHAR2(20),
		SKILL_CODE VARCHAR2(20),
		CONSTRAINT SAM_EMPLOYEE_PK PRIMARY KEY(NUM)
);

CREATE TABLE SAM_EMPLOYEE_DLT(
		NUM VARCHAR2(20) NOT NULL,
		NAME VARCHAR2(20),
		BIRTHDATE VARCHAR2(20),
		SSN VARCHAR2(20),
		SEX VARCHAR2(20),
		TELEPHONE VARCHAR2(20),
		ADDRESS VARCHAR2(80),
		POSTAL VARCHAR2(20),
		JOBLEVEL_CODE VARCHAR2(20),
		DIVISION_CODE VARCHAR2(20),
		DEPARTMENT_CODE VARCHAR2(20),
		SKILL_CODE VARCHAR2(20),
		CONSTRAINT SAM_EMPLOYEE_DLT_PK PRIMARY KEY(NUM)
);

CREATE TABLE SAM_EMPLOYEE_MASTERDETAIL(
		NUM VARCHAR2(20) NOT NULL,
		NOWJOB VARCHAR2(30),
		TITLE VARCHAR2(20),
		RETIREMENT VARCHAR2(20),
		WORKINGYEAR VARCHAR2(80),
		FIRSTDATE VARCHAR2(20),
		WORKINGDATE VARCHAR2(20),
		MARRIAGE VARCHAR2(20),
		ARMY VARCHAR2(20),
		CONSTRAINT SAM_EMPLOYEE_MASTERDETAIL_PK PRIMARY KEY(NUM)
);

CREATE TABLE SAM_EXCEL_EMPLOYEE(
		NUM VARCHAR2(20) NOT NULL,
		NAME VARCHAR2(20),
		BIRTHDATE VARCHAR2(20),
		TELEPHONE VARCHAR2(20),
		JOBLEVEL_CODE VARCHAR2(20),
		SKILL_CODE VARCHAR2(20),
		CONSTRAINT SAM_EXCEL_EMPLOYEE_PK PRIMARY KEY(NUM)
);

CREATE TABLE SAM_ACHIEVEMENT(
		NUM VARCHAR2(20) NOT NULL,
		YYYY VARCHAR2(20) NOT NULL,
		VALUE VARCHAR2(100),
		ETC VARCHAR2(100),
		MM VARCHAR2(20) NOT NULL
);

CREATE TABLE SAM_CODE(
		CODE_GROUP VARCHAR2(20) NOT NULL,
		CODE VARCHAR2(20) NOT NULL,
		NAME VARCHAR2(20),
		CODE_DESC VARCHAR2(100),
		CONSTRAINT SAM_CODE_PK PRIMARY KEY(CODE_GROUP, CODE)
);

CREATE TABLE SAM_SKILL(
		CODE VARCHAR2(20) NOT NULL,
		NAME VARCHAR2(20)
);

CREATE TABLE SAM_JOBLEVEL(
		CODE VARCHAR2(20) NOT NULL,
		NAME VARCHAR2(20)
);

CREATE TABLE SAM_DIVISION(
		CODE VARCHAR2(20) NOT NULL,
		NAME VARCHAR2(40)
);

CREATE TABLE SAM_DEPARTMENT(
		DIV_CODE VARCHAR2(20) NOT NULL,
		CODE VARCHAR2(20) NOT NULL,
		NAME VARCHAR2(40)
);

CREATE TABLE SAM_FILE_INFO(
		FILE_NAME VARCHAR2(50) NOT NULL,
		UPLOAD_FILE_PATH VARCHAR2(500) NOT NULL,
		UPLOAD_FILE_NAME VARCHAR2(50),
		FILE_SIZE NUMBER,
		UPLOAD_DATE VARCHAR2(20),
		CONSTRAINT SAM_FILE_INFO_PK PRIMARY KEY(FILE_NAME, UPLOAD_FILE_PATH)
);

CREATE TABLE SAM_MESSAGES(
		CODE VARCHAR2(100) NOT NULL,
		LOCALE VARCHAR2(20) NOT NULL,
		MESSAGE VARCHAR2(100),
		ATTRIBUTE VARCHAR2(2),
		PRIMARY KEY(CODE, LOCALE)
);

CREATE TABLE SAM_USER(
		USR_ID VARCHAR2(30) NOT NULL PRIMARY KEY,
		USR_NM VARCHAR2(100) NOT NULL,
		USR_PW VARCHAR2(512) NOT NULL,
		LANG_CLCD VARCHAR2(4) DEFAULT 'ko',
		ROLE VARCHAR2(30) DEFAULT 'developer',
		REG_DT VARCHAR2(14) DEFAULT ' ',
		CHNG_USR_ID VARCHAR2(30) DEFAULT ' ',
		CHNG_DT VARCHAR2(14) DEFAULT ' '
);