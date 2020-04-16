
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[LoginData],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[LoginData])(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<h1><u>Log In</u></h1>
    """),format.raw/*5.66*/("""
    """),_display_(/*6.6*/if(form.hasGlobalErrors)/*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""
        """),_display_(/*7.10*/form/*7.14*/.globalErrors.asScala.map/*7.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*7.88*/("""
        """),format.raw/*8.9*/("""<div>"""),_display_(/*8.15*/error/*8.20*/.key),format.raw/*8.24*/(""": """),_display_(/*8.27*/error/*8.32*/.message),format.raw/*8.40*/("""</div>
        """)))}),format.raw/*9.10*/("""
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""<font color="red">"""),_display_(/*11.24*/message),format.raw/*11.31*/("""</font>

    """),_display_(/*13.6*/helper/*13.12*/.form(routes.LoginController.authenticateUser)/*13.58*/ {_display_(Seq[Any](format.raw/*13.60*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(form("username"),'_label -> "Username")),format.raw/*14.66*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputPassword(form("password"),'_label -> "Password")),format.raw/*15.70*/("""
        """),format.raw/*16.9*/("""<button type="submit">Log In</button>
    """)))}),format.raw/*17.6*/("""

    """),_display_(/*19.6*/helper/*19.12*/.form(routes.LoginController.openNewUserPage)/*19.57*/{_display_(Seq[Any](format.raw/*19.58*/("""
        """),format.raw/*20.9*/("""<button type="submit">Create Account</button>
    """)))}),format.raw/*21.6*/("""
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(form:Form[LoginData],message:String): play.twirl.api.HtmlFormat.Appendable = apply(form)(message)

  def f:((Form[LoginData]) => (String) => play.twirl.api.HtmlFormat.Appendable) = (form) => (message) => apply(form)(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 25 19:14:06 EDT 2019
                  SOURCE: C:/Development/Play/ist411-tastedive-app-testing/app/views/index.scala.html
                  HASH: 9f6132ff62efed099d041ec4e4b675199da0ea71
                  MATRIX: 964->1|1098->42|1125->44|1156->67|1195->69|1226->74|1280->162|1311->168|1343->192|1382->194|1418->204|1430->208|1463->233|1549->282|1584->291|1616->297|1629->302|1653->306|1682->309|1695->314|1723->322|1769->338|1805->344|1837->349|1883->368|1911->375|1951->389|1966->395|2021->441|2061->443|2098->453|2113->459|2184->509|2221->519|2236->525|2311->579|2347->588|2420->631|2453->638|2468->644|2522->689|2561->690|2597->699|2678->750|2710->752
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|36->5|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|39->8|39->8|39->8|39->8|39->8|39->8|40->9|41->10|42->11|42->11|42->11|44->13|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|48->17|50->19|50->19|50->19|50->19|51->20|52->21|53->22
                  -- GENERATED --
              */
          