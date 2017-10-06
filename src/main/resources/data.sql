INSERT INTO oauth_client_details
    (client_id, client_secret, scope, authorized_grant_types,
    web_server_redirect_uri, authorities, access_token_validity,
    refresh_token_validity, additional_information, autoapprove)
VALUES
    ('prodClientIdPassword', 'secret', 'product,read,write',
    'password,authorization_code,refresh_token', null, null, 36000, 36000, null, true);
INSERT INTO oauth_client_details
    (client_id, client_secret, scope, authorized_grant_types,
    web_server_redirect_uri, authorities, access_token_validity,
    refresh_token_validity, additional_information, autoapprove)
VALUES
    ('cliClientIdPassword', 'secret', 'client,read,write',
    'password,authorization_code,refresh_token', null, null, 36000, 36000, null, true);
INSERT INTO oauth_client_details
    (client_id, client_secret, scope, authorized_grant_types,
    web_server_redirect_uri, authorities, access_token_validity,
    refresh_token_validity, additional_information, autoapprove)
VALUES
    ('fullClientIdPassword', 'secret', 'client,product,read,write',
    'password,authorization_code,refresh_token', null, null, 36000, 36000, null, true);

  

INSERT INTO users(username,password,enabled) VALUES ('john','123', true);
INSERT INTO users(username,password,enabled) VALUES ('tom','111', true);
INSERT INTO users(username,password,enabled) VALUES ('user1','pass', true);
INSERT INTO users(username,password,enabled) VALUES ('admin','nimda', true);

INSERT INTO user_roles (username, role) VALUES ('john', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('tom', 'ROLE_ADMIN');
INSERT INTO user_roles (username, role) VALUES ('user1', 'ROLE_USER');
INSERT INTO user_roles (username, role) VALUES ('admin', 'ROLE_ADMIN');

commit;
    