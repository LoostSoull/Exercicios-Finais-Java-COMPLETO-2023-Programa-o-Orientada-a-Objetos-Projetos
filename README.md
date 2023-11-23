# Exercicios-Finais-Java-COMPLETO-2023-Programa-o-Orientada-a-Objetos-Projetos

### Manipulando arquivos
- Ao executar o programa, vai ser solicitado que voce digite o caminho onde seu arquivo vai estar
- o programa foi criado com o intuito de ler um arquivo .csv , como passado na aula, realizando o split na virgula,sao criados objetos com os dados desse arquivo
, realizado uma operação de soma e com esse resultado, criado um novo arquivo com esses dados.


### implementando interfaces

- Exercicio ensina como implentar uma interface onde aplicamos a reutilização de codigo e desaclopamento, facilitando a manutenção

### Exercicio de fixação com Set

- Foi criado um programa simples, onde foi instanciado 3 listas, simulando que um professor da aula em três turmas, a,b e c
- cada turma voce pode selecionar o numero de alunos, cada aluno tem seu id unico,cada aluno pode fazer parte de varios cursos.
- porem ao fim, queremos saber qual o total de alunos matriculados, sem repetições, por conta disso utilizamos o hashset
- intuido desse programa é mostrar quantos alunos o professor tem matriculado em cada turma, porem excluindo o mesmo aluno em cursos diferentes, pois estamos contabilizando alunos e nao a quantidade de matriculas.

### Exercicio de fixação com Map

- Esse exercicio consistem em analisar uma lista de candidatos que receberam votos
- Voce vai consumir um arquivo digitando seu caminho, esse arquivo precisa ter o nome e quantidade de votos,separados por uma virgula,exemplo : lucas,10
- o programa vai separar os valores , um candidato tem mais de um voto,entao vao ser armazenados em um map e repassados para uma lista,armazenando somente uma chave,por nao aceitar repetições e calculando os votos do valor

### Exercicio de fixação final
-  Precisa ser  criado um arquivo de texto  com alguns dados de funcionarios, esse arquivo precisa conter nome,email e salario, separados por virgula e o salario com ponto. Exemplo: lucas,lucas@lucas.com,2000.00
-  voce vai precisar digitar o caminho onde esse arquivo se encontra na aplicação assim que executado
-  ele vai criar um objeto com esses 3 atributos, filtrar quem tem o salario acima do que foi digitado e retornar o email do colaborador.
