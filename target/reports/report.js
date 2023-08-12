$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("descontos.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Receber o cupom desconto da qazando",
  "description": "Eu como usuario da qazando\nquero receber um cupom de desconto\npara comprar um curso com valor reduzido",
  "id": "receber-o-cupom-desconto-da-qazando",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 9,
  "name": "Visualizar codigo de desconto",
  "description": "",
  "id": "receber-o-cupom-desconto-da-qazando;visualizar-codigo-de-desconto",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 8,
      "name": "@gerar-cupom"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que estou no site da qazando",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "preencho meu email",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "clico em ganhar cupom",
  "keyword": "E "
});
formatter.step({
  "line": 13,
  "name": "vejo o codigo de desconto",
  "keyword": "Entao "
});
formatter.match({
  "location": "DescontosStep.acessar_site_qazando()"
});
formatter.result({
  "duration": 4715469305,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.preencho_meu_email()"
});
formatter.result({
  "duration": 2274459681,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.clico_em_ganhar_cupom()"
});
formatter.result({
  "duration": 341094829,
  "status": "passed"
});
formatter.match({
  "location": "DescontosStep.vejo_o_codigo_de_desconto()"
});
formatter.result({
  "duration": 60354367,
  "status": "passed"
});
});