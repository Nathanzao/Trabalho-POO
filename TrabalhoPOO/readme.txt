Considerações relevantes:
    -A função "analisaNivel" é abstrata e diz qual o nível daquele funcionario e, portanto, quanto ele deve receber a
mais no salário. Eu poderia criar uma função na classe funcionários que já analisa com base em todos os níveis, mas
achei mais tranquilo fazer dessa forma.

Ordem de classes:
    -Funcionario (classe abstrata) = contém os dados básicos de um funcionário da universidade.
        -Tecnico = tem o diferencial da área em que atua na faculdade (redes, manutenção, ...).
        -Docente (classe abstrata) = contém o diferencial de ter a área que dá aula.
