
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

object filterMenu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template10[Seq[Media],Form[MediaData],Form[FilterList],String,String,String,String,String,Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(favoriteList: Seq[Media], form: Form[MediaData], filterList: Form[FilterList], selectedName: String, selectedType: String, selectedDescription: String, selectedWurl: String, selectedVurl: String)(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.255*/("""

"""),_display_(/*4.2*/main("Favorites")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""

            """),format.raw/*6.13*/("""<script type='text/javascript' src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
            <script src='"""),_display_(/*7.27*/routes/*7.33*/.Assets.versioned("javascripts/cytoscape.min.js")),format.raw/*7.82*/("""'></script>
            <script src='"""),_display_(/*8.27*/routes/*8.33*/.Assets.versioned("javascripts/cola.min.js")),format.raw/*8.77*/("""'></script>
            <script src='"""),_display_(/*9.27*/routes/*9.33*/.Assets.versioned("javascripts/cytoscape-cola.js")),format.raw/*9.83*/("""'></script>
            <script src='"""),_display_(/*10.27*/routes/*10.33*/.Assets.versioned("javascripts/mediamap.js")),format.raw/*10.77*/("""'></script>

            """),format.raw/*12.48*/("""
            """),_display_(/*13.14*/request/*13.21*/.flash.asScala().data.map/*13.46*/ { case (name, mediaType) =>_display_(Seq[Any](format.raw/*13.74*/("""
                """),format.raw/*14.17*/("""<div class=""""),_display_(/*14.30*/name),format.raw/*14.34*/("""">"""),_display_(/*14.37*/mediaType),format.raw/*14.46*/("""</div>
            """)))}),format.raw/*15.14*/("""

            """),format.raw/*17.74*/("""
            """),_display_(/*18.14*/if(form.hasGlobalErrors)/*18.38*/ {_display_(Seq[Any](format.raw/*18.40*/("""
                """),_display_(/*19.18*/form/*19.22*/.globalErrors.asScala.map/*19.47*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*19.96*/("""
                    """),format.raw/*20.21*/("""<div>"""),_display_(/*20.27*/error/*20.32*/.key),format.raw/*20.36*/(""": """),_display_(/*20.39*/error/*20.44*/.message),format.raw/*20.52*/("""</div>
                """)))}),format.raw/*21.18*/("""
            """)))}),format.raw/*22.14*/("""

            """),format.raw/*24.13*/("""<h1>Search For Similar Media</h1>
            <link rel="stylesheet" type="text/css" href='"""),_display_(/*25.59*/routes/*25.65*/.Assets.versioned("less/main.css")),format.raw/*25.99*/("""'>
            <button class="collapsible">Search Window</button>
            <div class="content">
                Search for media similar to: <input type="text" id="search"><br>
                Filter out music: <input type="checkbox" id="filterMusic"><br>
                Filter out movies: <input type="checkbox" id="filterMovies"><br>
                Filter out TV shows: <input type="checkbox" id="filterShows"><br>
                Filter out podcasts: <input type="checkbox" id="filterPodcasts"><br>
                Filter out books: <input type="checkbox" id="filterBooks"><br>
                Filter out authors: <input type="checkbox" id="filterAuthors"><br>
                Filter out games: <input type="checkbox" id="filterGames"><br>
                <button onclick="getNodes(document.getElementById('search').value)" type="button">Search for similar media</button>
            </div>
<script type='text/javascript' src='"""),_display_(/*38.38*/routes/*38.44*/.Assets.versioned("javascripts/collapsible.js")),format.raw/*38.91*/("""'></script>

<table width="1500" height="500">
    """),format.raw/*41.22*/("""
    """),format.raw/*42.5*/("""<col width="60%">
    """),format.raw/*43.18*/("""
    """),format.raw/*44.5*/("""<col width="40%" style="background-color: lightgray;">
    <tr>
        <th><h2>Media Map</h2></th>
        <th><h2>Selected Media</h2></th>
    </tr>
    <tr>
        <td>


        <div class="cytoscape" id="cy"></div>

        </td>
        <td>
            <b>Name:</b>
            <p id="mediaDisplayName"></p>
            <b>Type:</b>
            <p id="mediaDisplayType"></p>
            <b>Description:</b>
            <p id="mediaDisplayDescription"></p>
            <h4>Wikipedia Link:</h4>
            <p id="mediaDisplayWikiLink"></p>
            <h4>Video Link</h4>
            <p id="mediaDisplayVideo"></p>
        </td>
    </tr>
</table>

<h1>Favorites</h1>
<iframe id="favoritesList" src=""""),_display_(/*72.34*/routes/*72.40*/.FavoritesController.getFavoritesList),format.raw/*72.77*/("""" height="100%" width="100%"></iframe>

"""),_display_(/*74.2*/helper/*74.8*/.form(routes.FavoritesController.openChangePasswordPage)/*74.64*/{_display_(Seq[Any](format.raw/*74.65*/("""
"""),format.raw/*75.1*/("""<button type="submit">Change Password</button>
""")))}),format.raw/*76.2*/("""

"""),_display_(/*78.2*/helper/*78.8*/.form(routes.LoginController.index)/*78.43*/{_display_(Seq[Any](format.raw/*78.44*/("""
"""),format.raw/*79.1*/("""<button type="submit">Sign Out</button>
""")))}),format.raw/*80.2*/("""

""")))}),format.raw/*82.2*/("""





"""))
      }
    }
  }

  def render(favoriteList:Seq[Media],form:Form[MediaData],filterList:Form[FilterList],selectedName:String,selectedType:String,selectedDescription:String,selectedWurl:String,selectedVurl:String,request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(favoriteList,form,filterList,selectedName,selectedType,selectedDescription,selectedWurl,selectedVurl)(request,messages)

  def f:((Seq[Media],Form[MediaData],Form[FilterList],String,String,String,String,String) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (favoriteList,form,filterList,selectedName,selectedType,selectedDescription,selectedWurl,selectedVurl) => (request,messages) => apply(favoriteList,form,filterList,selectedName,selectedType,selectedDescription,selectedWurl,selectedVurl)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 25 19:14:06 EDT 2019
                  SOURCE: C:/Development/Play/ist411-tastedive-app-testing/app/views/filterMenu.scala.html
                  HASH: bef627fc90ce46e0b8869a5e21a9709061d4874e
                  MATRIX: 651->1|1089->32|1438->285|1468->290|1493->307|1532->309|1575->325|1739->463|1753->469|1822->518|1887->557|1901->563|1965->607|2030->646|2044->652|2114->702|2180->741|2195->747|2260->791|2315->853|2357->868|2373->875|2407->900|2473->928|2519->946|2559->959|2584->963|2614->966|2644->975|2696->996|2740->1073|2782->1088|2815->1112|2855->1114|2901->1133|2914->1137|2948->1162|3035->1211|3085->1233|3118->1239|3132->1244|3157->1248|3187->1251|3201->1256|3230->1264|3286->1289|3332->1304|3376->1320|3496->1413|3511->1419|3566->1453|4543->2403|4558->2409|4626->2456|4708->2527|4741->2533|4792->2569|4825->2575|5588->3311|5603->3317|5661->3354|5730->3397|5744->3403|5809->3459|5848->3460|5877->3462|5956->3511|5987->3516|6001->3522|6045->3557|6084->3558|6113->3560|6185->3602|6220->3607
                  LINES: 24->1|29->2|34->2|36->4|36->4|36->4|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|44->12|45->13|45->13|45->13|45->13|46->14|46->14|46->14|46->14|46->14|47->15|49->17|50->18|50->18|50->18|51->19|51->19|51->19|51->19|52->20|52->20|52->20|52->20|52->20|52->20|52->20|53->21|54->22|56->24|57->25|57->25|57->25|70->38|70->38|70->38|73->41|74->42|75->43|76->44|104->72|104->72|104->72|106->74|106->74|106->74|106->74|107->75|108->76|110->78|110->78|110->78|110->78|111->79|112->80|114->82
                  -- GENERATED --
              */
          