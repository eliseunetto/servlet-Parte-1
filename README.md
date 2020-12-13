# JAVA e Servlet

## Autenticação, autorização e o padrão MVC

### Tópicos:

1. **Fundamentos da Web e a API de Servlets** \
   1.1   Apache Tomcat ou apenas Tomcat é um servidor web em Java \
   1.2   Tomcat entende o protocolo HTTP e roda por padrão no `http://localhost:8080` \
   1.3   O projeto Java faz parte da URL, no nosso caso: `http://localhost:8080/gerenciador` \
   1.4   Uma aplicação web Java pode ter páginas HTML \
   1.5   Uma servlet é um objeto Java que podemos chamar a partir de uma requisição HTTP \
   1.6   Para mapear a URL para uma servlet usamos a anotação `@WebServlet` \
   1.7   Uma servlet deve estender a classe `HttpServlet` e sobrescrever um determinado método (por exemplo `service`)

2. **Trabalhando com POST e GET** \
   2.1   Escrever uma servlet que atende apenas GET ou POST \
   2.2   Ler parâmetros da requisição dentro da servlet \
   2.3   Criar um formulário HTML usando as tags `form` e `input` \
   2.4   Enviando os dados pelo formulário através do POST \
   2.5   Diferença entre GET e POST

3. **Definindo o nosso modelo** \
   3.1   Preparamos o modelo da nossa aplicação. O modelo ou domínio são as classes que representam o mundo real, aquilo que o cliente ou usuário da aplicação define. \
   3.2   Para descobrir quais são as classes e funcionalidades do modelo o *analista de requisitos* conversa com o cliente e documenta cada funcionalidade.

4. **Páginas dinâmicas com JSP** \
   4.1   JSP significa Java Server Pages \
   4.2   JSP é uma página automaticamente processada pelo Tomcat \
   4.3   Para gerar HTML dinamicamente no JSP usamos Scriptlets \
   4.4   Um scriptlet `<% %>` é um código Java dentro do HTML \
   4.5   Um scriptlet só funciona em uma página JSP \
   4.6   Usamos o `RequestDispatcher` para chamar um JSP a partir da servlet \
   4.7   Obtemos o `RequestDispatcher` a partir do `HttpServletRequest` \
   4.8   Usamos a requisição para colocar ou pegar um atributo  (`setAttribute(.., ..)` ou `getAttribute(..)`)

5. **JSTL e Expression Language** \
   5.1   Expression Language (EL) é uma linguagem simples e limitada para imprimir o resultado de uma expressão \
   5.2   EL usa a sintaxe de `${ .. }` \
   5.3   JSTL é a biblioteca padrão de tags \
   5.4   JSTL não vem com Tomcat e precisamos copiar um JAR \
   5.5   JSTL define 4 taglibs, as mais importantes são `core` e `fmt` \
   5.6   A taglib `core` serve para controle de fluxo, `fmt` para formatação \
   5.7   É preciso importar as taglib, `core` e `fmt` separadamente:

   > <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   > <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 

   5.8   JSTL e EL devem ser usados em conjunto \
   5.9   Vimos várias tags do core como `c:if`, `c:forEach` e `c:url` \
   5.10   Da `fmt` vimos a tag `fmt:formatDate` \
   5.11   JARs ficam na pasta `WEB-INF/lib` do projeto

6. **Redirecionando o fluxo** \
   6.1   O problema de reenviar uma requisição \
   6.2   A diferença entre redirecionamento pelo cliente e servidor \
   6.3   Para redirecionar pelo navegador usamos o método `response.sendRedirect("endereço")` \
   6.4   O código de resposta para redirecionamento HTTP é 30X (301 ou 302)

7. **Completando o CRUD** \
   7.1   Como implementar a remoção de empresas \
   7.2   Como implementar a edição de empresas \
   7.3   Qual atributo correto devemos utilizar para identificação dos elementos (id) \
   7.4   Como definir um `input` escondido \
   7.5   O que significa CRUD

8. **Deploy da Aplicação** \
   8.1   A importância do web.xml \
   8.2   O que é inversão de controle \
   8.3   Como o Tomcat trabalha por debaixo dos panos \
   8.4   Como inicializar o Tomcat na linha de comando \
   8.5   Como gerar o WAR (Web ARchive) \
   8.6   Como fazemos o deploy da nossa aplicação
