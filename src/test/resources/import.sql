INSERT INTO speaker(email, name) VALUES ('bungubbang@nate.com', 'bungubbang');
INSERT INTO audience(user_key) values ('w-179f11c659-16a21-17aa8-10173-1402563029809');
INSERT INTO audience(user_key) values ('w-179f11c659-16a21-17aa8-10173-1402563029801');
INSERT INTO audience(user_key) values ('w-179f11c659-16a21-17aa8-10173-1402563029802');
INSERT INTO audience(user_key) values ('w-179f11c659-16a21-17aa8-10173-1402563029803');
INSERT INTO presentation_dashboard (choice_count, created_date, presentation_type, questions, status, title, speaker_id) VALUES (null, CURRENT_DATE, 'OX', null, true, 'This is first Question!?', 1);
INSERT INTO answer(created_date, modify_date, result, user_agent, audience_id, dashboard_id) VALUES ('2014-06-12 17:55:27', '2014-06-12 17:55:29', 'O', 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36', '1', '1');
INSERT INTO answer(created_date, modify_date, result, user_agent, audience_id, dashboard_id) VALUES ('2014-06-12 17:55:27', '2014-06-12 17:55:29', 'O', 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36', '2', '1');
INSERT INTO answer(created_date, modify_date, result, user_agent, audience_id, dashboard_id) VALUES ('2014-06-12 17:55:27', '2014-06-12 17:55:29', 'X', 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36', '3', '1');
INSERT INTO answer(created_date, modify_date, result, user_agent, audience_id, dashboard_id) VALUES ('2014-06-12 17:55:27', '2014-06-12 17:55:29', 'O', 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/35.0.1916.153 Safari/537.36', '4', '1');