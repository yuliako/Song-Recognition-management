DROP TABLE IF EXISTS USER_USAGE;
DROP TABLE IF EXISTS USER_PLAN;

CREATE TABLE USER_USAGE (
  RECOGNITIONS_NUM INT ,
  USER_ID VARCHAR(50) PRIMARY KEY,
  PLAN_TYPE VARCHAR(50) NOT NULL,

);

CREATE TABLE USER_PLAN (
    CURRENCY INT ,
    PLAN_TYPE VARCHAR(50) NOT NULL ,
    USER_ID VARCHAR(50)PRIMARY KEY ,
    NUM_ALLOWED_RESULTS INT,
);

INSERT INTO USER_PLAN(USER_ID,PLAN_TYPE,CURRENCY , NUM_ALLOWED_RESULTS ) VALUES
('mosheFree', 'Free Plan', 10 , 5),
('davidFree', 'Free Plan', 10 , 5),
('daveMonthly50_1', 'Monthly Plan 50', 50 , 9999),
('adamMonthly50_2', 'Monthly Plan 50', 50 , 9999),
('heziMonthly100_1', 'Monthly Plan 100', 100 , 9999),
('aviMonthly100_2', 'Monthly Plan 100', 100 , 9999),
('ramiMonthlyUnlimited_1', 'Monthly Plan Unlimited', 9999 , 9999),
('matanPerUsage_1', 'Per Use Plan', 9999 , 9999),
('mikiPerUsage_2', 'Per Use Plan', 9999 , 9999);




INSERT INTO USER_USAGE (USER_ID, PLAN_TYPE, RECOGNITIONS_NUM) VALUES
('mosheFree', 'Free Plan', 1),
('davidFree', 'Free Plan', 10),
('daveMonthly50_1', 'Monthly Plan 50', 5),
('adamMonthly50_2', 'Monthly Plan 50', 50),
('heziMonthly100_1', 'Monthly Plan 100', 50),
('aviMonthly100_2', 'Monthly Plan 100', 100),
('ramiMonthlyUnlimited_1', 'Monthly Plan Unlimited', 50),
('matanPerUsage_1', 'Per Use Plan', 50),
('mikiPerUsage_2', 'Per Use Plan', 600);

Commit;