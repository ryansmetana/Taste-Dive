
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

object changePasswordUI extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[PasswordData],String,Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(form: Form[PasswordData], message: String)(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Security")/*4.18*/ {_display_(Seq[Any](format.raw/*4.20*/("""

    """),format.raw/*6.5*/("""<h1><u>Change Your Password</u></h1>
    """),format.raw/*7.66*/("""
    """),_display_(/*8.6*/if(form.hasGlobalErrors)/*8.30*/ {_display_(Seq[Any](format.raw/*8.32*/("""
        """),_display_(/*9.10*/form/*9.14*/.globalErrors.asScala.map/*9.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*9.88*/("""
            """),format.raw/*10.13*/("""<div>"""),_display_(/*10.19*/error/*10.24*/.key),format.raw/*10.28*/(""": """),_display_(/*10.31*/error/*10.36*/.message),format.raw/*10.44*/("""</div>
        """)))}),format.raw/*11.10*/("""
    """)))}),format.raw/*12.6*/("""

    """),format.raw/*14.5*/("""<font color="red">"""),_display_(/*14.24*/message),format.raw/*14.31*/("""</font>

    """),_display_(/*16.6*/helper/*16.12*/.form(routes.FavoritesController.changePassword)/*16.60*/ {_display_(Seq[Any](format.raw/*16.62*/("""
        """),_display_(/*17.10*/helper/*17.16*/.inputPassword(form("currentPassword"),'_label -> "Enter Your Current Password")),format.raw/*17.96*/("""
        """),_display_(/*18.10*/helper/*18.16*/.inputPassword(form("newPassword"),'_label -> "Enter Your New Password")),format.raw/*18.88*/("""
        """),_display_(/*19.10*/helper/*19.16*/.inputPassword(form("newPasswordCheck"),'_label -> "Re-Enter Your New Password")),format.raw/*19.96*/("""
        """),format.raw/*20.9*/("""<button type="submit">Change Password</button>
    """)))}),format.raw/*21.6*/("""
""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(form:Form[PasswordData],message:String,request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(form,message)(request,messages)

  def f:((Form[PasswordData],String) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (form,message) => (request,messages) => apply(form,message)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 25 19:14:06 EDT 2019
                  SOURCE: C:/Development/Play/ist411-tastedive-app-testing/app/views/changePasswordUI.scala.html
                  HASH: b2b7c0e754c18e342c9c766589518ee559ed6195
                  MATRIX: 651->1|1041->31|1235->132|1262->134|1286->150|1325->152|1357->158|1425->260|1456->266|1488->290|1527->292|1563->302|1575->306|1608->331|1694->380|1735->393|1768->399|1782->404|1807->408|1837->411|1851->416|1880->424|1927->440|1963->446|1996->452|2042->471|2070->478|2110->492|2125->498|2182->546|2222->548|2259->558|2274->564|2375->644|2412->654|2427->660|2520->732|2557->742|2572->748|2673->828|2709->837|2791->889|2823->891
                  LINES: 24->1|29->2|34->3|35->4|35->4|35->4|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|41->10|42->11|43->12|45->14|45->14|45->14|47->16|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|52->21|53->22
                  -- GENERATED --
              */
          