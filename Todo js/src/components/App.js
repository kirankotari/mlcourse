import React, {Component}  from 'react'
import Article from './Article'
import ArticleList from './ArticleList/index'
import articles from '../fixrutes'
import 'bootstrap/dist/css/bootstrap.css'
class App extends Component {
  state = {
    reverted: false
  }
  articles = articles.slice();
  render() {
    console.log('---',2,this.state,articles.map(article => article.id))
    return (
      <div className='container'>
      <div className='jumbotron'>
        <h1 className='display-3'>
          App name
          <button className="btn" onClick = {this.revert}>Revert</button>
        </h1>
      </div>
        <ArticleList articles = {this.state.reverted ? articles.slice().reverse() : articles} />
      </div>
    )
  }
    revert = () => {
      this.articles.reverse()
      this.setState({
      reverted: !this.state.reverted
    })
  }
}

export default App
