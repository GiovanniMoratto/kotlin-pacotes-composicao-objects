package modelo

/**
 *@Author giovanni.moratto
 */

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}