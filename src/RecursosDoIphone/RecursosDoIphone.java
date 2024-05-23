package RecursosDoIphone;

public class RecursosDoIphone implements Camera,  ReprodutorDeMusica, Telefone,  Email, NavegadorSafari {

	
	public void discarNumero() {
		System.out.println("Discando Numero");
		
	}

	
	public void atenderLigacao() {
		System.out.println("Atentendo Ligacao");
		
	}

	
	public void desligarLigacao() {
		System.out.println("desligando Ligacao");
		
	}

	
	public void listarContatos() {
		System.out.println("Listando contatos");
		
	}

	
	public void criarNovoContato(String nome, String email, int numero) {
		
		System.out.println("Criando contato nome "+ nome+" email"+ email+ " numero"+numero);
		
	}

	
	public void excluirContato() {
		System.out.println("Excluindo contato");
		
	}

	
	public void tocarMusica() {
		System.out.println("Tocando musica");
		
	}

	
	public void pausarMusica() {
		System.out.println("Pausando Musica");
		
	}

	
	public void aumentarVolume() {
		System.out.println("Aumentando volume");
		
	}

	
	public void baixarVolume() {
		System.out.println("Baixando volume");
		
	}

	
	public void listarMusicas() {
		System.out.println("Listando musicas");
		
	}

	

	
	public void tirarFoto() {
		System.out.println("Tirando foto");
		
	}

	
	public void listarFoto() {
		System.out.println("Exibindo fotos na galeria");
		
	}

	
	public void estabelecerConexao() {
		System.out.println("Estabelecendo conexao com a internet");
		
	}	
	
	public void acessarPaginaWeb (String url) {
		
		System.out.println("Acessando pagina " + url);
		
	}
	
	public void abrirNovaAba() {
		
		System.out.println("Abrindo nova aba");
	}
	
	public void fecharAba() {
		
		System.out.println("Fechando aba");
	}
	
	public void atualizarPagina() {
		
		System.out.println("Atualizando pagina");
	}
	
	
	
	public void escreverEmail() {
		
		System.out.println("Escrevendo email");
	}
	
	public void enviarEmail() {
		System.out.println("Enviando email");
	}
	
	public void receberEmail() {
		
		System.out.println("Recebendo email");
	}
	
	public void exibirMapa(String tipoDoMapa) {
		
		if(tipoDoMapa.equals("normal")) {
			System.out.println("Exibindo mapa normal");
		}else if (tipoDoMapa.equals("satelite")) {
			System.out.println("Exibindo mapa satelite");
		}else {
			System.out.println("Exibindo mapa normal");
		}
		
	}
	
	public void buscarEndereco(String endereco) {
		
		System.out.println("Buscando Endereco "+ endereco);
	}
	
	public void exibirAcoesDaBolsa(String acao) {
		
		System.out.println("Exibindo ações "+acao+" na bolsa");
	}

	
	public void exibirInformacoesDeTempo(String localizacao) {
		
		System.out.println("Exibindo previsao do tempo de "+localizacao);
	}

}
