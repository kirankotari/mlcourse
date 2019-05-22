 import React,{Component,PureComponent} from 'react'
 // import articles from '../fixrutes'
 class Article extends PureComponent {
   constructor(props) {
     super(props)

     this.state = {
       isOpen: props.defaultOpen,
       count: 0
     }
   }
   // shouldComponentUpdate(nextProps,nextState) {
   //   return this.state.isOpen !== nextState.isOpen
   //
   // }
   componentWillMount() {
     console.log('---','mounting')
   }
   componentWillReceiveProps(nextProps) {
     console.log('---','mounting')
     if (nextProps.defaultOpen !== this.props.defaultOpen) this.setState({
       isOpen: nextProps.defaultOpen
     })
   }
   componentWillUpdate() {
     console.log('---','will update');
   }
   render() {
     const {article} = this.props
     // console.log('---',this.props)
     const body = this.state.isOpen && <section className="card-text">{article.text}</section>
     return (
       <div className="card" style = {{width: '50%'}}>
        <div className="card-header">
          <h2 onClick={this.incrementCounter}>
            {article.title}
            clicked {this.state.count}
            <button onClick={this.handleClick} className="btn btn-primary btn-lg float-right">{this.state.isOpen ? 'close' : 'open'}</button>
          </h2>
        </div>
        <div className = 'card-body'>
          <h6 className='card-subtitle text-muted'>
            creation date: {(new Date(article.date)).toDateString()}
          </h6>
          {body}
       </div>
       </div>
     )
 }
  handleClick= () => {
    console.log('---','clicked')
    this.setState({
      isOpen: !this.state.isOpen
    })
  }
  incrementCounter = () => {
    this.setState({
      count: this.state.count + 1
    })
  }
}
export default Article
