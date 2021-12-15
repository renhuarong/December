
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.io.InputStream;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersMybatisXMLGenerator {

    public static void main(String[] args) throws IOException, XMLParserException,
            SQLException, InterruptedException, InvalidConfigurationException {

        List<String> warnings = new ArrayList<>();
        Boolean overwrite = true;

        ConfigurationParser cp = new ConfigurationParser(warnings);

        //点击generatorConfig.xml可以跳转到对应的文件
        Configuration config = cp.parseConfiguration(getResourceInClasspath("generatorConfig.xml"));

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);

        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);

        myBatisGenerator.generate(null);

        warnings.forEach(System.out::println);

    }

    public static InputStream getResourceInClasspath(String path) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
    }

}