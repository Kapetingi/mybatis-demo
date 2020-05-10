CREATE TABLE employee(
    id UUID,
    first_name VARCHAR,
    last_name VARCHAR,
    salary SMALLINT,
    manager_id UUID,
    CONSTRAINT pk_employee PRIMARY KEY(id)
);

INSERT INTO employee
VALUES
    ('700d698d-6fa6-42d9-a5cc-a85c8c4ccbe6', 'Nick', 'Carter', '3000', null),
    ('794d22e8-e5ff-46e0-8c50-94e363bf1249', 'Bruce', 'Kane', '1000', '700d698d-6fa6-42d9-a5cc-a85c8c4ccbe6');