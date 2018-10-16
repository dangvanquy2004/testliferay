create table department (
	iddepartment INTEGER not null primary key,
	name VARCHAR(75) null
);

create table employee (
	id INTEGER not null primary key,
	name VARCHAR(75) null,
	address VARCHAR(75) null,
	phone VARCHAR(75) null,
	iddepartment INTEGER
);