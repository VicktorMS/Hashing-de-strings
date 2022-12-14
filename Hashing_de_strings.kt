operator fun Int?.plus(other: Int?): Int? = if (this != null && other != null) this + other else null

fun charParaNum(): MutableMap<Char, Int> {
    var i = 0
    val letraForNum = mutableMapOf('a' to 1)//
    for (letra in 'a'..'z'){
        i++
        letraForNum.put(letra, i)}
    return letraForNum}


fun palavraParaNum(palavra: String): MutableList<Int?> {
    val numbersMap = charParaNum()
    val listaDeSomas = mutableListOf<Int?>()
    var i = 0
    println("Palavra: $palavra")
    for (letra in palavra) {
        i++
        val numeroDaPalavra = numbersMap[letra]
        val calculo = numbersMap[letra]?.times(i)
        listaDeSomas.add(calculo)
        println("$letra - $numeroDaPalavra * $i = $calculo")
    }
    return listaDeSomas}


fun exibirSomasTotais(listaDeSomas: MutableList<Int?>){
    // Exibe a soma de valores
    var somaTotal: Int? = 0
    print("Soma de Todos os valores = ")
    for (valor in listaDeSomas){
        somaTotal += valor
        if (valor == listaDeSomas[0]){
            print(" $valor ")}
        else{
            print("+ $valor ") }
    }
    print("= $somaTotal \n\n")}


fun main(){
    exibirSomasTotais(palavraParaNum("cafe"))
    exibirSomasTotais(palavraParaNum("infnet"))
    exibirSomasTotais(palavraParaNum("abacaxi"))
    exibirSomasTotais(palavraParaNum("pneumoultramicroscopicosilicovulcaniconiotico"))
    exibirSomasTotais(palavraParaNum("e"))

}