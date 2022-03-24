package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class PageService {
    public String buildRegistrationPage() {
        String rawContent = "<html>\n" +
                "<head>\n" +
                "    <!-- Metadados -->\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n" +
                "\n" +
                "    <!-- CSS -->\n" +
                "    <style>\n" +
                "            ${STYLES}\n" +
                "     </style>\n" +
                "\n" +
                "    <!-- Título da página (aparece na aba) -->\n" +
                "    <title>Cadastro</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<!-- Cabeçalho com título e subtítulo (ambos com css de id \"titulo\") -->\n" +
                "<div>\n" +
                "    <h1 id=\"titulo\">Cadastro de Cargo</h1>\n" +
                "    <p id=\"subtitulo\">Complete suas informações</p>\n" +
                "    <br>\n" +
                "</div>\n" +
                "\n" +
                "<!-- Início do formulário -->\n" +
                "<form>\n" +
                "\n" +
                "    <fieldset class=\"grupo\">\n" +
                "        <!-- Campo do nome com legenda \"nome\" e css de classe \"campo\" -->\n" +
                "        <div class=\"campo\">\n" +
                "            <label for=\"nickname\"><strong>Nickname</strong></label>\n" +
                "            <input type=\"text\" name=\"nickname\" id=\"nickname\" required>\n" +
                "        </div>\n" +
                "\n" +
                "        <!-- Campo do sobrenome com legenda \"sobrenome\" e css de classe \"campo\" -->\n" +
                "        <div class=\"campo\">\n" +
                "            <label for=\"id\"><strong>Id</strong></label>\n" +
                "            <input type=\"text\" name=\"id\" id=\"id\" required>\n" +
                "        </div>\n" +
                "    </fieldset>\n" +
                "    <!-- Campo de desenvolvimento web com 3 opções de botões selecionáveis (radio button) e css de classe \"campo\" -->\n" +
                "    <div class=\"campo\">\n" +
                "        <label><strong>Qual horário preferivelmente você programa?</strong></label>\n" +
                "        <label>\n" +
                "            <input type=\"radio\" name=\"devweb\" value=\"Manha\" checked>Manhã\n" +
                "        </label>\n" +
                "        <label>\n" +
                "            <input type=\"radio\" name=\"devweb\" value=\"Tarde\">Tarde\n" +
                "        </label>\n" +
                "        <label>\n" +
                "            <input type=\"radio\" name=\"devweb\" value=\"Noon\">Meio-Cargo(Trabalham em curto período, mas sua responsabilidade responder tudo na hora)\n" +
                "        </label>\n" +
                "    </div>\n" +
                "\n" +
                "    <!-- Campo de senioridade com 3 opções para escolha (select option) e css de classe \"campo\" -->\n" +
                "    <div class=\"campo\">\n" +
                "        <label for=\"senioridade\"><strong>Nivel de experiência</strong></label>\n" +
                "        <select id=\"senioridade\" required>\n" +
                "            <option selected disabled value=\"\">Selecione</option>\n" +
                "            <option>Novato</option>\n" +
                "            <option>Experiente</option>\n" +
                "            <option>Mestre</option>\n" +
                "        </select>\n" +
                "    </div>\n" +
                "\n" +
                "    <fieldset class=\"grupo\">\n" +
                "        <!-- Campo de tecnologias para escolha de 1 ou mais opções para marcar (checkbox) e css de classe \"campo\" -->\n" +
                "        <div id=\"check\">\n" +
                "            <label><strong>Selecione as tecnologias que utiliza:</strong></label><br><br>\n" +
                "            <input type=\"checkbox\" id=\"tecnologia1\" name=\"tecnologia1\" value=\"Developer de Bots\">\n" +
                "            <label for=\"tecnologia1\"> Developer de Bots</label>\n" +
                "            <input type=\"checkbox\" id=\"tecnologia2\" name=\"tecnologia2\" value=\"Jornalista\">\n" +
                "            <label for=\"tecnologia2\"> Jornalista</label>\n" +
                "            <input type=\"checkbox\" id=\"tecnologia3\" name=\"tecnologia3\" value=\"Administrador de dados(EXCEL)\">\n" +
                "            <label for=\"tecnologia3\"> Administrador de dados(EXCEL)</label>\n" +
                "            <input type=\"checkbox\" id=\"tecnologia4\" name=\"tecnologia4\" value=\"Administrador de denúncias\">\n" +
                "            <label for=\"tecnologia4\"> Administrador de denúncias</label>\n" +
                "            <input type=\"checkbox\" id=\"tecnologia5\" name=\"tecnologia5\" value=\"Comunicador\">\n" +
                "            <label for=\"tecnologia5\"> Comunicador</label>\n" +
                "            <input type=\"checkbox\" id=\"tecnologia6\" name=\"tecnologia6\" value=\"Desenvolvedor de dados\">\n" +
                "            <label for=\"tecnologia6\"> Desenvolvedor de dados</label>\n" +
                "            <input type=\"checkbox\" id=\"tecnologia7\" name=\"tecnologia7\" value=\"Moderador de estatísticas\">\n" +
                "            <label for=\"tecnologia7\"> Moderador de estatísticas</label>\n" +
                "        </div>\n" +
                "    </fieldset>\n" +
                "\n" +
                "    <!-- Caixa de texto -->\n" +
                "    <div class=\"campo\">\n" +
                "        <br>\n" +
                "        <label for=\"experiencia\"><strong>Conte um pouco mais da sua experiência: </strong></label>\n" +
                "        <textarea rows=\"6\" style=\"width: 26em\" id=\"experiencia\" name=\"experiencia\"></textarea>\n" +
                "    </div>\n" +
                "\n" +
                "    <!-- Botão para enviar o formulário -->\n" +
                "    <button class=\"botao\" type=\"submit\" onsubmit=\"\">Concluído</button>\n" +
                "\n" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "</html>"
                ;
        return rawContent.replace("${STYLES}",buildRegistrationCss());
    }

    private String buildRegistrationCss() {
        return "/* Todos os elementos da página */\n" +
                "* {\n" +
                "    margin: 0;\n" +
                "    padding: 0;\n" +
                "}\n" +
                "\n" +
                "/* Elementos com o ID \"titulo\" */\n" +
                "#titulo {\n" +
                "    font-family: sans-serif;\n" +
                "    color: #380B61;\n" +
                "    margin-left: 7%;\n" +
                "} \n" +
                "\n" +
                "/* Elementos com o ID \"subtitulo\" */\n" +
                "#subtitulo {\n" +
                "    font-family: sans-serif;\n" +
                "    color: #380B61;\n" +
                "    margin-left: 10%;\n" +
                "} \n" +
                "\n" +
                "#check{\n" +
                "    display: inline-block;\n" +
                "}\n" +
                "\n" +
                "/* Elementos de tag <fieldset>*/\n" +
                "fieldset {\n" +
                "    border: 0;\n" +
                "}\n" +
                "\n" +
                "/* Elemento de tag <body> */\n" +
                "body{\n" +
                "    background-color: #F0F8FF;\n" +
                "    font-family: sans-serif;\n" +
                "    font-size: 1em;\n" +
                "    color: #59429d;\n" +
                "    margin-left: 36%;\n" +
                "    margin-top: 2%;\n" +
                "    justify-content: center;\n" +
                "}\n" +
                "\n" +
                "/* Elementos de tags <body>, <input>, <Select>, <textarea> e <button> */\n" +
                "input, select, textarea, button {\n" +
                "    font-family: sans-serif;\n" +
                "    font-size: 1em;\n" +
                "    color: #59429d;\n" +
                "    border-radius: 5px;\n" +
                "}\n" +
                "\n" +
                "/* Elementos de classe \"grupo\" nos estados das pseudoclasses \"before\" e \"after\" */\n" +
                ".grupo:before, .grupo:after {\n" +
                "    display: table;\n" +
                "}\n" +
                "\n" +
                "/* Elementos de classe \"grupo\" no estado da pseudoclasse \"after\" */\n" +
                ".grupo:after {\n" +
                "    clear: both;\n" +
                "}\n" +
                "\n" +
                "/* Elementos de classe \"campo\" */\n" +
                ".campo {\n" +
                "    margin-bottom: 1em;\n" +
                "}\n" +
                "\n" +
                "/* Elementos de classe \"campo\" de tag <label> */\n" +
                ".campo label {\n" +
                "    margin-bottom: 0.2em;\n" +
                "    color: #59429d;\n" +
                "    display: block;\n" +
                "}\n" +
                "\n" +
                "/* Elementos de classe \"campo\" ou \"grupo\" de tag <fieldset> */\n" +
                "fieldset.grupo .campo {\n" +
                "    float:  left;\n" +
                "    margin-right: 1em;\n" +
                "}\n" +
                "\n" +
                "/* Elementos de classe \"campo\" das tags <input> com atributo text e email, da tag <select> e da tag <textarea>*/\n" +
                ".campo input[type=\"text\"], .campo input[type=\"email\"], .campo select, .campo textarea {\n" +
                "    padding: 0.2em;\n" +
                "    border: 1px solid #59429d;\n" +
                "    box-shadow: 2px 2px 2px rgba(0,0,0,0.2);\n" +
                "    display: block;\n" +
                "}\n" +
                "\n" +
                "/* Elementos de classe \"campo\" de tag <select> e <option>*/\n" +
                ".campo select option {\n" +
                "    padding-right: 1em;\n" +
                "}\n" +
                "\n" +
                "/* Elemento de classe \"campo\" com tag <input>, <select> e <textarea> tocas com estado da pseudoclasse \"focus\"*/\n" +
                ".campo input:focus, .campo select:focus, .campo textarea:focus {\n" +
                "    background: #E0E0F8;\n" +
                "}\n" +
                "\n" +
                "/* Elemento de classe \"botao\" */\n" +
                ".botao {\n" +
                "    font-size: 1.2em;\n" +
                "    background: #59429d;\n" +
                "    border: 0;\n" +
                "    margin-bottom: 1em;\n" +
                "    color: #ffffff;\n" +
                "    padding: 0.2em 0.6em;\n" +
                "    box-shadow: 2px 2px 2px rgba(0,0,0,0.2);\n" +
                "    text-shadow: 1px 1px 1px rgba(0,0,0,0.5);\n" +
                "    position: absolute;\n" +
                "    top: 90%;\n" +
                "    left: 50%;\n" +
                "    margin-right: -50%;\n" +
                "    transform: translate(-50%, -50%)\n" +
                "}\n" +
                "\n" +
                "/* Elemento de classe \"botao\" com o estado da pseudoclasse \"hover\" */\n" +
                ".botao:hover {\n" +
                "    background: #CCBBFF;\n" +
                "    box-shadow: inset 2px 2px 2px rgba(0,0,0,0.2);\n" +
                "    text-shadow: none;\n" +
                "}\n" +
                "\n" +
                "/* Elementos de classe botão e de tag <select> */\n" +
                ".botao, select{\n" +
                "    cursor: pointer;\n" +
                "}";
    }
}
