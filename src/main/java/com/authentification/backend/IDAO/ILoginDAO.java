package com.authentification.backend.IDAO;

import com.authentification.backend.entities.Login;

public interface ILoginDAO {

    Login isUserExistent(String username, String password);

}
