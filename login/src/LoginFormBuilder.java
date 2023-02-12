public class LoginFormBuilder<jFrame> {
    private jFrame parent;

    public LoginFormBuilder setParent(jFrame parent) {
        this.parent = parent;
        return this;
    }

    public LoginForm createLoginForm() {
        return new LoginForm(parent);
    }
}