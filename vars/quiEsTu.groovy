def call (String pseudo) {
    def store = new PseudoStore();
    def fullName = store.findNameByPseudo(pseudo)
    if(pseudo)
        echo "Trouvé ! => Tu es ${fullName}"
    else
        echo 'Pseudo non reconnu'
    }