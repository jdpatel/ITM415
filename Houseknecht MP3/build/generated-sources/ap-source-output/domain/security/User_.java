package domain.security;

import domain.security.Group;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-11-03T20:47:10")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> userName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile ListAttribute<User, Group> groups;

}