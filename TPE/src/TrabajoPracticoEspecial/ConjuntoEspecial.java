package TrabajoPracticoEspecial;

import java.util.*;

public class ConjuntoEspecial extends ConjuntoLibro {
    private static final int MAX = 10;
    private HashMap<String, Integer> palabras;

    public ConjuntoEspecial(int id, String titulo) {
        super(id, titulo);
        this.palabras = new HashMap<>();
    }

    private Map<String, Integer> ordenarMapa(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> listaOrdenada = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(listaOrdenada, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        Collections.reverse(listaOrdenada);
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : listaOrdenada) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    @Override
    public Set<String> getPalabraClaves() {
        HashSet<String> aux = new HashSet<>();
        for(Biblioteca b: this.getGrupos()) {
            for (String s: b.getPalabraClaves()) {
                if (this.palabras.containsKey(s)) {
                    this.palabras.replace(s, this.palabras.get(s) + 1);
                } else
                    this.palabras.put(s, 1);
            }
        }
        Map<String, Integer> mapaOrdenado = new LinkedHashMap<>(this.ordenarMapa(palabras));
        Iterator it = mapaOrdenado.entrySet().iterator();
        int i = 0;
        while(i < MAX) {
            if (it.hasNext()) {
                Map.Entry<String, Integer> palabra = (Map.Entry)it.next();
                aux.add(palabra.getKey());
                i++;
            }
        }
        return aux;
    }
}

