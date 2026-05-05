# Prova A1

Agora, LEIA atentamente o Contexto a seguir:
Devido ao aumento de casos de desaparecimentos em laboratórios de
pesquisas sensíveis, o governo decidiu criar o Sistema Sentinela. Este
sistema deve registrar a entrada e saída de profissionais e verificar se o nível
de acesso deles é compatível com a sensibilidade da área em que trabalham,
visando proteger os dados sigilosos e a integridade física da equipe.
Você foi contratado para desenvolver um protótipo em Java que valide a
entrada desses profissionais.
A encomenda consiste no seguinte:
Você deverá desenvolver um programa em Java que solicite ao usuário:
1. O nome do profissional;
2. O cargo ocupado (Cientista, Engenheiro, Zelador, Administrativo);
3. O nível de acesso (de 1 a 10);
4. O nível de sigilo da área que ele deseja acessar (de 1 a 10).
A seguir, o programa deverá calcular:
1. A permissão de entrada: O acesso só é permitido se o "Nível de Acesso"
do profissional for maior ou igual ao "Nível de Sigilo" da área.
2. O sistema deve emitir um Alerta de Segurança se um profissional de
nível baixo (acesso < 3) tentar acessar uma área de sigilo alto (sigilo >
7).
Por fim, seu programa deverá imprimir:
1. O nome e cargo do profissional;
2. O resultado do acesso: "ACESSO PERMITIDO" ou "ACESSO NEGADO";

Centro Universitário UNA
Algoritmos e Programação
Programação de Soluções Computacionais
Professor Daniel Henrique Matos de Paiva
3. Caso o acesso seja permitido, imprimir o nível de autoridade (Nível de
Acesso - Nível de Sigilo);
4. Caso ocorra a tentativa de acesso de baixo nível em área alta, imprimir:
“ALERTA: Tentativa de acesso indevida detectada!”
5. Se for informado um Nível de Acesso fora do intervalo (menor que 1 ou
maior que 10), o sistema deverá imprimir:
“Erro: Nível de acesso inválido.”
Tabela de Requisitos e Critérios de Avaliação:
Código Descrição do Requisito Pontos

Req01 Entrada: Solicitar o nome e o cargo do profissional 2,0

Req02 Entrada: Solicitar o nível de acesso (1-10) 2,0

Req03 Entrada: Solicitar o nível de sigilo da área (1-10) 2,0

Req04 Validação: Impedir processamento se nível estiver fora de
1-10 2,0

Req05 Processamento:

Calcular se o Nível de Acesso >= Nível de Sigilo 5,0

Req06 Validação: Identificar se o acesso foi negado ou permitido 4,0

Centro Universitário UNA
Algoritmos e Programação
Programação de Soluções Computacionais
Professor Daniel Henrique Matos de Paiva

Código Descrição do Requisito Pontos

Req07 Validação: Regra de Alerta de Segurança (Acesso < 3 e

Sigilo > 7) 4,0

Req08 Saída: Imprimir nome e cargo do profissional 2,0

Req09 Saída: Imprimir "ACESSO PERMITIDO" ou "ACESSO

NEGADO" 2,0

Req10 Saída: Imprimir saldo de autoridade ou mensagem de

alerta 2,0

Req11 Saída: Imprimir mensagem de erro para valores fora do

intervalo 2,0

Req12 Qualidade: Código em Java e Versionamento no GitHub

(Público) 1,0

TOTAL 30,0

Centro Universitário UNA
Algoritmos e Programação
Programação de Soluções Computacionais
Professor Daniel Henrique Matos de Paiva
Testes de Validação:
Teste 1 – Acesso Permitido
• Entradas: Carl | Cientista | Acesso: 9 | Sigilo: 7
• Saída: Carl (Cientista) - ACESSO PERMITIDO. Saldo de autoridade: 2.
Teste 2 – Alerta de Segurança
• Entradas: Snyder | Zelador | Acesso: 2 | Sigilo: 8
• Saída: Snyder (Zelador) - ACESSO NEGADO.
ALERTA: Tentativa de acesso indevida detectada!
