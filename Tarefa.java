class Tarefa {
  constructor(titulo, descricao, prazo, prioridade) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.prazo = prazo;
    this.prioridade;
  }
  setTitulo(novoTitulo) {
    this.titulo = novoTitulo;
  }
  getTitulo() {
    return this.titulo;
  }
}
