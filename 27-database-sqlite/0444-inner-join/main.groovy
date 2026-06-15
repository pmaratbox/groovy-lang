@Grab('org.xerial:sqlite-jdbc:3.46.1.3')
import java.sql.DriverManager
def c = DriverManager.getConnection('jdbc:sqlite::memory:')
c.createStatement().execute('create table users(id integer, name text)')
c.createStatement().execute('create table orders(user_id integer, item text)')
def insUsers = c.prepareStatement('insert into users values(?,?)')
[[1,'alice'],[2,'bob']].each { row ->
    insUsers.setInt(1, row[0]); insUsers.setString(2, row[1]); insUsers.executeUpdate()
}
def insOrders = c.prepareStatement('insert into orders values(?,?)')
[[1,'book'],[2,'pen'],[1,'lamp']].each { row ->
    insOrders.setInt(1, row[0]); insOrders.setString(2, row[1]); insOrders.executeUpdate()
}
def rs = c.createStatement().executeQuery('select u.name,o.item from orders o join users u on u.id=o.user_id order by u.name,o.item')
while (rs.next()) println("${rs.getString(1)} ${rs.getString(2)}")
