
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import play.mvc.Http.Request

object listUsers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[User],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(users: Seq[User])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Users")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""
    """),format.raw/*5.5*/("""<h1>Saved Users</h1>
    <table>
        <thead>
            <tr><th>Username</th><th>Password</th>
        </thead>
        <tbody>
        """),_display_(/*11.10*/for(u <- users) yield /*11.25*/ {_display_(Seq[Any](format.raw/*11.27*/("""
            """),format.raw/*12.13*/("""<tr><td>"""),_display_(/*12.22*/u/*12.23*/.username),format.raw/*12.32*/("""</td><td>"""),_display_(/*12.42*/u/*12.43*/.password),format.raw/*12.52*/("""</td></tr>
        """)))}),format.raw/*13.10*/("""
        """),format.raw/*14.9*/("""</tbody>
    </table>
    <hr/>

""")))}),format.raw/*18.2*/("""
"""))
      }
    }
  }

  def render(users:Seq[User],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(users)(request,messages)

  def f:((Seq[User]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (users) => (request,messages) => apply(users)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 25 19:14:06 EDT 2019
                  SOURCE: C:/Development/Play/ist411-tastedive-app-testing/app/views/listUsers.scala.html
                  HASH: 46e771fa46e0245e65433f55e9707da904ee14f0
                  MATRIX: 651->1|1018->31|1187->107|1214->109|1235->122|1274->124|1305->129|1474->271|1505->286|1545->288|1586->301|1622->310|1632->311|1662->320|1699->330|1709->331|1739->340|1790->360|1826->369|1890->403
                  LINES: 24->1|29->2|34->3|35->4|35->4|35->4|36->5|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|43->12|44->13|45->14|49->18
                  -- GENERATED --
              */
          