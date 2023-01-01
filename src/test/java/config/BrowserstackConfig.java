package config;

import org.aeonbits.owner.Config;

//@Config.Sources({
//        "classpath:browserstack.properties"})

public interface BrowserstackConfig extends Config {

    @Key("user")
    @DefaultValue("bsuser_0bae97")
    String user();

    @Key("key")
    @DefaultValue("89Baz9pmNscurTVCUVWk")
    String key();

    @Key("app")
    @DefaultValue("bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c")
    String app();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String device();

    @Key ("osVersion")
    @DefaultValue("9.0")
    String osVersion();

    @Key("project")
    @DefaultValue("First Java Project")
    String project();

    @Key("build")
    @DefaultValue("browserstack-build-2")
    String build();

    @Key("name")
    @DefaultValue("first_test")
    String name();
}
