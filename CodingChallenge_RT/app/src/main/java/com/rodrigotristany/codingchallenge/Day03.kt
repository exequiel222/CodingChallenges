package com.rodrigotristany.codingchallenge

fun serialize(node : MyNode) : String {
    var result : String = ""
    result += node.value
    if(node.left != null) {
        result += ","
        result += serialize(node.left!!)
    }
    if(node.right != null) {
        result += ","
        result  += serialize(node.right!!)
    }
    return result
}

fun deserialize(string : String) : MyNode {
    if(string == "root"){
        return MyNode("root")
    }
    var myNode = MyNode("")
    var stringArray = string.split(",", limit = 2)
    myNode.value = stringArray[0]
    if(stringArray.size > 1){
        var (_,tail) = stringArray
        if(tail != null) {

            if(tail.startsWith("left")) {
                myNode.left = deserialize(tail)
            }else if(tail.startsWith("right")) {
                myNode.right = deserialize(tail)
            }
        }
    }
    return myNode
}



class MyNode(var value: String, var left:MyNode? = null, var right:MyNode? = null)