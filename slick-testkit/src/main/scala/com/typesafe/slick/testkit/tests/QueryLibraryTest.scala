package com.typesafe.slick.testkit.tests

import org.junit.Assert._
import com.typesafe.slick.testkit.util.{JdbcTestDB, TestkitTest}

class QueryLibraryTest extends TestkitTest[JdbcTestDB] {
  import tdb.profile.simple._

  def all[E](q: Query[_, E]) = {
    q.list
    q.run
  }

  def test = ()
}
