# HaisuuPiece

Um plugin de utilidades customizado para o servidor de Minecraft HaisuuPiece.

## 📜 Descrição

HaisuuPiece é um plugin simples projetado para fornecer comandos essenciais para os jogadores do servidor. Ele oferece acesso rápido a links importantes como o Discord do servidor, o site e o pacote de texturas. Também inclui um comando administrativo para gerenciamento.

## ✨ Funcionalidades

*   **Mensagens Customizáveis:** Todas as respostas dos comandos podem ser facilmente configuradas no `config.yml`.
*   **Prefixo Configurável:** Defina um prefixo global para todas as mensagens do plugin.
*   **Comandos Simples:** Comandos fáceis de lembrar com múltiplos aliases.
*   **Controle por Permissão:** Comandos protegidos por permissões para controlar o acesso.

## ⚙️ Comandos e Permissões

| Comando         | Descrição                               | Permissão  | Aliases                                                 |
| --------------- | --------------------------------------- | ---------- | ------------------------------------------------------- |
| `/discord`      | Envia o link do Discord do servidor.    | `hp.basic` | `disc`, `dc`                                            |
| `/site`         | Envia o link do site do servidor.       | `hp.basic` | `website`                                               |
| `/textura`      | Envia o link da textura do servidor.    | `hp.basic` | `texture`, `resource`, `resourcepack`, `rp`, `texturepack` |
| `/hp`           | Comando principal para administradores. | `hp.admin` | `haisuupiece`, `haisuup`, `hpiece`                        |

## 🔧 Configuração

A configuração do plugin pode ser encontrada em `plugins/HaisuuPiece/config.yml`.

```yaml
# HaisuuPiece Configuration

# Prefixo para todas as mensagens do plugin.
# Você pode usar códigos de cores do Minecraft com '&'.
prefix: '&b&l[HaisuuPiece]&r '

# Mensagens para cada comando.
messages:
  discord: 'Link do Discord: www.discord.com/seu-servidor'
  textura: 'Link da textura: www.seusite.com/textura'
  site: 'Site oficial: www.seusite.com'
  unknown-command: 'Comando desconhecido.'
```

## 📦 Instalação

1.  Baixe a versão mais recente do plugin.
2.  Coloque o arquivo `HaisuuPiece-X.X.X.jar` na pasta `plugins` do seu servidor.
3.  Reinicie ou recarregue o seu servidor.

## 🛠️ Compilando o Projeto

Para compilar o plugin a partir do código-fonte, você precisará do Maven e do JDK 8 ou superior.

1.  Clone o repositório: `git clone <url-do-repositorio>`
2.  Navegue até o diretório do projeto: `cd HaisuuPiece`
3.  Execute o comando de build do Maven: `mvn clean package`

O arquivo JAR compilado estará localizado no diretório `target`.