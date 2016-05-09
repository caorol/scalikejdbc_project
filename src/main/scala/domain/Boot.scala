package domain

/**
  * Created by caorol on 2016/05/03.
  */
object Boot extends App {
  import scalikejdbc._
  Class.forName("org.h2.Driver")
  ConnectionPool.singleton("jdbc:h2:mem:scalikejdbc","test","password")

  DB autoCommit { implicit session =>
    SQL("""
    create table members (
      id bigint primary key auto_increment,
      name varchar(30) not null,
      description varchar(1000),
      birthday date,
      created_at timestamp not null
    )
        """).execute.apply()
  }

  val userService = new UserService
  userService.insert(User("olive", "password"))
  println(userService.find("olive"))
}
