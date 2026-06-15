@Grab('org.xerial:sqlite-jdbc:3.46.1.3')
import java.sql.DriverManager
def c = DriverManager.getConnection('jdbc:sqlite::memory:')
c.createStatement().execute('create table users(id integer, name text)')
def ins = c.prepareStatement('insert into users values(?,?)')
[[1,'alice'],[2,'bob'],[3,'carol']].each { row ->
    ins.setInt(1, row[0]); ins.setString(2, row[1]); ins.executeUpdate()
}
def ps = c.prepareStatement('select name from users where id=?')
ps.setInt(1, 2)
def rs = ps.executeQuery()
while (rs.next()) println(rs.getString(1))
