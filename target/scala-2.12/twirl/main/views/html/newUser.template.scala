
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

object newUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[NewUserData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(form: Form[NewUserData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Users")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""

    """),format.raw/*6.5*/("""<h1><u>Create New User</u></h1>
    """),format.raw/*7.66*/("""
    """),_display_(/*8.6*/if(form.hasGlobalErrors)/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""
        """),_display_(/*9.10*/form/*9.14*/.globalErrors.asScala.map/*9.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*9.88*/("""
        """),format.raw/*10.9*/("""<div>"""),_display_(/*10.15*/error/*10.20*/.key),format.raw/*10.24*/(""": """),_display_(/*10.27*/error/*10.32*/.message),format.raw/*10.40*/("""</div>
        """)))}),format.raw/*11.10*/("""
    """)))}),format.raw/*12.6*/("""

    """),_display_(/*14.6*/helper/*14.12*/.form(routes.LoginController.createUser)/*14.52*/ {_display_(Seq[Any](format.raw/*14.54*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputText(form("firstName"),'_label -> "First Name")),format.raw/*15.69*/("""
        """),_display_(/*16.10*/helper/*16.16*/.inputText(form("lastName"),'_label -> "Last Name")),format.raw/*16.67*/("""
        """),_display_(/*17.10*/helper/*17.16*/.inputText(form("username"),'_label -> "Username")),format.raw/*17.66*/("""
        """),_display_(/*18.10*/helper/*18.16*/.inputPassword(form("password"),'_label -> "Password")),format.raw/*18.70*/("""
        """),format.raw/*19.9*/("""<button type="submit">Create User</button>
    """)))}),format.raw/*20.6*/("""
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(form:Form[NewUserData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(form)(request,messages)

  def f:((Form[NewUserData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (form) => (request,messages) => apply(form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 25 19:14:06 EDT 2019
                  SOURCE: C:/Development/Play/ist411-tastedive-app-testing/app/views/newUser.scala.html
                  HASH: 6dfdcccc99041e6f39ca03add8c5e2545cb75048
                  MATRIX: 651->1|1024->31|1200->114|1227->116|1248->129|1287->131|1319->137|1382->234|1413->240|1445->264|1484->266|1520->276|1532->280|1565->305|1651->354|1687->363|1720->369|1734->374|1759->378|1789->381|1803->386|1832->394|1879->410|1915->416|1948->423|1963->429|2012->469|2052->471|2089->481|2104->487|2178->540|2215->550|2230->556|2302->607|2339->617|2354->623|2425->673|2462->683|2477->689|2552->743|2588->752|2666->800|2698->802
                  LINES: 24->1|29->2|34->3|35->4|35->4|35->4|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|43->12|45->14|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|51->20|52->21
                  -- GENERATED --
              */
          