package spring_mybatis.src.main.java.spring_mybatis.domain;

/**
 Field	Type	Null	Key	Default	Extra
 id	int	NO	PRI		auto_increment
 userName	varchar(32)	NO
 passWord	varchar(50)	NO
 realName	varchar(32)	YES		null
/***/
public class User {

    private int id;
    private String userName;
    private String password;
    private String realName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
}
