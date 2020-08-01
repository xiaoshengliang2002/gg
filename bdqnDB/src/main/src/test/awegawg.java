package test;

import com.bdqn.dao.StusinfoDao;
import com.bdqn.entity.Stusinfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class awegawg {

    public static void main(String[] args) throws IOException {
        /*查询*/

        // 加载mybatis配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapper.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factroy = new SqlSessionFactoryBuilder().build(in);
        //创建sqlSession对象
        SqlSession session = factroy.openSession();
        //获取到代理对象
        StusinfoDao Stusinfodao = session.getMapper(StusinfoDao.class);
        System.out.println(factroy.toString());
        List<Stusinfo> all = Stusinfodao.findAll();
        for (int i = 0; i <all.size() ; i++) {
            System.out.println(all.get(i).getStuName()+"\t"+all.get(i).getStuPwd());
        }
        //关闭资源
        session.close();
        in.close();

    }

}



