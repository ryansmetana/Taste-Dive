
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

object favoritesList extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Seq[Media],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(favoriteList: Seq[Media]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.28*/("""

"""),format.raw/*4.1*/("""<script type='text/javascript' src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script src='"""),_display_(/*5.15*/routes/*5.21*/.Assets.versioned("javascripts/removeFavorites.js")),format.raw/*5.72*/("""'></script>
<table>
    <thead>
    <tr><th>Name</th><th>Type</th><th>Wikipedia Link</th><th>Video Link</th><th></th>
    </thead>
    <tbody>
    """),_display_(/*11.6*/for(m <- favoriteList) yield /*11.28*/ {_display_(Seq[Any](format.raw/*11.30*/("""
    """),format.raw/*12.5*/("""<tr><td>"""),_display_(/*12.14*/m/*12.15*/.name),format.raw/*12.20*/("""</td><td>"""),_display_(/*12.30*/m/*12.31*/.mediaType),format.raw/*12.41*/("""</td><td><a href=""""),_display_(/*12.60*/m/*12.61*/.wikiLink),format.raw/*12.70*/("""" target="_blank">"""),_display_(/*12.89*/m/*12.90*/.wikiLink),format.raw/*12.99*/("""</a></td><td><a href=""""),_display_(/*12.122*/m/*12.123*/.videoLink),format.raw/*12.133*/("""" target="_blank">"""),_display_(/*12.152*/m/*12.153*/.videoLink),format.raw/*12.163*/("""</a></td><td><button onclick="removeFavorite('"""),_display_(/*12.210*/m/*12.211*/.name),_display_(/*12.217*/m/*12.218*/.mediaType),format.raw/*12.228*/("""')">Remove</button></td></tr>
    """)))}),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""</tbody>
</table>
"""))
      }
    }
  }

  def render(favoriteList:Seq[Media]): play.twirl.api.HtmlFormat.Appendable = apply(favoriteList)

  def f:((Seq[Media]) => play.twirl.api.HtmlFormat.Appendable) = (favoriteList) => apply(favoriteList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 25 19:14:06 EDT 2019
                  SOURCE: C:/Development/Play/ist411-tastedive-app-testing/app/views/favoritesList.scala.html
                  HASH: cf013b6ad50f1baf45e6309acc4424a56de291a6
                  MATRIX: 651->1|996->32|1117->58|1147->62|1299->188|1313->194|1384->245|1564->399|1602->421|1642->423|1675->429|1711->438|1721->439|1747->444|1784->454|1794->455|1825->465|1871->484|1881->485|1911->494|1957->513|1967->514|1997->523|2048->546|2059->547|2091->557|2138->576|2149->577|2181->587|2256->634|2267->635|2294->641|2305->642|2337->652|2403->688|2436->694
                  LINES: 24->1|29->2|34->2|36->4|37->5|37->5|37->5|43->11|43->11|43->11|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|44->12|45->13|46->14
                  -- GENERATED --
              */
          