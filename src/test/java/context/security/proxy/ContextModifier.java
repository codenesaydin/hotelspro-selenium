package context.security.proxy;

public interface ContextModifier
{
    void setIncludeInContext(String contextName, String regex);
}
