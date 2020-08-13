CREATE TABLE "SYSTEM"."LAYERED_STUDENT" 
   (	"SNO" NUMBER(10,0) NOT NULL ENABLE, 
	"SNAME" VARCHAR2(20 BYTE), 
	"SADD" VARCHAR2(20 BYTE), 
	"TOTAL" NUMBER(10,0), 
	"AVG" FLOAT(126), 
	"RESULT" VARCHAR2(20 BYTE), 
	 CONSTRAINT "LAYERED_STUDENT_PK" PRIMARY KEY ("SNO"))