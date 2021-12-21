package sample;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Users {
    ArrayList<user> list = new ArrayList<>();

    @WebMethod
    public List<user> add(@WebParam(name="nom") String nom,
                          @WebParam(name="prenom") String prenom,
                          @WebParam(name="password") String password)
    {
        user user = new user(nom,prenom,password);
        list.add(user);
        return list;
    }

    @WebMethod
    public List<user> list() {
        return list;
    }

    @WebMethod
    public List<user> delete(@WebParam(name="index") int index) {
        list.remove(index);
        return list;
    }

}

