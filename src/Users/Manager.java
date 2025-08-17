package Users;

public non-sealed class Manager extends Employee {
    private String login;
    private String password;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean verifyLogin(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            return true;
        }

        return false;
    }
}
