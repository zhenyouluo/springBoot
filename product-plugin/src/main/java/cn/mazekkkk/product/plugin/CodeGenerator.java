package cn.mazekkkk.product.plugin;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mazekkkk on 16/1/28.
 */

public class CodeGenerator {

    public static void main(String[] args)throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(inputStream);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

}
