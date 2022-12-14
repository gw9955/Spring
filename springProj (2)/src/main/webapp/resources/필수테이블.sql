CREATE TABLE ARTICLE(
    RNUM NUMBER,
	ARTICLE_NO NUMBER,
	WRITER_ID VARCHAR2(50),
	WRITER_NAME VARCHAR2(150),
	TITLE VARCHAR2(300),
	ART_CONTENT CLOB,
	REGDATE DATE,
	MODDATE DATE,
	READ_CNT NUMBER,
    CONSTRAINT PK_ARTICLE PRIMARY KEY(ARTICLE_NO)
);

CREATE TABLE BOOK(
    BOOK_ID NUMBER,
	TITLE VARCHAR2(300),
	CATEGORY VARCHAR2(150),
	PRICE NUMBER,
	INSERT_DATE DATE,
    CONSTRAINT PK_BOOK PRIMARY KEY(BOOK_ID)
);

CREATE TABLE CARD(
    NO NUMBER,
    VALID_MONTH DATE,
    CONSTRAINT PK_CARD PRIMARY KEY(NO)
);

CREATE TABLE PMEMBER(
    ID VARCHAR2(20),
    PASSWORD VARCHAR2(100),
    NAME VARCHAR2(150),
    GENDER VARCHAR2(30),
    MAIL VARCHAR2(100),
    PHONE VARCHAR2(30),
    ADDRESS VARCHAR2(1000),
    REGIST_DAY VARCHAR2(30),
    BIRTH VARCHAR2(30),
    REGNO VARCHAR2(30),
    NATIONALITY VARCHAR2(90),
    CONSTRAINT PK_PMEMBER PRIMARY KEY(ID)
); 

CREATE TABLE PRODUCT(
    PRODUCT_ID VARCHAR2(20),
    PNAME VARCHAR2(150),
    UNIT_PRICE NUMBER,
    DESCRIPTION VARCHAR2(1000),
    MANUFACTURER VARCHAR2(300),
    CATEGORY VARCHAR2(150),
    UNITS_IN_STOCK NUMBER,
    CONDITION VARCHAR2(100),
    FILENAME VARCHAR2(300),
    QUANTITY NUMBER,
    CONSTRAINT PK_PRODUCT PRIMARY KEY(PRODUCT_ID)
);

CREATE TABLE MEM 
(	
	USER_NO NUMBER NOT NULL, 
	USER_ID VARCHAR2(100 BYTE), 
	USER_PW VARCHAR2(100 BYTE), 
	USER_NAME VARCHAR2(150 BYTE), 
	COIN NUMBER, 
	REG_DATE DATE DEFAULT sysdate, 
	UPD_DATE DATE DEFAULT NULL, 
	D VARCHAR2(20 BYTE), 
	CONSTRAINT MEM_PK PRIMARY KEY (USER_NO)
);

CREATE TABLE MEM_AUTH 
(	
	USER_NO NUMBER NOT NULL, 
	AUTH VARCHAR2(20 BYTE) NOT NULL, 
	CONSTRAINT MEM_AUTH_PK PRIMARY KEY (USER_NO, AUTH),
	CONSTRAINT MEM_AUTH_FK1 FOREIGN KEY (USER_NO)
	  REFERENCES SEM.MEM (USER_NO) ON DELETE CASCADE 
);

