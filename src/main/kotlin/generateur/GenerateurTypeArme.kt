package generateur
import model.item.TypeArme

class GenerateurTypeArme(val cheminFichier: String) {
    val mapObjets = mutableMapOf<String, TypeArme>()

    val cheminCSV = Paths.get(this.cheminFichier)
    val listeObjCSV = Files.readAlllines(cheminCSV)

    for (i in 1..listeObjCSV.lastIndex) {
        val ligneObjet = listeObjCSV[i].split(";")
    }
}