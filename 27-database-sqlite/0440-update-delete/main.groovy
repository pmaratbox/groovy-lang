@Grab('org.xerial:sqlite-jdbc:3.46.1.3')
import java.sql.DriverManager
def c = DriverManager.getConnection('jdbc:sqlite::memory:')
c.createStatement().execute('create table users(id integer, name text)')
def ins = c.prepareStatement('insert into users values(?,?)')
[[1,'alice'],[2,'bob'],[3,'carol']].each { row ->
    ins.setInt(1, row[0]); ins.setString(2, row[1]); ins.executeUpdate()
}
c.createStatement().execute("update users set name='robert' where id=2")
c.createStatement().execute('delete from users where id=1')
def rs = c.createStatement().executeQuery('select id,name from users order by id')
while (rs.next()) println("${rs.getInt(1)} ${rs.getString(2)}")
