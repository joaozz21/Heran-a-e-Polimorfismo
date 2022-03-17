fun main() {
    val preguica = Preguica("Afonso", 21)
    val cavalo = Cavalo("pocoto", 33)
    val cachorro = Cachorro("Max", 15)

    preguica.emitirSom()
    cavalo.emitirSom()
    cachorro.emitirSom()

    preguica.subirEmArvore()
    cavalo.correr()
    cachorro.correr()
}