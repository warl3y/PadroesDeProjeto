import java.util.HashMap;

public class ViolaoCache {
    private static HashMap<String, ViolaoPrototype> cache = new HashMap<>();

    public static void carregarCache() {
        cache.put("classico", new ViolaoClassico());
        cache.put("folk", new ViolaoFolk());
        cache.put("flet", new ViolaoFlet());
        cache.put("jumbo", new ViolaoJumbo());
        cache.put("7cordas", new ViolaoSeteCordas());
        cache.put("12cordas", new ViolaoDozeCordas());
        cache.put("0", new ViolaoParlor("Zero"));
        cache.put("00", new ViolaoParlor("Duplo Zero"));
        cache.put("000", new ViolaoParlor("Triplo Zero"));
    }

    public static ViolaoPrototype obterViolao(String tipo) {
        ViolaoPrototype prototipo = cache.get(tipo);
        if (prototipo != null) {
            return prototipo.clone();
        }
        return null;
    }
}
