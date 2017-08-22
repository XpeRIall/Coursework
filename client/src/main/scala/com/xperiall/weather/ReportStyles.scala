package com.xperiall.weather

import scalacss.Defaults._
import scalacss.StyleS

object ReportStyles extends StyleSheet.Inline {

  import dsl._

  val mainDiv: scalacss.StyleA = style(
    addClassName("col-md-12"),
    borderBottom := "1px solid #eee",
    backgroundColor(Color("#3D4048"))
  )

  val heading: scalacss.StyleA = style(
    marginBottom(5 px),
    color.rgb(220, 208, 192),
    textAlign.center
  )

  val firstSpan: scalacss.StyleA = style(
    marginLeft(20 px),
    textTransform.uppercase,
    textShadow := "2px 2px 4px #000"
  )

  val secondSpan = style(
    textShadow := "1px 1px 1px #000"
  )

  val imageCommon: StyleS = mixin(
    height(60 px),
    width(60 px)
  )

  val firstImg: scalacss.StyleA = style(imageCommon)

  val secondImg: scalacss.StyleA = style(
    imageCommon,
    marginLeft(20 px)
  )

  val secondDiv: scalacss.StyleA = style(
    addClassName("col-md-12"),
    marginTop(10 %%)
  )
  val search: scalacss.StyleA = style(
    width(60 %%),
    height(35 px),
    margin := "0% 0px 0px 16%",
    borderRadius(0 px),
    paddingLeft(5 px)
  )

  val bootstrapButton: scalacss.StyleA = style(
    addClassName("btn btn-info"),
    height(35 px),
    margin := "-1px 0px 0px 0%",
    borderRadius(0 px)
  )

  val mainContainer: scalacss.StyleA = style(
    addClassName("col-md-12 maincontainer"),
    marginTop(30 px),
    borderTop := "2px solid #ccc",
    paddingTop(30 px),
    borderBottom := "2px solid #ccc",
    paddingBottom(30 px),
    display.none
  )

  val innerDiv: scalacss.StyleA = style(
    width(530 px),
    height(400 px),
    marginLeft(60 px)
  )

  val city: scalacss.StyleA = style(
    fontSize(28 px),
    color := "#67890a",
    fontWeight.bold
  )

  val table: scalacss.StyleA = style(
    addClassName("table-bordered table-striped"),
    width(540 px),
    textAlign.center,
    marginTop(10 px)
  )

  val commonTD: StyleS = mixin(
    padding(0 px),
    fontWeight.bold
  )

  val td: scalacss.StyleA = style(
    padding(20 px)
  )

  val firstTd: scalacss.StyleA = style(
    commonTD,
    fontSize(22 px)
  )

  val secondTd: scalacss.StyleA = style(commonTD)

  val mapCanvas: scalacss.StyleA = style(
    height(430 px),
    width(512 px)
  )
}