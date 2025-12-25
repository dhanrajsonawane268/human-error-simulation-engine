CREATE DATABASE human_error_db;

USE human_error_db;

CREATE TABLE error_event (
    id INT AUTO_INCREMENT PRIMARY KEY,
    action_name VARCHAR(100),
    error_type VARCHAR(50),
    event_time VARCHAR(50)
);
