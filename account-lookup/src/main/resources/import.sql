-- noinspection SqlNoDataSourceInspectionForFile

INSERT INTO ADDRESS (id, address, address2, city, state, zip_code, country) VALUES (1, '123 Any Way', '', 'WESTMINSTER', 'CO', '12345', 'US');
INSERT INTO ADDRESS (id, address, address2, city, state, zip_code, country) VALUES (2, '234 My Way', '', 'WESTMINSTER', 'CO', '12345', 'US');
INSERT INTO ADDRESS (id, address, address2, city, state, zip_code, country) VALUES (3, '345 There Way', '', 'WESTMINSTER', 'CO', '12345', 'US');
INSERT INTO ADDRESS (id, address, address2, city, state, zip_code, country) VALUES (4, '456 Where Lane', 'Apartment 101', 'WESTMINSTER', 'CO', '12345', 'US');
INSERT INTO ADDRESS (id, address, address2, city, state, zip_code, country) VALUES (5, '567 Blaire Street', '', 'WESTMINSTER', 'CO', '12345', 'US');


INSERT INTO CARD_ACCOUNT (id, card_holder, expiration_month, expiration_year, account_number, account_limit_amount, current_balance_amount, currency, last_four, address_id) VALUES (1, 'Jimmy Blabber', 11, 18, '5545441111111111', 30000, 1345.56, 'USD', '1111', 1);
INSERT INTO CARD_ACCOUNT (id, card_holder, expiration_month, expiration_year, account_number, account_limit_amount, current_balance_amount, currency, last_four, address_id) VALUES (2, 'Johnny Nearmeister', 09, 17, '5524331111111111', 2000, 101.25, 'USD', '1111', 2);
INSERT INTO CARD_ACCOUNT (id, card_holder, expiration_month, expiration_year, account_number, account_limit_amount, current_balance_amount, currency, last_four, address_id) VALUES (3, 'Timmy Sleuth', 07, 21, '5474151111111111', 11000, 1345.56, 'USD', '1111', 3);
INSERT INTO CARD_ACCOUNT (id, card_holder, expiration_month, expiration_year, account_number, account_limit_amount, current_balance_amount, currency, last_four, address_id) VALUES (4, 'Ginny Ladder', 05, 20, '5109821111111111', 500, 510.51, 'USD', '1111', 4);
INSERT INTO CARD_ACCOUNT (id, card_holder, expiration_month, expiration_year, account_number, account_limit_amount, current_balance_amount, currency, last_four, address_id) VALUES (5, 'Winnie Master', 02, 28, '5149231111111111', 500000, 0.00, 'USD', '1111', 5);
