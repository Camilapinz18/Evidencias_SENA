import './App.css';
import Banner from './Components/Banner/Banner';
import Header from './Components/Header/Header.jsx'
import Services from './Components/Services/Services';
import Productions from './Components/Productions/Productions.jsx'
import Contact from './Components/Contact/Contact.jsx'
import Footer from './Components/Footer/Footer.jsx'

function App() {
  return (
    <div className="App">
      <>
        <Header/>
        <Banner/>
        <Services/>
        <Productions/>
        <Contact/>
        <Footer/>
      </>
    </div>
  );
}

export default App;
