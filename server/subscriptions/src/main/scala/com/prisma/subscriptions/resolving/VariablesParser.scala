package com.prisma.subscriptions.resolving

import spray.json._

object VariablesParser {
  def parseVariables(str: String): JsObject = {
    str.parseJson.asJsObject()
  }
}
